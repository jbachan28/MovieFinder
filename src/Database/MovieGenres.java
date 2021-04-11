package Database;

import java.util.*;

public class MovieGenres {

    /**
     * Attributes
     */
    private int movieID;
    private int genreID;

    /**
     * Constructors
     */
    public MovieGenres(int movieID) {
        this.movieID = movieID;
    };

    public MovieGenres(int movieID, int genreID) {
        this.movieID = movieID;
        this.genreID = genreID;
    };

    /**
    * Getters
    */
    public int getMovieID(){
		return this.movieID;
	}

    public int getGenreID() {
        return this.genreID;
    }

    /**
     * Setters
     */
    public void setMovieID(int newMovieID) {
        this.movieID = newMovieID;
    }

    public void setGenreID(int newGenreID) {
        this.genreID = newGenreID;
    }
    
}