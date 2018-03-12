package bcas.csd11;

public class BankAccount {
	private double balance;
	private double interest = 7;

	public BankAccount(double initBalance) {
		balance = initBalance;
	}

	public double getBalance() {
		return balance;
	}

	public void withDraw(double amount) {
		balance = balance - amount;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void addInterest() {
		balance = balance + ((interest / 100) * balance) / 12;
	}

	public static void main(String args[]) {
		BankAccount sri = new BankAccount(1000);
		BankAccount nix = new BankAccount(2000);
		BankAccount san = new BankAccount(0);

		System.out.println("Balance sri :" + sri.getBalance());
		System.out.println("Balance nix :" + nix.getBalance());
		System.out.println("Balance san :" + san.getBalance());
		System.out.println("================================");

		sri.deposit(300);
		//System.out.println("Balance sri :" + sri.getBalance());
		nix.withDraw(100);
		//System.out.println("Balance nix :" + nix.getBalance());
		//System.out.println("================================");

		sri.addInterest();
		nix.addInterest();
		san.addInterest();
		
		System.out.println("Balance sri :" + sri.getBalance());
		System.out.println("Balance nix :" + nix.getBalance());
		System.out.println("Balance san :" + san.getBalance());
		System.out.println("================================");

		//System.out.println(new Date());
		//Date today = new Date();
		//System.out.println("Today is:"+ today);
	}
}
