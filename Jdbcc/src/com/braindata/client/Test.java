package com.braindata.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		Scanner s1 = new Scanner(System.in);

		while (true) {
			System.out.println(
					"enter 1-Add Employee , 2- Display Employee , 3-Delete Employee,4- Update Employee 5-Exit");
			int c2 = s1.nextInt();

			switch (c2)

			{
			case 1:

				String sql2 = "insert into employee value(?,?,?)";
				PreparedStatement smt = con.prepareStatement(sql2);

				System.out.println("Enter Employee ID");
				smt.setInt(1, s1.nextInt());

				System.out.println("Enter Employee Name");
				smt.setString(2, s1.next());

				System.out.println("Enter Employee Address");
				smt.setString(3, s1.next());
				smt.execute();
				break;

			case 2:

				String sql3 = "Select * from employee";

				PreparedStatement smt1 = con.prepareStatement(sql3);
				ResultSet rs = smt1.executeQuery(sql3);
				while (rs.next()) {
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
				}
				break;

			case 3:

				String sql = "Delete from employee where id=?";
				PreparedStatement ps1 = con.prepareStatement(sql);
				System.out.println("for id");
				ps1.setInt(1, s1.nextInt());
				ps1.executeUpdate();

				break;

			case 4:

				String sql4 = "update employee set name=? where intEmpid=?";
				PreparedStatement ps = con.prepareStatement(sql4);

				System.out.println("Upate New name");
				ps.setString(1, s1.next());

				System.out.println("for id");
				ps.setInt(2, s1.nextInt());

				ps.executeUpdate();

			}

		}
	}

}
