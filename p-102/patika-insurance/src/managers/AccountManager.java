package managers;

import exceptions.InvalidAuthenticationException;
import models.Account;
import models.AuthenticationStatus;
import models.User;

import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Account> accounts;

    // Constructor
    public AccountManager() {
        this.accounts = new TreeSet<>();
    }

    // Function for adding an account to the TreeSet
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Function for removing an account from the TreeSet
    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    // Function for logging in with email and password
    public Account login(String email, String password) throws InvalidAuthenticationException {
        for (Account account : accounts) {
            User user = account.getUser();
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                account.setLoginStatus(AuthenticationStatus.SUCCESS);
                return account;
            }
        }
        throw new InvalidAuthenticationException("Invalid email or password.");
    }
}

