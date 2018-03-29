package sem1.ass;

import java.text.NumberFormat;
import java.util.Scanner;
import javax.swing.text.NumberFormatter;
import java.util.ArrayList;

public class CashierLogin {
	private static final int Additems = 0;

	public static void main(String[] args) {
		User admin = new User();
		admin.setType("Admin");
		admin.setUsername("Admin");
		admin.setPassword("1111");

		User cashier = new User();
		cashier.setType("Cashier");
		cashier.setUsername("Cashier");
		cashier.setPassword("0000");
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		Scanner scan = new Scanner(System.in);

		boolean session = true;
		while (session) {
			System.out.println("\n" + "<<<<<<<<<<|||||||||||||||||||>>>>>>>>>>" + "\n"
					+ "          Welcome to POS LogIn:\n" + "======================================="
					+ "\n \n1.Login:\n" + "2.Add Items:\n" + "3.Make Sales:\n" + "4.Show Daily Summery:\n"
					+ "5.Add OR Remove Users:\n" + "6.Close:\n \n" + "<<<<<<<<<<|||||||||||||||||||>>>>>>>>>>");
			int selection = scan.nextInt();
			Scanner input1 = new Scanner(System.in);
			switch (selection) {
			case 1:
				System.out.println("(1) for Admin (2) for Cashier: ");
				double Login = scan.nextInt();
				if (Login == 1) {
					System.out.println("\nAdministrator LogIn ");
					System.out.println("Enter Username : ");
					String adminusername = scan.next();
					if (admin.username.equals(adminusername)) {
						System.out.println("Enter Passwod :");
						String adminpassword = scan.next();
						if (admin.username.equals(adminusername) && admin.password.equals(adminpassword)) {
							System.out.println("Welcome To Admin Login");
						} else
							System.out.println("Wrong Password");
					} else
						System.out.println("Wrong Username");
				} else if (Login == 2) {
					System.out.println("\nCashier LogIn ");
					System.out.println("Enter Username : ");
					String cashierusername = scan.next();
					if (cashier.username.equals(cashierusername)) {
						System.out.println("Enter Password : ");
						String cashierpassword = scan.next();
						if (cashier.username.equals(cashierusername) && cashier.password.equals(cashierpassword)) {
							System.out.println("Welcome To Cashier Login");
						} else
							System.out.println("Wrong Password");
					} else
						System.out.println("Wrong Username ");
				}
				break;
			case 2:
				System.out.println("\n(1) for Admin Add (2) for Cashier Add: ");
				String AddItems = scan.next();
				if (Additems == 1) {
					System.out.println("Admin Item Adding Option: ");
					System.out.println("");

				}
			}

		}
	}
}
