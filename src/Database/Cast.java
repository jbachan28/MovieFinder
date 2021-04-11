package Database;

public class Cast{
   
   int actorID;
   int movieID;
   String role;
   
   public Cast(int _actorID){
      this.actorID = _actorID;
   }

   public Cast(int _actorID, int _movieID, String _role){
      this.actorID = _actorID;
      this.movieID = _movieID;
      this.role = _role;
   }
   
   //setters
   
   public void setActorID(int _actorID){
      this.actorID = _actorID;
   }
   
   public void setMovieID(int _movieID){
      this.movieID = _movieID;
   } 
   
   public void setRole(String _role){
      this.role = _role;
   }
   
   //getters
   
   public int getActorID(){
      return this.actorID;
   }
   
   public int getMovieID(){
      return this.movieID;
   }
   
   public String getRole(){
      return this.role;
   }
   
   //CRUD Methods Template
   
   //fetch
   
   public static void main(String[] args){
      
   }
}