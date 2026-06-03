package gui;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * LoginWindow class - GUI Layer
 * 
 * This class creates a login window where users can enter their credentials.
 * Students should implement the login verification logic and error handling.
 */
public class LoginWindow extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    
    /**
     * Constructor - Initialize the login window.
     * 
     * @param parent The parent window
     */
    public LoginWindow(JFrame parent) {
        setTitle("Login");
        setSize(300, 200);
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
        // - Add login button
        // - Add cancel button
        // - Display error messages for invalid credentials
        
        createComponents();
        setVisible(true);
    }
    
    /**
     * Create and place widgets on the login window.
     */
    private void createComponents() {
        // TODO: Implement this method to create the GUI components
    }
    
    /**
     * Handle login button click.
     */
    private void onLoginClicked() {
        // TODO: Implement this method to verify credentials
        // - Get username and password from entry fields
        // - Call verifyLogin() from business layer
        // - Show error message if login fails
        // - Close window and show main interface if login succeeds
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
