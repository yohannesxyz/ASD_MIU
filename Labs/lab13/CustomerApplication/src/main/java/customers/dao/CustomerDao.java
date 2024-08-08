package customers.dao;

import customers.domain.Customer;
import customers.integration.ILogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("production")
public class CustomerDao implements ICustomerDao {

    @Autowired
    @Qualifier("logger")
    private ILogger logger;
    public void save(Customer customer){
        System.out.println("Customer saved "+customer.toString()+" from production dao");
        logger.log("Logger "+"Customer saved "+customer.toString());
    }
}
