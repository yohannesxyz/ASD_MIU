package miu.edu.lab12Part2.integration;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Integer.MAX_VALUE)
public class DefaultPrintHandler implements IPrintHandler {
    @Override
    public void print() {
        System.out.print("**********");
    }

    @Override
    public boolean handlePrint(String city) {
            print();
            return true;

    }
}
