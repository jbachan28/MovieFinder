package Database;

import java.util.*;

public class Genre {

    /**
     * Attributes
     */
    private int genreID;
	private String genreTitle;

    /**
     * Constructors
     */
    public Genre(int genreID) {
        this.genreID = genreID;
    };

    public Genre(int genreID, String genreTitle) {
        this.genreID = genreID;
        this.genreTitle = genreTitle;
    };

    /**
    * Getters
    */
    public int getGenreID() {
        return this.genreID;
    }

	public String getGenreTitle(){
		return this.genreTitle;
	}

    /**
     * Setters
     */
    public void setGenreID(int newGenreID) {
        this.genreID = newGenreID;
    }

    public void setGenreTitle(String newGenreTitle) {
        this.genreTitle = newGenreTitle;
    }
    
}