package models;

import java.util.Date;

public abstract class Insurance {
    private String name;
    private double price;
    private Date startDate;
    private Date endDate;

    // Constructor
    public Insurance(String name, double price, Date startDate, Date endDate) {
        this.name = name;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getter and setter methods

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    // Abstract method
    public abstract void calculate();

    // Other methods
    public double getInsurancePrice() {
        return price;
    }

    public void setInsurancePrice(double price) {
        this.price = price;
    }

    public void printInsuranceInfo() {
        System.out.println("Insurance Name: " + name);
        System.out.println("Insurance Price: " + price);
        System.out.println("Insurance Start Date: " + startDate);
        System.out.println("Insurance End Date: " + endDate);
    }
}