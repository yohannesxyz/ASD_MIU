package bank.service;

import bank.dao.IAccountDAO;
import bank.domain.Account;
import bank.domain.Customer;
import bank.email.IEmailSender;
import bank.factory.BankFactory;
import bank.factory.MyFactory;

import java.util.Collection;


public class AccountService implements IAccountService {
	private IAccountDAO accountDAO;
	private IEmailSender emailSender;

	
	public AccountService(){
		
		BankFactory bankFactory = new BankFactory();
		MyFactory factory = bankFactory.getFactoryInstance();
		
		accountDAO  = factory.getAccountDAO();
		emailSender  = factory.getEmailSender();

	}

	public Account createAccount(long accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		accountDAO.saveAccount(account);
		return account;
	}

	public void deposit(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		accountDAO.updateAccount(account);
		emailSender.send("Account with accountnumber "+accountNumber+" has been changed");
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
		emailSender.send("Account with accountnumber "+accountNumber+" has been changed");
	}



	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
		emailSender.send("Account with accountnumber "+fromAccountNumber+" has been changed");
		emailSender.send("Account with accountnumber "+toAccountNumber+" has been changed");
	}
}
