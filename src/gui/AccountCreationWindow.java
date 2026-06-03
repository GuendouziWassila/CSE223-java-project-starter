package gui;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * AccountCreationWindow class - GUI Layer
 * 
 * This class creates a window for new users to create an account.
 * Students should implement account creation logic with password strength validation.
 */
public class AccountCreationWindow extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    
    /**
     * Constructor - Initialize the account creation window.
     * 
     * @param parent The parent window
     */
    public AccountCreationWindow(JFrame parent) {
        setTitle("Create Account");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(parent);
        
        // Add window listener for proper cleanup
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                onWindowClosing();
            }
        });
        
        // TODO: Create and implement the GUI components
        // - Add username label and entry field
        // - Add password label and entry field (with password masking)
        // - Add confirm password label and entry field
        // - Add create account button
        // - Add cancel button
        // - Display error messages for invalid input
        // - Display success message when account is created
        
        createComponents();
        setVisible(true);
    }
    
    /**
     * Create and place widgets on the account creation window.
     */
    private void createComponents() {
        // TODO: Implement this method to create the GUI components
    }
    
    /**
     * Handle create account button click.
     */
    private void onCreateClicked() {
        // TODO: Implement this method to create a new account
        // - Get username, password, and confirm password from entry fields
        // - Validate that passwords match
        // - Call createAccount() from business layer
        // - Show error message if account creation fails
        // - Show success message and close window if account is created
    }
    
    /**
     * Handle cancel button click.
     */
    private void onCancelClicked() {
        dispose();
    }
    
    /**
     * Handle window closing event.
     */
    private void onWindowClosing() {
        dispose();
    }
}
