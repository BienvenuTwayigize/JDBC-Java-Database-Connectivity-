package javasql;
import java.sql.*;

public abstract class DBconnection {
    
String url ="jdbc:mysql://localhost:3306/";
String DBName="student table";
String uName="root";
String Password= "";
    
Connection connection = DBconnect();
    
public Connection DBconnect(){
      
try{
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Driver loaded Successfully");     
}
catch(ClassNotFoundException e){
System.out.println(e.getMessage());
System.out.println(" Error: failed" +e.getMessage());
}
try{
          
connection= DriverManager.getConnection(url+DBName,uName,Password);
System.out.println(" Successfully connected to the database" );
}
catch(SQLException sqle){
System.out.println("Failed to execute: "+sqle.getMessage());
}
     
return connection;
}
  
public abstract void selectOperation (int I);
}
