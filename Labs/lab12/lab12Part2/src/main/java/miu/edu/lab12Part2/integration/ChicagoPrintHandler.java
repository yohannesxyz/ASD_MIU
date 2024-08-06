package miu.edu.lab12Part2.integration;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ChicagoPrintHandler implements IPrintHandler {
    @Override
    public void print() {
        System.out.print("**");
    }

    @Override
    public boolean handlePrint(String city) {
        if (city.equalsIgnoreCase("Chicago")) {
            print();
            return true;
        }
        return false;
    }
}
