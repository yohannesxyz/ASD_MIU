package bank.service;

import bank.domain.Account;
import bank.integration.Observer;

import java.util.Collection;

public interface IAccountService {
    Account createAccount(long accountNumber, String customerName);
    Account getAccount(long accountNumber);
    Collection<Account> getAllAccounts();
    void deposit (long accountNumber, double amount);
    void withdraw (long accountNumber, double amount);
    void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description);
	void addObserver(Observer observer);
    Account getLastCreatedOrAccessedAccount();
}
