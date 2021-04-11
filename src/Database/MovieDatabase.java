import java.sql.*;
import java.util.*;

public class MovieDatabase{

   private String dbUrl;
   private String dbUsername;
   private String dbPassword;
   private Connection connection;
   private Statement statement;
   private ResultSet rs1;
   
   ArrayList<ArrayList<String>> rows = new ArrayList<ArrayList<String>>();
   ArrayList<String> columns = new ArrayList<String>();
   
   //constructor
   public MovieDatabase(String url, String username, String password){
   
      this.dbUrl = url;
      this.dbUsername = username;
      this.dbPassword = password;
   }
   
   //connection parameters setters
   public void setUrl(String url){
      this.dbUrl = url;
   }
   
   public void setUsername(String username){
      this.dbUsername = username;
   }
   
   public void setPassword(String password){
      this.dbPassword = password;
   }
   
   //connect to database
   public boolean connect(){
      try{
      
         this.connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
         System.out.println("Successfully connected to the database!");
         return true;
         
      }catch(SQLException e){
         //TEMPORARY (ERROR HANDLING NEEDED)
         e.printStackTrace();
         return false;
      }
   }
   
   //close connection
   public boolean close(){
      try{
         connection.close();
         System.out.println("Connection successfully closed!");
         return true;
         
      }catch(SQLException e){
         //TEMPORARY (ERROR HANDLING NEEDED)
         e.printStackTrace();
         return false;
      }
      
   }
   
   //getData method
   public ArrayList<ArrayList<String>> getData(String query1){
      try{
      
         statement = connection.createStatement();
         rs1 = statement.executeQuery(query1);
         
         while (rs1.next()){
            for (int i=1; i<=rs1.getMetaData().getColumnCount(); i++){
               String temp = rs1.getString(i);
               columns.add(temp);
            }
            rows.add(columns);
            columns = new ArrayList<String>();
         }
      }catch(SQLException e){
         //TEMPORARY (ERROR HANDLING NEEDED)
         e.printStackTrace();
      }
      return rows;
   }
   
   //update tables
   public boolean setData(String query1){
      try{
      statement = connection.createStatement();
      int rc = statement.executeUpdate(query1);
      return true;
      
      }catch(SQLException e){
         //TEMPORARY (ERROR HANDLING NEEDED)
         e.printStackTrace();
         return false;
      }
   }
   
   public static void main(String[] args){
   
   }
}