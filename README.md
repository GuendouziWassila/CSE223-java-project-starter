# Java Project Starter 

A template repository for student projects.

## Project Structure

```
.
├── src/
│   ├── Main.java                         # Entry point - starts the application
│   ├── data/                             # Data Layer - handles storage and retrieval
│   │   └── Database.java                 # Implement account storage logic here
│   ├── gui/                              # GUI Layer - handles user interface
│   │   ├── MainWindow.java               # Main application window
│   │   ├── LoginWindow.java              # Login window class
│   │   └── AccountCreationWindow.java    # Account creation window class
│   └── business/                         # Business Layer - handles core logic
│       └── UserManager.java              # Implement authentication logic here
```

## Three-Layer Architecture

This project uses a three-layer architecture to organize code:

- **Data Layer** - Handles all data storage and retrieval
- **GUI Layer** - Handles the user interface and display
- **Business Layer** - Handles the core logic and business rules

### Data Layer (`data/`)
Responsible for:
- Storing and retrieving account information
- File I/O operations
- Data persistence

**Example Implementation:**
- Implement methods to save accounts to a file
- Implement methods to load accounts from storage
- Implement methods to retrieve account data when needed

### GUI Layer (`gui/`)
Responsible for:
- Creating and managing windows
- Displaying user interface components
- Capturing user input
- Triggering business logic through buttons/events

**Example Implementation:**
- Implement the main window with login and create account buttons
- Implement the login window with username and password entry
- Implement the account creation window with validation feedback
- Implement event handlers for buttons and entry fields
- Connect GUI components to business layer methods

### Business Layer (`business/`)
Responsible for:
- Account creation logic
- Login verification
- Password validation
- Business rules enforcement

**Example Implementation:**
- Implement account creation logic (validation, uniqueness check, storage)
- Implement login verification (checking credentials)
- Implement password strength validation (minimum 9 characters, uppercase, lowercase, digit)
- Handle business logic errors and return appropriate feedback

## Getting Started

1. **Open the project in your Java IDE**
   - IntelliJ IDEA, Eclipse, or VS Code with Java extensions
   - Mark the `src` folder as a source folder

2. **Compile and run the application**
   - Using IDE: Click Run button
   - Command line: `javac -d bin src/**/*.java` then `java -cp bin Main`

## Common Requirements (All Projects)

All student projects must implement the following core features:

### 1. Account Creation
- Username and password entry in a separate window
- Password strength validation (minimum 9 characters, uppercase letter, lowercase letter, digit)
- Unique username check (no duplicate usernames)
- Store account information
- User-friendly error messages for invalid input

### 2. Login
- Username and password verification in a separate window
- Check credentials against stored accounts
- Clear error messages for invalid credentials
- Access to main application interface after successful login
- Handle Enter key for submission

### 3. Main Interface
- Accessible only after successful login
- Project-specific functionality implemented here
- User logout capability

## Getting Help

Each class includes JavaDoc comments describing what needs to be implemented.
Refer to method parameters and return value descriptions for guidance on your implementation.

---

**Complete this starter code with your project features!** 🚀
