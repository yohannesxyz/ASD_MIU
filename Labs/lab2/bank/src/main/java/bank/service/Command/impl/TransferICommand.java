package bank.service.Command.impl;

import bank.service.AccountService;
import bank.service.Command.ICommand;
import bank.service.IAccountService;

public class TransferICommand implements ICommand {

    private long fromAccountNumber;
    private long toAccountNumber;
    private double amount;
    private String description;
    private IAccountService accountService ;

    public TransferICommand(long fromAccountNumber, long toAccountNumber, double amount, String description, IAccountService accountService) {
        this.fromAccountNumber = fromAccountNumber;
        this.toAccountNumber = toAccountNumber;
        this.amount = amount;
        this.description = description;
        this.accountService = accountService;
    }

    @Override
    public void execute() {
       accountService.transferFunds(fromAccountNumber, toAccountNumber, amount, description);
    }

    @Override
    public void unExecute() {
     accountService.transferFunds(toAccountNumber, fromAccountNumber, amount, description);
    }
}
