package models;

public class Enterprise extends Account {
    public Enterprise(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {
        // Apply business-specific logic for insurance addition
        double price = insurance.getInsurancePrice();
        price += price * 0.1; // Adding a 10% margin for enterprise customers
        insurance.setInsurancePrice(price);
        getInsurances().add(insurance);
    }
}