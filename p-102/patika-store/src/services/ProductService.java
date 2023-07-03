package services;


 import models.Brand;
 import models.Product;
 import models.ProductGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
    private List<ProductGroup> productGroups;

    public ProductService() {
        this.productGroups = new ArrayList<>();
    }

    public void addProductGroup(ProductGroup productGroup) {
        productGroups.add(productGroup);
    }

    public void removeProductGroup(ProductGroup productGroup) {
        productGroups.remove(productGroup);
    }

    public void addProductToGroup(Product product, ProductGroup productGroup) {
        productGroup.addProduct(product);
    }

    public void removeProductFromGroup(Product product, ProductGroup productGroup) {
        productGroup.removeProduct(product);
    }

    public void displayAllProducts() {
        for (ProductGroup productGroup : productGroups) {
            List<Product> products = productGroup.getProducts();
            System.out.println("Product Group: " + productGroup.getName());
            System.out.println("--------------------");
            for (Product product : products) {
                product.displayDetails();
            }
        }
    }

    public List<Product> filterProductsByNumber(List<ProductGroup> productGroups, int number) {
        return productGroups.stream()
                .flatMap(productGroup -> productGroup.getProducts().stream())
                .filter(product -> product.getId() == number)
                .collect(Collectors.toList());
    }

    public List<Product> filterProductsByBrand(Brand brand) {
        return productGroups.stream()
                .flatMap(productGroup -> productGroup.getProducts().stream())
                .filter(product -> product.getBrand().getId() == brand.getId())
                .collect(Collectors.toList());
    }

    public void filterProductsById(int productId) {
        List<Product> products = filterProductsByNumber(productGroups, productId);
        if (products.size() == 0) {
            System.out.println("No product found with id: " + productId);
        } else {
            System.out.println("Products with id: " + productId);
            for (Product product : products) {
                product.displayDetails();
            }
        }
    }

    public void removeProduct(int productId) {
        List<Product> products = filterProductsByNumber(productGroups, productId);
        if (products.size() == 0) {
            System.out.println("No product found with id: " + productId);
        } else {
            for (Product product : products) {
                productGroups.stream()
                        .filter(productGroup -> productGroup.getProducts().contains(product))
                        .forEach(productGroup -> productGroup.removeProduct(product));
            }
        }
    }

    public int getNewProductId() {
        int maxId = 0;
        for (ProductGroup productGroup : productGroups) {
            List<Product> products = productGroup.getProducts();
            for (Product product : products) {
                if (product.getId() > maxId) {
                    maxId = product.getId();
                }
            }
        }
        return maxId + 1;
    }
}