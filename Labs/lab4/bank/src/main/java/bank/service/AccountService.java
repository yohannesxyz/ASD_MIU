package bank.service;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.Account;
import bank.domain.Customer;

import java.util.Collection;


public class AccountService extends Subject implements IAccountService {
	private IAccountDAO accountDAO;
	private Account lastAccount;
	private Subject accountCreationSubject;
	

	
	public AccountService(Subject accountCreationSubject){
		accountDAO=new AccountDAO();
		this.accountCreationSubject = accountCreationSubject;
	}

	public Account createAccount(long accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		accountDAO.saveAccount(account);
		lastAccount = account;
		accountCreationSubject.donotify();
		return account;
	}

	public void deposit(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		accountDAO.updateAccount(account);
		donotify();
	}

	public Account getAccount(long accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);
		donotify();
	}



	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);

		lastAccount = fromAccount;
		donotify();
		lastAccount = toAccount;
		donotify();
	}

	public Account getLastCreatedOrAccessedAccount() {
		return lastAccount;
	}

}
