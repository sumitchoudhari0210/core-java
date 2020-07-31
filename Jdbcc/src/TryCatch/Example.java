package TryCatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example {

	public static void main(String[] args)   {

		try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded successfully");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		System.out.println("Connection Established Successfully");
		
		//String sql="insert into student values(7,'abc','pune')";
		
		Statement smt= con.createStatement();
		
		//smt.execute(sql);
		
		int rollno= Integer.parseInt(args[0]);
		String name=args[1];
		String addr= args[2];
		//String sql2="insert into student values("+rollno+",'"+name+"','"+addr+"')";
		//for runtime
		//smt.execute(sql2);
		
		String sql3="select * from student";
		
		
		ResultSet rs= smt.executeQuery(sql3);
		while(rs.next()){
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			
		}
		con.close();
		smt.close();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		
			 
			
	
	
	
		
		
	}
	
	
}
