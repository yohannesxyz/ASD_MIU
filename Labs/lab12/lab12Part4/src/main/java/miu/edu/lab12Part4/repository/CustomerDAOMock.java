package miu.edu.lab12Part4.repository;

import miu.edu.lab12Part4.integration.Logger;
import miu.edu.lab12Part4.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("test")
public class CustomerDAOMock implements ICustomerDAO {
    Logger logger;

    @Autowired
    public void setLogger(Logger logger){
        this.logger=logger;
    }

    public void save(Customer customer){
        System.out.println("Customer saved in CustomerDAOMock: " + customer);
        logger.log("Customer saved in CustomerDAOMock: " + customer);
    }
}
