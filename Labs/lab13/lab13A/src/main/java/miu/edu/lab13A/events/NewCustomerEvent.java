package miu.edu.lab13A.events;

import customers.domain.Customer;
import lombok.Getter;

@Getter
public class NewCustomerEvent {
    Customer newCustomer;

    public NewCustomerEvent(Customer customer) {
        this.newCustomer = customer;
    }

}
