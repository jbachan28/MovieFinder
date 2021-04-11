package Database;

public class Actor{
   
   int actorID;
   String actorFName;
   String actorLName;
   String actorGender;
   
   public Actor(int _actorID){
      this.actorID = _actorID;
   }

   public Actor(int _actorID, String _actorFName, String _actorLName, String _actorGender){
      this.actorID = _actorID;
      this.actorFName = _actorFName;
      this.actorLName = _actorLName;
      this.actorGender = _actorGender;
   }
   
   //setters
   
   public void setActorID(int _actorID){
      this.actorID = _actorID; 
   }
   
   public void setActorFName(String _actorFName){
      this.actorFName = _actorFName; 
   }
   
   public void setActorLName(String _actorLName){
      this.actorLName = _actorLName;
   }
   
   public void setActorGender(String _actorGender){
      this.actorGender = _actorGender; 
   }
   
   //getters
   
   public int getActorID(){
      return this.actorID;
   }
   
   public String getActorFName(){
      return this.actorFName;
   }
   
   public String getActorLName(){
      return this.actorLName;
   }
   
   public String getActorGender(){
      return this.actorGender;
   }
   
   
   public static void main(String[] args){
      
   }
}