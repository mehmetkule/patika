package models;

public class BusinessAddress implements Address {
    private String address;

    // Constructor
    public BusinessAddress(String address) {
        this.address = address;
    }

    // Implementing interface method
    public void printAddress() {
        System.out.println("Business Address: " + address);
    }
}