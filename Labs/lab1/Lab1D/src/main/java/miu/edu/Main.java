package miu.edu;

import miu.edu.Domain.*;
import miu.edu.Service.ShoppingCartService;

public class Main {
    public static void main(String[] args) {

        ShoppingCartService shoppingCartService = new ShoppingCartService();
        Book book1 = new Book("Java", "1234", "John", 20.0);
        BookCopy bookCopy1 = new BookCopy(1, book1);
        Address address1 = new Address("1000 N 4th St", "Fairfield", "IA", "52557");
        Customer customer1 = new Customer("John","fsd","123", address1);

        ShoppingCart cart1 = new ShoppingCart(1, 2, 20.0, bookCopy1, null);
        Order order1 = new Order(1, "2021-10-10", "Pending", address1, address1, customer1, bookCopy1, cart1);
        cart1.setOrder(order1);
        shoppingCartService.addCart("1", cart1);
        ShoppingCart cart2 = shoppingCartService.getCart("1");
        System.out.println(cart2);


    }
}