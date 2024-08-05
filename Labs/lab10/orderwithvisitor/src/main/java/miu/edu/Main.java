package miu.edu;

public class Main {
    public static void main(String[] args) {
        OrderCollection orderCollection = new OrderCollection();

        Product tv = new Product("TV", 500);
        Product laptop = new Product("Laptop", 1000);

        InternalOrder internalOrder = new InternalOrder("2024-08-04", 1500, "CA", "HR");
        internalOrder.orderlines.add(new Orderline(1, tv));
        internalOrder.orderlines.add(new Orderline(1, laptop));

        IndividualOrder individualOrder = new IndividualOrder("2024-08-04", 2000, "NY", "John Doe");
        individualOrder.orderlines.add(new Orderline(2, tv));

        CorporateOrder corporateOrder = new CorporateOrder("2024-08-04", 3000, "TX", "ABC Corp", "Jane Smith");
        corporateOrder.orderlines.add(new Orderline(3, tv));

        orderCollection.addOrder(internalOrder);
        orderCollection.addOrder(individualOrder);
        orderCollection.addOrder(corporateOrder);

        CountOrdersVisitor countOrdersVisitor = new CountOrdersVisitor();
        orderCollection.accept(countOrdersVisitor);
        System.out.println("Internal Orders: " + countOrdersVisitor.getInternalCount());
        System.out.println("Individual Orders: " + countOrdersVisitor.getIndividualCount());
        System.out.println("Corporate Orders: " + countOrdersVisitor.getCorporateCount());

        TotalAmountVisitor totalAmountVisitor = new TotalAmountVisitor();
        orderCollection.accept(totalAmountVisitor);
        System.out.println("Total Amount: " + totalAmountVisitor.getTotalAmount());

        TVOrderVisitor tvOrderVisitor = new TVOrderVisitor();
        orderCollection.accept(tvOrderVisitor);
        System.out.println("TVs Ordered: " + tvOrderVisitor.getTvCount());
    }

}