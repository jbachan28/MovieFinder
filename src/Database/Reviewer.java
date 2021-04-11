package Database;

import java.util.*;

public class Reviewer {

    /**
     * Attributes
     */
	private int reviewerID;
	private String revName;

    /**
     * Constructors
     */
    public Reviewer(int reviewerID) {
        this.reviewerID = reviewerID;
    };

    public Reviewer(int reviewerID, String revName) {
        this.reviewerID = reviewerID;
        this.revName = revName;
    };

    /**
    * Getters
    */
    public int getReviewerID() {
        return this.reviewerID;
    }

	public String getRevName(){
		return this.revName;
	}

    /**
     * Setters
     */
    public void setReviewerID(int newReviewerID) {
        this.reviewerID = newReviewerID;
    }

    public void setRevName(String newRevName) {
        this.revName = newRevName;
    }

}