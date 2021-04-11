package Database;

import java.util.*;

public class Passwords {

    /**
     * Attributes
     */
	private int userID;
	private String hashedPass;

    /**
     * Constructors
     */
    public Passwords(int userID) {
        this.userID = userID;
    };

    public Passwords(int userID, String hashedPass) {
        this.userID = userID;
        this.hashedPass = hashedPass;
    };

    /**
    * Getters
    */
    public int getUserID() {
        return this.userID;
    }

	public String getHashedPass(){
		return this.hashedPass;
	}

    /**
     * Setters
     */
    public void setUserID(int newUserID) {
        this.userID = newUserID;
    }

    public void setHashedPass(String newHashedPass) {
        this.hashedPass = newHashedPass;
    }

    
}