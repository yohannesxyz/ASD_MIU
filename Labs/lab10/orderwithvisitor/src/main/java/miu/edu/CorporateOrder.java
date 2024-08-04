package miu.edu;

public class CorporateOrder extends Order {
    private String company;
    private String contact;

    public CorporateOrder(String date, double amount, String state, String company, String contact) {
        super(date, amount, state);
        this.company = company;
        this.contact = contact;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}