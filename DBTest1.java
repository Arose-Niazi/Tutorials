import java.sql.*;
import java.util.Scanner;

public class DBTest1 {
	public static void main(String args[])
	{
		try {	
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter username: ");
			String username = input.nextLine();
			
			System.out.println("Please enter password: ");
			String password = input.nextLine();
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","");
			Statement stmt=con.createStatement();  
			String query = String.format("INSERT INTO Accounts (username,password) VALUES ('%s','%s')",username,password); 
			stmt.execute(query); 
			int rows =stmt.getUpdateCount();
			if(rows > 0)
			{
				stmt=con.createStatement();  
				query = "SELECT * FROM Accounts";
				stmt.execute(query);
				ResultSet rs =stmt.getResultSet();
				while(rs.next())
				{
					username= rs.getString("Username");
					password= rs.getString("Password");
					System.out.println("Username: "+username);
					System.out.println("\tPassword: "+password);
				}
			}
				
			else 
				System.out.println("Failed to store.");
		}
		catch (SQLException e)
		{
			System.out.println("Connection Error");
		}		
		
	}
}