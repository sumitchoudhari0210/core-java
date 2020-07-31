package Designpattern;


public class Test {
public static void main(String[] args) {
	Connection con=Drivermanager.getConnection();
	con.commit();
	con.rollback();
}
}
