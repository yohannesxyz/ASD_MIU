package customers.integration.cityhandlers;

import customers.domain.Address;

public interface ICityHandler {
    public boolean handle(Address address);
}
