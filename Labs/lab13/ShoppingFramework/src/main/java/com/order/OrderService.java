package com.order;

import com.shopping.Cartitem;
import com.shopping.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    OrderDAO orderDAO;
    EmailSender emailSender;

    ApplicationEventPublisher publisher;

    public void createOrder(ShoppingCart shoppingCart, int ordernumber) {
        Order order = new Order(ordernumber);
        for (Cartitem cartitem : shoppingCart.getCartlist()) {
            order.addOrderLine(new Orderline(cartitem.getProduct(), cartitem.getQuantity()));
        }
        orderDAO.save(order);
    }

    public Order getOrder(int ordernumber) {
        return orderDAO.find(ordernumber);
    }

    public void saveOrder(Order order) {
        orderDAO.save(order);
    }

    public void placeOrder(int ordernumber) {
        Order order = getOrder(ordernumber);
        emailSender.sendEmail(order.getCustomer().getEmail(), "Thank for your order with ordernumber " + order.getOrdernumber());
        publisher.publishEvent(new OrderPlacedEvent(order));
    }

    @Autowired
    public void setOrderDAO(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    @Autowired
    public void setEmailSender(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    @Autowired
    public void setPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }
}
