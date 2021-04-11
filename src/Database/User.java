package Database;

import java.util.*;

public class User {

    /**
     * Attributes
     */
    private int userID;
    private String username;

    /**
     * Constructors
     */
    public User(int userID) {
        this.userID = userID;
    };

    public User(int userID, String username) {
        this.userID = userID;
        this.username = username;
    };

    /**
    * Getters
    */
    public int getUserID(){
		return this.userID;
	}

    public String getUsername() {
        return this.username;
    }

    /**
     * Setters
     */
    public void setUserID(int newUserID) {
        this.userID = newUserID;
    }

    public void setUsername(String newUsername) {
        this.username = newUsername;
    }

    
}