package bank.service.Command.impl;

import bank.service.AccountService;
import bank.service.Command.ICommand;
import bank.service.IAccountService;

public class WithdrawICommand implements ICommand {
    private long accountNumber;
    private double amount;
    private IAccountService accountService ;

    public WithdrawICommand(long accountNumber, double amount, IAccountService accountService) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.accountService = accountService;
    }
    @Override
    public void execute() {
        accountService.withdraw(accountNumber, amount);
    }

    @Override
    public void unExecute() {
        accountService.deposit(accountNumber, amount);
    }
}
