package miu.edu.lab12Part4.service;

import miu.edu.lab12Part4.integration.EmailSender;
import miu.edu.lab12Part4.domain.Address;
import miu.edu.lab12Part4.domain.Customer;
import miu.edu.lab12Part4.integration.IPrintHandler;
import miu.edu.lab12Part4.repository.ICustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private ICustomerDAO customerDAO;

    @Autowired
    private EmailSender emailSender;

    @Autowired
    List<IPrintHandler> printHandlers;

    public void addCustomer(String name, String email, String Street,String city, String zip){
        Customer customer = new Customer(name, email, new Address(Street, city, zip));
        customerDAO.save(customer);
        emailSender.sendEmail(email, "Welcome " + name + " to our company");


  printHandlers.stream()
    .anyMatch(printHandler -> printHandler.handlePrint(city));
    }
}
