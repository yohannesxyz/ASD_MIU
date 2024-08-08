package com.products;

import com.order.Order;
import com.order.OrderPlacedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductDAO productDAO;

    public void addProduct(int productNumber, String name, double price) {
        productDAO.save(new Product(productNumber, name, price));
    }

    public Product getProduct(int productNumber) {
        return productDAO.find(productNumber);
    }

    public void removeProduct(int productNumber) {
        productDAO.remove(productNumber);
    }

//    @Autowired
//    public void setProductDAO(ProductDAO productDAO) {
//        this.productDAO = productDAO;
//    }

    @EventListener
    public void updateProductQuantityAfterOrder(OrderPlacedEvent event) {
        Order placedOrder = event.getOrder();
        placedOrder.getOrderlines().forEach(orderline -> {
            Product updatedProduct = orderline.getProduct().reduceStockAfterOrder(orderline.getQuantity());
            this.productDAO.save(updatedProduct);
        });
    }
}
