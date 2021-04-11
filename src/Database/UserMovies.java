package Database;

import java.util.*;

public class UserMovies {

    /**
     * Attributes
     */
    private int movieID;
    private int userID;
    private String savedMovies;

    /**
     * Constructors
     */
    public UserMovies(int movieID) {
        this.movieID = movieID;
    };

    public UserMovies(int movieID, int userID, String savedMovies) {
        this.movieID = movieID;
        this.userID = userID;
        this.savedMovies = savedMovies;
    };

    /**
    * Getters
    */
    public int getMovieID(){
		return this.movieID;
	}

    public int getUserID(){
		return this.userID;
	}

    public String getSavedMovies() {
        return this.savedMovies;
    }

    /**
     * Setters
     */
    public void setMovieID(int newMovieID) {
        this.movieID = newMovieID;
    }

    public void setUserID(int newUserID) {
        this.userID = newUserID;
    }

    public void setSavedMovies(String newSavedMovies) {
        this.savedMovies = newSavedMovies;
    }

    
}