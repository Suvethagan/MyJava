
public class PrimeNum {
public static void main(String args[]) {
	int i=0;
	int n= 0;
	int j= 0;
	for(i=n+1;i<=10000000;i++) {
		int flag = 0;
		for(j=2; j<i; j++) {
			if(i%j==0) {
				flag = 1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(i);
		}
	}
 }
}
