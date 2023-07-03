import models.Brand;
import models.CellPhone;
import models.Notebook;
import models.ProductGroup;
import services.BrandService;
import services.ProductGroupService;
import services.ProductService;
import utils.ConsoleUtils;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Markaları oluşturma
        BrandService brandService = new BrandService();
        brandService.addBrand(new Brand(1, "Samsung"));
        brandService.addBrand(new Brand(2, "Lenovo"));
        brandService.addBrand(new Brand(3, "Apple"));
        brandService.addBrand(new Brand(4, "Huawei"));
        brandService.addBrand(new Brand(5, "Casper"));
        brandService.addBrand(new Brand(6, "Asus"));
        brandService.addBrand(new Brand(7, "HP"));
        brandService.addBrand(new Brand(8, "Xiaomi"));
        brandService.addBrand(new Brand(9, "Monster"));

        // Ürün gruplarını oluşturma
        ProductGroupService productGroupService = new ProductGroupService();
        productGroupService.addProductGroup(new ProductGroup("Cep Telefonları"));
        productGroupService.addProductGroup(new ProductGroup("Notebook"));

        // Ürünleri oluşturma
        ProductService productService = new ProductService();
        productService.addProductToGroup(new CellPhone(1, 2000.0, 0.1, 10, "Samsung Galaxy S21", brandService.getBrandById(1), "128 GB", 6.1, 4000, 6, "Siyah"), productGroupService.getProductGroupByName("Cep Telefonları"));
        productService.addProductToGroup(new CellPhone(2, 1500.0, 0.2, 5, "Xiaomi Mi 11", brandService.getBrandById(8), "64 GB", 6.55, 4780, 8, "Mavi"), productGroupService.getProductGroupByName("Cep Telefonları"));
        productService.addProductToGroup(new Notebook(3, 4000.0, 0.15, 8, "Lenovo ThinkPad X1 Carbon", brandService.getBrandById(2), 16, "512 SSD", 14.0), productGroupService.getProductGroupByName("Notebook"));
        productService.addProductToGroup(new Notebook(4, 3000.0, 0.0, 3, "Apple MacBook Pro", brandService.getBrandById(3), 8, "256 SSD", 13.3), productGroupService.getProductGroupByName("Notebook"));

        // Menüyü görüntüleme
        displayMenu(brandService, productGroupService, productService);
    }

    public static void displayMenu(BrandService brandService, ProductGroupService productGroupService, ProductService productService) {
        while (true) {
            System.out.println("---------------------------");
            System.out.println("1. Markaları Listele");
            System.out.println("2. Ürün Gruplarını Listele");
            System.out.println("3. Ürünleri Listele");
            System.out.println("4. Ürün Ekle");
            System.out.println("5. Ürün Sil");
            System.out.println("6. Ürünleri Filtrele");
            System.out.println("0. Çıkış");
            System.out.println("---------------------------");

            int choice = ConsoleUtils.getIntInput("Seçiminizi yapın");

            switch (choice) {
                case 1:
                    brandService.displayAllBrands();
                    break;
                case 2:
                    productGroupService.displayAllProductGroups();
                    break;
                case 3:
                    productService.displayAllProducts();
                    break;
                case 4:
                    addProduct(brandService, productGroupService, productService);
                    break;
                case 5:
                    removeProduct(productService);
                    break;
                case 6:
                    filterProducts(productService, brandService);
                    break;
                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
            }
        }
    }

    public static void addProduct(BrandService brandService, ProductGroupService productGroupService, ProductService productService) {
        System.out.println("Ürün Ekleme");
        System.out.println("---------------------------");
        int productGroupId = ConsoleUtils.getIntInput("Ürün Grubu ID'sini girin:");
        ProductGroup productGroup = productGroupService.getProductGroupById(productGroupId);
        if (productGroup == null) {
            System.out.println("Geçersiz Ürün Grubu ID'si");
            return;
        }

        int brandId = ConsoleUtils.getIntInput("Marka ID'sini girin:");
        Brand brand = brandService.getBrandById(brandId);
        if (brand == null) {
            System.out.println("Geçersiz Marka ID'si");
            return;
        }

        double price = ConsoleUtils.getDoubleInput("Birim Fiyatı girin:");
        double discountRate = ConsoleUtils.getDoubleInput("İndirim Oranı girin:");
        int stock = ConsoleUtils.getIntInput("Stok Miktarı girin:");
        String name = ConsoleUtils.getStringInput("Ürün Adını girin:");

        if (productGroup.getName().equals("Cep Telefonları")) {
            String memory = ConsoleUtils.getStringInput("Hafıza Bilgisini girin:");
            double screenSize = ConsoleUtils.getDoubleInput("Ekran Boyutunu girin:");
            int batteryPower = ConsoleUtils.getIntInput("Pil Gücünü girin:");
            int ram = ConsoleUtils.getIntInput("RAM miktarını girin:");
            String color = ConsoleUtils.getStringInput("Renk girin:");

            CellPhone cellPhone = new CellPhone(productService.getNewProductId(), price, discountRate, stock, name, brand, memory, screenSize, batteryPower, ram, color);
            productService.addProductToGroup(cellPhone, productGroup);
        } else if (productGroup.getName().equals("Notebook")) {
            int ram = ConsoleUtils.getIntInput("RAM miktarını girin:");
            String storage = ConsoleUtils.getStringInput("Depolama bilgisini girin:");
            double screenSize = ConsoleUtils.getDoubleInput("Ekran Boyutunu girin:");

            Notebook notebook = new Notebook(productService.getNewProductId(), price, discountRate, stock, name, brand, ram, storage, screenSize);
            productService.addProductToGroup(notebook, productGroup);
        } else {
            System.out.println("Geçersiz Ürün Grubu");
        }
    }

    public static void removeProduct(ProductService productService) {
        System.out.println("Ürün Silme");
        System.out.println("---------------------------");
        int productId = ConsoleUtils.getIntInput("Ürün ID'sini girin:");
        productService.removeProduct(productId);
    }

    public static void filterProducts(ProductService productService, BrandService brandService) {
        System.out.println("Ürünleri Filtreleme");
        System.out.println("---------------------------");
        System.out.println("1. Ürünleri ID'ye Göre Filtrele");
        System.out.println("2. Ürünleri Markaya Göre Filtrele");
        System.out.println("---------------------------");

        int choice = ConsoleUtils.getIntInput("Seçiminizi yapın:");

        switch (choice) {
            case 1:
                int productId = ConsoleUtils.getIntInput("Ürün ID'sini girin:");
                productService.filterProductsById(productId);
                break;
            case 2:
                int brandId = ConsoleUtils.getIntInput("Marka ID'sini girin:");
                Brand brand = brandService.getBrandById(brandId);
                if (brand != null) {
                    productService.filterProductsByBrand(brand);
                } else {
                    System.out.println("Geçersiz Marka ID'si");
                }
                break;
            default:
                System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
        }
    }
}