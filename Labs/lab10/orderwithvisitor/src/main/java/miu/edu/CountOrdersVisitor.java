package miu.edu;

public class CountOrdersVisitor implements Visitor {
    private int internalCount;
    private int individualCount;
    private int corporateCount;

    public CountOrdersVisitor() {
        this.internalCount = 0;
        this.individualCount = 0;
        this.corporateCount = 0;
    }

    @Override
    public void visit(InternalOrder internalOrder) {
        internalCount++;
    }

    @Override
    public void visit(IndividualOrder individualOrder) {
        individualCount++;
    }

    @Override
    public void visit(CorporateOrder corporateOrder) {
        corporateCount++;
    }

    public int getInternalCount() {
        return internalCount;
    }

    public int getIndividualCount() {
        return individualCount;
    }

    public int getCorporateCount() {
        return corporateCount;
    }
}