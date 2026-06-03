package data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Database class - Data Layer
 * 
 * This class handles all data storage and retrieval operations.
 * TODO: Implement the following methods:
 * - saveAccount(username, password): Save a new account to file
 * - loadAccounts(): Load all accounts from file
 * - accountExists(username): Check if an account already exists
 */
public class Database {
    private static final String ACCOUNTS_FILE = "accounts.txt";
    
    /**
     * Save a new account to file.
     * 
     * @param username The username to save
     * @param password The password to save
     * @return true if account was saved successfully, false otherwise
     */
    public static boolean saveAccount(String username, String password) {
        // TODO: Implement this method
        return false;
    }
    
    /**
     * Load all accounts from file.
     * 
     * @return List of accounts as strings or Account objects
     */
    public static List<String> loadAccounts() {
        // TODO: Implement this method
        return new ArrayList<>();
    }
    
    /**
     * Check if an account with the given username already exists.
     * 
     * @param username The username to check
     * @return true if account exists, false otherwise
     */
    public static boolean accountExists(String username) {
        // TODO: Implement this method
        return false;
    }
    
    /**
     * Retrieve a specific account information.
     * 
     * @param username The username to retrieve
     * @return account information if found, null otherwise
     */
    public static String getAccount(String username) {
        // TODO: Implement this method
        return null;
    }
}
