package services;


import models.Brand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BrandService {
    private List<Brand> brands;

    public BrandService() {
        this.brands = new ArrayList<>();
    }

    public void addBrand(Brand brand) {
        brands.add(brand);
        Collections.sort( brands, (o1, o2) -> o1.getName().compareTo(o2.getName()));
    }

    public void removeBrand(Brand brand) {
        brands.remove(brand);
    }

    public void displayAllBrands() {
        System.out.println("Brand List:");
        for (Brand brand : brands) {
            System.out.println("- " + brand.getName());
        }
    }

    public Brand getBrandById(int brandId) {
        for (Brand brand : brands) {
            if (brand.getId() == brandId) {
                return brand;
            }
        }
        return null;
    }
}
