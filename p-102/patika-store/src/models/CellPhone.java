package models;


public class CellPhone extends Product {
    private String memory;
    private double screenSize;
    private int batteryPower;
    private int ram;
    private String color;

    public CellPhone(int id, double unitPrice, double discountRate, int stock, String name, Brand brand,
                     String memory, double screenSize, int batteryPower, int ram, String color) {
        super(id, unitPrice, discountRate, stock, name, brand);
        this.memory = memory;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;
    }

    public String getMemory() {
        return memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public int getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void displayDetails() {
        System.out.println("Product Name: " + getName());
        System.out.println("Brand: " + getBrand().getName());
        System.out.println("Memory: " + getMemory());
        System.out.println("Screen Size: " + getScreenSize());
        System.out.println("Battery Power: " + getBatteryPower());
        System.out.println("RAM: " + getRam());
        System.out.println("Color: " + getColor());
        System.out.println("Unit Price: " + getUnitPrice());
        System.out.println("Discount Rate: " + getDiscountRate());
        System.out.println("Stock: " + getStock());
        System.out.println("--------------------");
    }
}