package models;

import java.util.ArrayList;

public abstract class Account {
    private AuthenticationStatus loginStatus;
    private User user;
    private ArrayList<Insurance> insurances;

    // Constructor
    public Account(User user) {
        this.loginStatus = AuthenticationStatus.FAIL;
        this.user = user;
        this.insurances = new ArrayList<>();
    }

    // Getter and setter methods

    public AuthenticationStatus getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(AuthenticationStatus loginStatus) {
        this.loginStatus = loginStatus;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    // Abstract method
    public abstract void addInsurance(Insurance insurance);

    // Other methods
    public void showUserInfo() {
        user.showUserInfo();
    }

    public void printInsurances() {
        for (Insurance insurance : insurances) {
            insurance.printInsuranceInfo();
        }
    }
}