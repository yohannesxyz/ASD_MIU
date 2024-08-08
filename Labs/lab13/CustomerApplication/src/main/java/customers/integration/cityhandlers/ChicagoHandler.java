package customers.integration.cityhandlers;

import customers.domain.Address;
import org.springframework.stereotype.Component;

@Component
public class ChicagoHandler implements ICityHandler {
    public boolean handle(Address address){
        if(address.getCity().equals("Chicago")){
            print();
            return true;
        }
        return false;
    }
    public void print(){
        System.out.println("**");
    }
}
