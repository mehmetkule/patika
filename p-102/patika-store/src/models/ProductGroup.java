package models;


import java.util.ArrayList;
import java.util.List;

public class ProductGroup {
    private String name;
    private List<Product> products;

    public ProductGroup(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public int getId() {
        return 0;
    }
}