package miu.edu;
public class Main {
    public static void main(String[] args) {
        // Creating products
        Product product1 = new Product("Laptop");
        Product product2 = new Product("Smartphone");
        Product product3 = new Product("Tablet");
        Product product4 = new Product("Headphones");
        Product product5 = new Product("Charger");

        // Creating categories
        Category electronics = new Category("Electronics");
        Category computers = new Category("Computers");
        Category accessories = new Category("Accessories");

        // Building the catalog
        electronics.addComponent(computers);
        electronics.addComponent(accessories);
        electronics.addComponent(product2);

        computers.addComponent(product1);
        computers.addComponent(product3);

        accessories.addComponent(product4);
        accessories.addComponent(product5);

        // Print the catalog
        electronics.print();
    }
}
