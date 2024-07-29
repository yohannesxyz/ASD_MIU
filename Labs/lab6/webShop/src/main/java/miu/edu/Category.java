package miu.edu;

import java.util.ArrayList;
import java.util.List;

// Composite
class Category implements CatalogComponent {
    private String name;
    private List<CatalogComponent> components = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public void addComponent(CatalogComponent component) {
        components.add(component);
    }

    public void removeComponent(CatalogComponent component) {
        components.remove(component);
    }

    @Override
    public void print() {
        System.out.println("Category: " + name);
        for (CatalogComponent component : components) {
            component.print();
        }
    }
}
