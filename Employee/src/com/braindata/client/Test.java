package com.braindata.client;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.braindata.service.*;
import com.braindata.model.*;
import com.braindata.serviceImpl.*;

public class Test {
	public static void main(String[] args) {

		

		RBI a = new Operation();

		while (true) {
			Scanner s1 = new Scanner(System.in);
			System.out.println("enter 1-createAccount, 2-displayAllDetails, 3-dipositeMoney,"
					+ "4-withdraw, 5-balenceInquiry, 6-exit");

			try {
			int c2 = s1.nextInt();
			
			switch (c2)

			{
			case 1:

				a.createAccount();
				break;

			case 2:

				a.displayAllDetails();
				break;

			case 3:

				a.dipositeMoney();
				break;

			case 4:

				a.withdraw();
				break;

			case 5:

				a.balenceInquiry();
				break;

			case 6:
				System.exit(0);
			default:
				System.out.println("provide correct input");
			}
			}catch(InputMismatchException e) {
				System.out.println("enter digit only");
			}
		}

	}

}
