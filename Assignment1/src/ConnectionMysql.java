import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionMysql {
	
	public void getConnection(String username,String collegename,String emails) throws ClassNotFoundException, SQLException
	{
		 Class.forName("com.mysql.jdbc.Driver");      

	        Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Test","root","root");      
	        Statement stmt=(Statement) con.createStatement(); 
	        stmt.executeUpdate("insert into Studentdb values(username,collegename,emails)");  
	        Registration reg=new Registration();
	        reg.last();
	        //System.out.println("All Right , We got your entry");  
		
	}
}

	
	