package com.project.back_end.DTO;

/**
 * DTO for receiving login credentials from the client.
 * Used for authentication purposes only.
 */
public class Login {

    private String identifier; // email (Doctor/Patient) or username (Admin)
    private String password;

    // Default constructor
    public Login() {
    }

    // Getter for identifier
    public String getIdentifier() {
        return identifier;
    }

    // Setter for identifier
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }
}
