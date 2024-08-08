package customers.service;

import customers.dao.ICustomerDao;
import customers.domain.Address;
import customers.domain.Customer;
import customers.events.NewCustomerEvent;
import customers.integration.ConfigurationParams;
import customers.integration.EmailSender;
import customers.integration.IEmailSender;
import customers.integration.cityhandlers.ICityHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    ApplicationEventPublisher publisher;
    @Autowired
    List<ICityHandler> cityHandlers;
    @Autowired
    private ICustomerDao customerDao;
    private IEmailSender emailSender;

    @Qualifier("configurationParams")
    @Autowired
    ConfigurationParams configParameters;

    @Autowired
    public CustomerService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void addCustomer(String name, String email, String street, String city, String zip) {
        Customer customer = new Customer(name, email, new Address(street, city, zip));
        customerDao.save(customer);
        emailSender.sendEmail(customer.getEmail(), "Account has been created");
        publisher.publishEvent(new NewCustomerEvent(customer));

        System.out.println("Printing config parameters: ");
        System.out.println(configParameters);

        for (ICityHandler cityHandler : cityHandlers) {
            if (cityHandler.handle(customer.getAddress()))
                break;
        }
    }
}
