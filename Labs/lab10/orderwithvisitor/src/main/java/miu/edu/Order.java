package miu.edu;

import java.util.ArrayList;
import java.util.List;

public abstract class Order {
    protected String date;
    protected double amount;
    protected String state;
    protected List<Orderline> orderlines;

    public Order(String date, double amount, String state) {
        this.date = date;
        this.amount = amount;
        this.state = state;
        this.orderlines = new ArrayList<>();
    }

    public abstract void accept(Visitor visitor);
}