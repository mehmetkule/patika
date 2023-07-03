package models;


public class Notebook extends Product {
    private int ram;
    private String storage;
    private double screenSize;

    public Notebook(int id, double unitPrice, double discountRate, int stock, String name, Brand brand,
                    int ram, String storage, double screenSize) {
        super(id, unitPrice, discountRate, stock, name, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public void displayDetails() {
        System.out.println("Product Name: " + getName());
        System.out.println("Brand: " + getBrand().getName());
        System.out.println("RAM: " + getRam() + " GB");
        System.out.println("Storage: " + getStorage());
        System.out.println("Screen Size: " + getScreenSize());
        System.out.println("Unit Price: " + getUnitPrice());
        System.out.println("Discount Rate: " + getDiscountRate());
        System.out.println("Stock: " + getStock());
        System.out.println("--------------------");
    }
}