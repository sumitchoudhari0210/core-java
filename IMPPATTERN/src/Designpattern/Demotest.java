package Designpattern;

public class Demotest {
	public static void main(String[] args) {
		Connection con=Drivermanager.getConnection();
		con.commit();
		
}
}