package javasql;

import java.sql.*;

public class DBO extends DBconnection {
    
    @Override
    public void selectOperation (int Student_Id){
        
        String query = "SELECT * FROM student_table WHERE Student_Id = '"+Student_Id+"'";
        
        try{
            
            PreparedStatement pst;
          pst = connection.prepareStatement(query);
                                
            //execute statemnt
            ResultSet rs = pst.executeQuery();
            
            //process
            System.out.println("Student_Id\tName\t\t\tRegNo\t\tAge" );
            
            
            while(rs.next()){
            System.out.println(rs.getInt("Student_Id") );
            System.out.print("\t\t"+rs.getString ("Name") );
            System.out.print("\t\t"+rs.getInt("RegNo") );
            System.out.print("\t\t"+rs.getInt("Age"));
            }  
        }   
        catch(SQLException sqle){    
        System.out.println("Fail to Execute: "+sqle.getMessage());
        
    }
    }
}