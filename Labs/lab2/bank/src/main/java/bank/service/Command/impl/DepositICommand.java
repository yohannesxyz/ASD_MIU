package bank.service.Command.impl;

import bank.service.Command.ICommand;
import bank.service.AccountService;
import bank.service.IAccountService;

public class DepositICommand implements ICommand {
    private long accountNumber;
    private double amount;
    private IAccountService accountService ;

    public DepositICommand(long accountNumber, double amount, IAccountService accountService) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.accountService = accountService;
    }


    @Override
    public void execute() {
        accountService.deposit(accountNumber, amount);
    }

    @Override
    public void unExecute() {
    accountService.withdraw(accountNumber, amount);
    }
}
