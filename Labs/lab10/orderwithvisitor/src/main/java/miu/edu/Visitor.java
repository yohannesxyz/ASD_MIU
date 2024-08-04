package miu.edu;

public interface Visitor {
    void visit(InternalOrder internalOrder);
    void visit(IndividualOrder individualOrder);
    void visit(CorporateOrder corporateOrder);
}