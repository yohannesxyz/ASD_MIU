package miu.edu;

public class InternalOrder extends Order {
    private String department;

    public InternalOrder(String date, double amount, String state, String department) {
        super(date, amount, state);
        this.department = department;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}