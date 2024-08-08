package miu.edu.lab13A.integration.cityhandlers;

import customers.domain.Address;
import org.springframework.stereotype.Component;

@Component
public class IowaCityHandler implements ICityHandler {
    public boolean handle(Address address){
        if(address.getCity().equals("Iowa City")){
            print();
            return true;
        }
        return false;
    }
    public void print(){
        System.out.println("****");
    }
}
