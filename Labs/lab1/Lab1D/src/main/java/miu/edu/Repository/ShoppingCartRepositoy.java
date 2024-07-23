
package miu.edu.Repository;

import miu.edu.Domain.ShoppingCart;

import java.util.HashMap;
import java.util.Map;



public class ShoppingCartRepositoy {
    // HashMap to store shopping cart data, with an identifier as the key and the shopping cart object as the value
    private Map<String, ShoppingCart> cartMap = new HashMap<>();


    public void addCart(String id, ShoppingCart cart) {
        cartMap.put(id, cart);
    }

    public void removeCart(String id) {
        cartMap.remove(id);
    }


    public void updateCart(String id, ShoppingCart cart) {
        cartMap.put(id, cart);
    }


    public ShoppingCart getCart(String id) {
        return cartMap.get(id);
    }
}




