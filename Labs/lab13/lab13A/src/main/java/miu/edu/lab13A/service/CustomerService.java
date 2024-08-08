package miu.edu.lab13A.service;


import miu.edu.lab13A.domain.Address;
import miu.edu.lab13A.domain.Customer;
import miu.edu.lab13A.integration.EmailSender;
import miu.edu.lab13A.repository.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Autowired
    private EmailSender emailSender;

    @Autowired
    public ApplicationEventPublisher publisher;


    public void addCustomer(String name, String email, String Street,String city, String zip) {
        Customer customer = new Customer(name, email, new Address(Street, city, zip));
        customerDAO.save(customer);
        emailSender.sendEmail(email, "Welcome " + name + " to our company");
        publisher.publishEvent(new NewCustomerEvent(name, email));
    }

}
