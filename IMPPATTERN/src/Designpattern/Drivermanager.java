package Designpattern;

public class Drivermanager {
	public static Connection getConnection() {
		
		Connection con = new Connection("jdbc:mysql", "root", "root");
		return con;
			
		}

}