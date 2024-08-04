package miu.edu;

public class TVOrderVisitor implements Visitor {
    private int tvCount;

    public TVOrderVisitor() {
        this.tvCount = 0;
    }

    @Override
    public void visit(InternalOrder internalOrder) {
        countTVs(internalOrder);
    }

    @Override
    public void visit(IndividualOrder individualOrder) {
        countTVs(individualOrder);
    }

    @Override
    public void visit(CorporateOrder corporateOrder) {
        countTVs(corporateOrder);
    }

    private void countTVs(Order order) {
        for (Orderline orderline : order.orderlines) {
            if (orderline.getProduct().getName().equalsIgnoreCase("TV")) {
                tvCount += orderline.getQuantity();
            }
        }
    }

    public int getTvCount() {
        return tvCount;
    }
}