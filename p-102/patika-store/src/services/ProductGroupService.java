package services;


import models.ProductGroup;

import java.util.ArrayList;
import java.util.List;

public class ProductGroupService {
    private List<ProductGroup> productGroups;

    public ProductGroupService() {
        this.productGroups = new ArrayList<>();
    }

    public void addProductGroup(ProductGroup productGroup) {
        productGroups.add(productGroup);
    }

    public void removeProductGroup(ProductGroup productGroup) {
        productGroups.remove(productGroup);
    }

    public void displayAllProductGroups() {
        System.out.println("Product Group List:");
        for (ProductGroup productGroup : productGroups) {
            System.out.println("- " + productGroup.getName());
        }
    }

    public ProductGroup getProductGroupById(int productGroupId) {
        for (ProductGroup productGroup : productGroups) {
            if (productGroup.getId() == productGroupId) {
                return productGroup;
            }
        }
        return null;
    }

    public ProductGroup getProductGroupByName(String notebook) {
        for (ProductGroup productGroup : productGroups) {
            if (productGroup.getName().equals(notebook)) {
                return productGroup;
            }
        }
        return null;
    }
}