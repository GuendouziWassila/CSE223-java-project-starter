package business;

import data.Database;

/**
 * UserManager class - Business Layer
 * 
 * This class handles account creation, login verification, and password validation.
 * TODO: Implement the following methods:
 * - createAccount(username, password): Create a new account with validation
 * - verifyLogin(username, password): Verify user credentials
 * - validatePassword(password): Check if password meets requirements
 * - isUsernameUnique(username): Check if username is unique
 */
public class UserManager {
    private Database database;
    
    /**
     * Constructor - Initialize UserManager with Database instance.
     */
    public UserManager() {
        this.database = new Database();
    }
    
    /**
     * Create a new account with username and password.
     * 
     * @param username The username for the new account
     * @param password The password for the new account
     * @return true if account created successfully, false otherwise
     * 
     * Requirements:
     * - Username must be unique
     * - Password must be at least 9 characters
     * - Password must contain at least one uppercase letter
     * - Password must contain at least one lowercase letter
     * - Password must contain at least one digit
     */
    public boolean createAccount(String username, String password) {
        // TODO: Implement this method
        return false;
    }
    
    /**
     * Verify that the username and password match a stored account.
     * 
     * @param username The username to verify
     * @param password The password to verify
     * @return true if login credentials are valid, false otherwise
     */
    public boolean verifyLogin(String username, String password) {
        // TODO: Implement this method
        return false;
    }
    
    /**
     * Check if a password meets the strength requirements.
     * 
     * @param password The password to validate
     * @return true if password is valid, false otherwise
     * 
     * Requirements:
     * - At least 9 characters long
     * - Contains at least one uppercase letter
     * - Contains at least one lowercase letter
     * - Contains at least one digit
     */
    public boolean validatePassword(String password) {
        // TODO: Implement this method
        return false;
    }
    
    /**
     * Check if a username is unique (not already in use).
     * 
     * @param username The username to check
     * @return true if username is unique, false if it already exists
     */
    public boolean isUsernameUnique(String username) {
        // TODO: Implement this method
        return false;
    }
}
