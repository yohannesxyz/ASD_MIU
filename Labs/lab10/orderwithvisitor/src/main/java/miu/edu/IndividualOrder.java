package miu.edu;

public class IndividualOrder extends Order {
    private String name;

    public IndividualOrder(String date, double amount, String state, String name) {
        super(date, amount, state);
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
