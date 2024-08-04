package miu.edu;

public class TotalAmountVisitor implements Visitor {
    private double totalAmount;

    public TotalAmountVisitor() {
        this.totalAmount = 0;
    }

    @Override
    public void visit(InternalOrder internalOrder) {
        totalAmount += internalOrder.amount;
    }

    @Override
    public void visit(IndividualOrder individualOrder) {
        totalAmount += individualOrder.amount;
    }

    @Override
    public void visit(CorporateOrder corporateOrder) {
        totalAmount += corporateOrder.amount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
