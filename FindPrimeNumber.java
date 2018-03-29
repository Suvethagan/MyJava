import java.util.Scanner;
public class FindPrimeNumber {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num=0;
		boolean flag = false;
		String primeNumbers = "";
		System.out.println("Enter the value of n:");
		int n = scanner.nextInt();
		scanner.close();
		for(int i=2; i<num/2; ++i) {
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		if(!flag)
			System.out.println(num+" is a prime number");
		else
			System.out.println(num + " is not a prime number");
	}
}
