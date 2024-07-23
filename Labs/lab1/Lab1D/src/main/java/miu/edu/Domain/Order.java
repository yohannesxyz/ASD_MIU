package miu.edu.Domain;

public class Order {

    private int orderId;
    private String orderDate;
    private String orderStatus;
    private Address shippingAddress;
    private Address billingAddress;
    private Customer customer;
    private BookCopy bookCopy;
    private ShoppingCart shoppingCart;

    public Order(int orderId, String orderDate, String orderStatus, Address shippingAddress, Address billingAddress,  Customer customer, BookCopy bookCopy, ShoppingCart shoppingCart) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.shippingAddress = shippingAddress;
        this.customer = customer;
        this.bookCopy = bookCopy;
        this.billingAddress = billingAddress;
        this.shoppingCart = shoppingCart;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BookCopy getBookCopy() {
        return bookCopy;
    }

    public void setBookCopy(BookCopy bookCopy) {
        this.bookCopy = bookCopy;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderDate='" + orderDate + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", shippingAddress=" + shippingAddress +
                ", customer=" + customer +
                ", bookCopy=" + bookCopy +
                '}';
    }
}
