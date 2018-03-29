package bcas.csd11;

import java.util.Scanner;

public class AddTwoNum {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number1 : ");
		int num1 = scan.nextInt();
	
		System.out.print("Enter Number2 : ");
		int num2 = scan.nextInt();
		
		System.out.println("+");
		int add = num1 + num2;
		System.out.println("Total : " +add);
		//int add = scan.nextInt();

		System.out.println("-");
		int sub = num1 - num2;
		System.out.println("Total : " +sub);
		//int sub = scan.nextInt();

		System.out.println("*");
		int mul = num1 * num2;
		System.out.println("Total : " +mul);
		//int mul = scan.nextInt();

		System.out.println("/");
		int div = num1 / num2;
		System.out.println("Total : " +div);
		//int div = scan.nextInt();

	}
}

