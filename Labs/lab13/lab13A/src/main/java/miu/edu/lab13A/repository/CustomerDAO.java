package miu.edu.lab13A.repository;


import miu.edu.lab13A.domain.Customer;
import miu.edu.lab13A.integration.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAO {

    Logger logger;


    @Autowired
    public void setLogger(Logger logger){
        this.logger=logger;
    }

    public void save(Customer customer){
        System.out.println("Customer saved: " + customer);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.log("Customer saved: " + customer);
    }
}
