package miu.edu.lab12Part2.repository;

import miu.edu.lab12Part2.integration.Logger;
import miu.edu.lab12Part2.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("production")
public class CustomerDAO implements ICustomerDAO {

    Logger logger;

    @Autowired
    public void setLogger(Logger logger){
        this.logger=logger;
    }

    public void save(Customer customer){
        System.out.println("Customer saved: " + customer);
        logger.log("Customer saved: " + customer);
    }
}
