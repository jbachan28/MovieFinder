package Database;

import java.util.*;

public class Movie {

    /**
     * Attributes
     */
    private int movieID;
	private String movieTitle;
	private int movieYear;
    private int movieTime;
    private String movieLang;
    private String movieCountry;

    /**
     * Constructors
     */
    public Movie(int movieID) {
        this.movieID = movieID;
    };

    public Movie(int movieID, String movieTitle, int movieYear, int movieTime, String movieLang, String movieCountry) {
        this.movieID = movieID;
        this.movieTitle = movieTitle;
        this.movieYear = movieYear;
        this.movieTime = movieTime;
        this.movieLang = movieLang;
        this.movieCountry = movieCountry;
    };

    /**
    * Getters
    */
    public int getMovieID() {
        return this.movieID;
    }

	public String getMovieTitle(){
		return this.movieTitle;
	}

    public int getMovieYear() {
        return this.movieYear;
    }

    public int getMovieTime() {
        return this.movieTime;
    }
    
    public String getMovieLang(){
		return this.movieLang;
	}

    public String getMovieCountry(){
		return this.movieCountry;
	}

    /**
     * Setters
     */
    public void setMovieID(int newMovieID) {
        this.movieID = newMovieID;
    }

    public void setMovieTitle(String newMovieTitle) {
        this.movieTitle = newMovieTitle;
    }

    public void setMovieYear(int newMovieYear) {
        this.movieYear = newMovieYear;
    }

    public void setMovieTime(int newMovieTime) {
        this.movieTime = newMovieTime;
    }

    public void setMovieLang(String newMovieLang) {
        this.movieLang = newMovieLang;
    }

    public void setMovieCountry(String newMovieCountry) {
        this.movieCountry = newMovieCountry;
    }
    
}