package models;

public class HomeAddress implements Address {
    private String address;

    // Constructor
    public HomeAddress(String address) {
        this.address = address;
    }

    // Implementing interface method
    public void printAddress() {
        System.out.println("Home Address: " + address);
    }
}