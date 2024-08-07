package miu.edu.lab12Part3.service;

import miu.edu.lab12Part3.integration.EmailSender;
import miu.edu.lab12Part3.domain.Address;
import miu.edu.lab12Part3.domain.Customer;
import miu.edu.lab12Part3.repository.ICustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private ICustomerDAO customerDAO;

    @Autowired
    private EmailSender emailSender;


    public void addCustomer(String name, String email, String Street,String city, String zip) {
        Customer customer = new Customer(name, email, new Address(Street, city, zip));
        customerDAO.save(customer);
        emailSender.sendEmail(email, "Welcome " + name + " to our company");
    }
}
