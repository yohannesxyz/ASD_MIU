package customers.integration.cityhandlers;

import customers.domain.Address;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DefaultCityHandler implements ICityHandler {
    public boolean handle(Address address){
        if(!Arrays.asList("Chicago","Fairfield","Iowa City").contains(address.getCity())){
            print();
            return true;
        }
        return false;
    }
    public void print(){
        System.out.println("**********");
    }
}
