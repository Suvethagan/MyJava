public class Replace {
	public static void main(String[] args){
		int first = 7;
		int second = 19;
		System.out.println("first="+first+"second="+second);
		int third;
		third = second;
		second = first;
		first = third;
		System.out.println("first="+first+"second="+second);
	}
}