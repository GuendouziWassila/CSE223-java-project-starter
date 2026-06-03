package gui;

import javax.swing.*;

/**
 * MainWindow class - GUI Layer
 * 
 * This class creates the main window of the application.
 * Students should implement the login and create account buttons and their functionality.
 */
public class MainWindow extends JFrame {
    
    /**
     * Constructor - Initialize the main window.
     */
    public MainWindow() {
        setTitle("Main Window");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // TODO: Create and implement the GUI components
        // - Add a title label
        // - Add a login button that opens LoginWindow
        // - Add a create account button that opens AccountCreationWindow
        // - Add an exit button
        
        createComponents();
        setVisible(true);
    }
    
    /**
     * Create and place components on the main window.
     */
    private void createComponents() {
        // TODO: Implement this method to create the GUI components
    }
    
    /**
     * Handle login button click.
     */
    private void onLoginClicked() {
        // TODO: Implement this method to open the login window
    }
    
    /**
     * Handle create account button click.
     */
    private void onCreateAccountClicked() {
        // TODO: Implement this method to open the account creation window
    }
}
