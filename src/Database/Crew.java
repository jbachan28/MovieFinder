package Database;

public class Crew{
   
   int directorID;
   int movieID;
   
   public Crew(int _directorID){
      this.directorID = _directorID;
   }

   public Crew(int _directorID, int _movieID){
      this.directorID = _directorID;
      this.movieID = _movieID;
   }
   
   //setters
   
   public void setDirectorID(int _directorID){
      this.directorID = _directorID;
   }
   
   public void setMovieID(int _movieID){
      this.movieID = _movieID;
   } 
   
   //getters
   
   public int getDirectorID(){
      return this.directorID;
   }
   
   public int getMovieID(){
      return this.movieID;
   }
   
   public static void main(String[] args){
      
   }
}