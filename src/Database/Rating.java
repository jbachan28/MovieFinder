package Database;

import java.util.*;

public class Rating {

    /**
     * Attributes
     */
    private int movieID;
	private int reviewerID;
	private double reviewerRating;
    private int numberOfRatings;


    /**
     * Constructors
     */
    public Rating(int movieID) {
        this.movieID = movieID;
    };

    public Rating(int movieID, int reviewerID, double reviewerRating, int numberOfRatings) {
        this.movieID = movieID;
        this.reviewerID = reviewerID;
        this.reviewerRating = reviewerRating;
        this.numberOfRatings = numberOfRatings;
    };

    /**
    * Getters
    */
    public int getMovieID() {
        return this.movieID;
    }

    public int getReviewerID() {
        return this.reviewerID;
    }

	public double getReviewerRating(){
		return this.reviewerRating;
	}

    public int getNumberOfRatings() {
        return this.numberOfRatings;
    }

    /**
     * Setters
     */
    public void setMovieID(int newMovieID) {
        this.movieID = newMovieID;
    }

    public void setReviewerID(int newReviewerID) {
        this.reviewerID = newReviewerID;
    }

    public void setReviewerRating(double newReviewerRating) {
        this.reviewerRating = newReviewerRating;
    }

    public void setNumberOfRatings(int newNumberOfRatings) {
        this.numberOfRatings = newNumberOfRatings;
    }

    
}