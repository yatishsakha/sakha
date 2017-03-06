import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Registration_Demo
{
	String emails;
	String username;
	String collegename;
	
	

	public Registration_Demo(String username, String collegename) {
		super();
		this.username = username;
		this.collegename = collegename;
	}



	public void emailvalidation() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Email ID");
		String E_id=sc.nextLine();
		ArrayList<String> al=new ArrayList<String>();
		al.add(E_id);
		
		
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		 
		Pattern pattern = Pattern.compile(regex);
		 
		for( String emails : al)
		{
		    Matcher matcher = pattern.matcher(emails);
		    boolean flag=matcher.matches();
		    
		       if(flag)
		       {
		    	   System.out.println("Email is valid");
		       }
		       else
		       {
		    	   System.out.println("Email is not valid");
		    	   emailvalidation();
		       }
		       connection(emails);
			
		
		
		    
		}
		
}
	public void connection(String emails) throws ClassNotFoundException, SQLException
	{
	ConnectionMysql connec=new ConnectionMysql();
	connec.getConnection(username,collegename,emails);
	}
	
	
	
}

public class Registration {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("Welcome to Registartion");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Name");
		String U_name=sc.nextLine();
		
		
		//Registration_Demo r1=new Registration_Demo();
		//r1.emailvalidation();
		
		System.out.println("Enter college name");
		String C_name=sc.nextLine();
		
		Registration_Demo r1=new Registration_Demo(U_name,C_name);
		r1.emailvalidation();
		
		//ConnectionMysql connec=new ConnectionMysql();
		//connec.getConnection(U_name,C_name,email);
		
		
		}
	public void last()
	{
		System.out.println("All worked properly");
	}
}


