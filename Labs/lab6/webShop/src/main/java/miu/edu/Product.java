package miu.edu;


class Product implements CatalogComponent {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Product: " + name);
    }
}

