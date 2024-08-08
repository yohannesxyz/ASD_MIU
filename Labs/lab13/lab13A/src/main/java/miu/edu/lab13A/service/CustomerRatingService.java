package miu.edu.lab13A.service;


import miu.edu.lab13A.events.NewCustomerEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class CustomerRatingService {

    @EventListener
    public void newCustomerListener(NewCustomerEvent event) {
        System.out.println("CustomerRatingService received a new customer event. Customer info:");
        System.out.println(event.getNewCustomer());
    }
}
