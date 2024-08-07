package miu.edu.lab12Part2.service;

import miu.edu.lab12Part2.integration.EmailSender;
import miu.edu.lab12Part2.domain.Address;
import miu.edu.lab12Part2.domain.Customer;
import miu.edu.lab12Part2.repository.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Autowired
    private EmailSender emailSender;



    public void addCustomer(String name, String email, String Street,String city, String zip) {
        Customer customer = new Customer(name, email, new Address(Street, city, zip));
        customerDAO.save(customer);
        emailSender.sendEmail(email, "Welcome " + name + " to our company");

    }

}
