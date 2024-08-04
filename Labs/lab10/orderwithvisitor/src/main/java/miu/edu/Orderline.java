package miu.edu;

public class Orderline {
    private int quantity;
    private Product product;

    public Orderline(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }
}