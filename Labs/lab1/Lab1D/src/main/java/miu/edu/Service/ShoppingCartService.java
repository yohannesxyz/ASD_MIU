package miu.edu.Service;

import miu.edu.Domain.ShoppingCart;
import miu.edu.Repository.ShoppingCartRepositoy;

//add methods for the shopping cart repository
public class ShoppingCartService {

    ShoppingCartRepositoy shoppingCartRepositoy = new ShoppingCartRepositoy();


    //add a new shopping cart
    public void addCart(String id, ShoppingCart cart) {
        shoppingCartRepositoy.addCart(id, cart);
    }

    //remove a shopping cart
    public void removeCart(String id) {
        shoppingCartRepositoy.removeCart(id);
    }

    //update a shopping cart
    public void updateCart(String id, ShoppingCart cart) {
        shoppingCartRepositoy.updateCart(id, cart);
    }

    //get a shopping cart
    public ShoppingCart getCart(String id) {
        return shoppingCartRepositoy.getCart(id);
    }

    public void addQuantity(String id, int quantity) {
        ShoppingCart cart = shoppingCartRepositoy.getCart(id);
        cart.setQuantity(cart.getQuantity() + quantity);
        shoppingCartRepositoy.updateCart(id, cart);
    }

    public void removeQuantity(String id, int quantity) {
        ShoppingCart cart = shoppingCartRepositoy.getCart(id);
        cart.setQuantity(cart.getQuantity() - quantity);
        shoppingCartRepositoy.updateCart(id, cart);
    }


}
