package JavaProgrammePractice;

public class SumOfNumber {

	public static void main(String[] args) {
		int a=324234;
		
	int sum=0;
//		Programme 1
//		while(a!=0) {
//			int i = a%10;
//			sum=sum+i;
//			a=a/10;
//		}
//		System.out.println(sum);

		//Programme 2. count no. of digits
		
		while(a!=0) {
			a=a/10;
		sum++;
		}
		System.out.println(sum);
	}

}
