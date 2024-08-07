package miu.edu.lab12Part4.integration;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class IowaCityPrintHandler implements IPrintHandler {
    @Override
    public void print() {
        System.out.print("****");
    }

    @Override
    public boolean handlePrint(String city) {
        if (city.equalsIgnoreCase("Iowa City")) {
            print();
            return true;
        }
        return false;
    }
}
