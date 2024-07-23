package miu.edu.Domain;

public class ShoppingCart {
    private int id;
    private int quantity;
    private double price;
    private BookCopy bookCopy;
    private Order order;

    public ShoppingCart(int id, int quantity, double price, BookCopy bookCopy, Order order) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.bookCopy = bookCopy;
        this.order = order;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public BookCopy getBookCopy() {
        return bookCopy;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBookCopy(BookCopy bookCopy) {
        this.bookCopy = bookCopy;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" + "id=" + id + ", quantity=" + quantity + ", price=" + price + ", bookCopy=" + bookCopy + ", order=" + order + '}';
    }
}
