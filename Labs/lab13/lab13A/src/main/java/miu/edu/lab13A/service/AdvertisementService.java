package miu.edu.lab13A.service;

import miu.edu.lab13A.events.NewCustomerEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class AdvertisementService {

    @EventListener
    public void newCustomerListener(NewCustomerEvent event) {
        System.out.println("AdvertisementService received a new customer event. Customer info:");
        System.out.println(event.getNewCustomer());
    }
}
