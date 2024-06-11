package JavaProgrammePractice;

public class LargestNumber {

	public static void main(String[] args) {
		// 1. Largest number from given 3 number
	/*	
		int a=2, b=20, c=200;
		
		if(a>b && a>c) {
			System.out.println("a is largest number");
		}
		else if(b>a && b>c) {
			System.out.println("b is largest number");
		}
		else if(c>a && c>b) {
			System.out.println("C is largest number");
		}
		else {
			System.out.println("numbers are same");
		}*/

		// 2. Largest of 2 numbers using (if... else, ternary operator)
		
		int a=1010, b=10111,c=100000;
		
//		if(a>b) {
//			System.out.println("a is largest number");
//		}else {
//			System.out.println("b is largest number");
//		}
		int large = (a>b && a>c )?a:(b>c && b>a)?b:c;
		System.out.println("Large number from "+a+","+b+","+c+" is:-"+large);
	}		
}
