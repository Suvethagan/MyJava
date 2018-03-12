class Ranks{
	public static void main(String args []){
	int marks = 85;
	if(marks >= 75){
		System.out.println("Rank is A");
	}else if(75 > marks && marks >= 65){
		System.out.println("Rank is B");
	}else if (65 > marks && marks >= 55){
		System.out.println("Rank is C");
	}else if (55 > marks && marks >=40){
		System.out.println("Rank is D");
	}else {
		System.out.println("Rank is F");
	}
	}
}