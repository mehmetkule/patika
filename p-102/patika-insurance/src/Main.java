import exceptions.InvalidAuthenticationException;
import managers.AccountManager;
import models.*;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create user
        User user = new User("John", "Doe", "john.doe@example.com", "password", "Engineer", 30);
        ArrayList<Address> addresses = new ArrayList<>();
        addresses.add(new HomeAddress("123 Main St City State 12345"));
        addresses.add(new BusinessAddress("456 Business Rd City State 12345"));
        user.setAddresses(addresses);

        // Create individual account and enterprise account
        Account individualAccount = new Individual(user);
        Account enterpriseAccount = new Enterprise(user);

        // Create insurance policies
        Insurance healthInsurance = new HealthInsurance("Health Insurance", 100.0, new Date(), new Date());
        Insurance residenceInsurance = new ResidenceInsurance("Residence Insurance", 200.0, new Date(), new Date());
        Insurance travelInsurance = new TravelInsurance("Travel Insurance", 150.0, new Date(), new Date());
        Insurance carInsurance = new CarInsurance("Car Insurance", 300.0, new Date(), new Date());

        // Add insurance policies to accounts
        individualAccount.addInsurance(healthInsurance);
        individualAccount.addInsurance(residenceInsurance);
        enterpriseAccount.addInsurance(travelInsurance);
        enterpriseAccount.addInsurance(carInsurance);

        // Print user info and insurance policies
        individualAccount.showUserInfo();
        individualAccount.printInsurances();

        enterpriseAccount.showUserInfo();
        enterpriseAccount.printInsurances();

        // Create AccountManager and add accounts
        AccountManager accountManager = new AccountManager();
        accountManager.addAccount(individualAccount);
        accountManager.addAccount(enterpriseAccount);

        try {
            // Perform login
            Account loggedInAccount = accountManager.login("john.doe@example.com", "password");
            System.out.println("Login successful. User: " + loggedInAccount.getUser().getFullName());
        } catch (InvalidAuthenticationException e) {
            System.out.println("Login failed. " + e.getMessage());
        }
    }
}