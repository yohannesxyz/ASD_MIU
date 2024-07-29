package customers;

import java.util.Collection;
import java.util.Iterator;
//i am trying to skip every other customer in the list
public class SkippingIterator implements Iterator<Customer> {
    private Iterator<Customer> iterator;
    private Customer nextCustomer;

    public SkippingIterator(Collection<Customer> customers) {
        this.iterator = customers.iterator();


    }

    @Override
    public boolean hasNext() {
        if (iterator.hasNext()) {
            return true;
        }
        return false;
    }

    @Override
    public Customer next() {
        if (hasNext()) {
            Customer current = iterator.next();
            if (iterator.hasNext()) {
                iterator.next(); // Skip the next element
            }
            return current;
        }
        return null;
    }
}
