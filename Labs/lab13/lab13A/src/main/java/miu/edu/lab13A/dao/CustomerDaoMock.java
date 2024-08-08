package miu.edu.lab13A.dao;

import customers.domain.Customer;
import customers.integration.ILogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("test")
public class CustomerDaoMock implements ICustomerDao {

    @Autowired
    @Qualifier("logger")
    private ILogger logger;
    public void save(Customer customer){
        System.out.println("Customer saved "+customer.toString()+" from test dao");
        logger.log("Logger "+"Customer saved "+customer.toString());
    }
}
