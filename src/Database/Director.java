package Database;

public class Director{
   
   int directorID;
   String dirFName;
   String dirLName;
   
   public Director(int _directorID){
      this.directorID = _directorID;
   }

   public Director(int _directorID, String _dirFName, String _dirLName){
      this.directorID = _directorID;
      this.dirFName = _dirFName;
      this.dirLName = _dirLName;
   }
   
   //setters
   
   public void setDirectorID(int _directorID){
      this.directorID = _directorID;
   }
   
   public void setDirFName(String _dirFName){
      this.dirFName = _dirFName;
   }
   
   public void setDirLName(String _dirLName){
      this.dirLName = _dirLName;
   } 
   
   //getters
   
   public int getDirectorID(){
      return this.directorID;
   }
   
   public String getDirFName(){
      return this.dirFName;
   }
   
   public String getDirLName(){
      return this.dirLName;
   }
   
   public static void main(String[] args){
      
   }
}