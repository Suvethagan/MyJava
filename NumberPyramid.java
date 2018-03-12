
public class NumberPyramid {
	public static void main(String args[]) {
		for(int i =0; i<10; i++) {
			for(int x=0; x<10-i; x++) {
			System.out.print("* ");
			}//System.out.print("* ");

			for (int b =0; b<i;b++) {
				System.out.print(i);
			}
			System.out.print(" ");

		}
	}
}
