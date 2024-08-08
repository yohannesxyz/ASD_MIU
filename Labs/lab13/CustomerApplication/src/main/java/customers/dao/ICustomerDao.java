package customers.dao;

import customers.domain.Customer;
import org.springframework.stereotype.Repository;

public interface ICustomerDao {
    public void save(Customer customer);
}
