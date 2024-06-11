package JavaProgrammePractice;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int i =123456; 
//		int rev=0;
//		
//		while(i!=0) {
//			rev = rev*10 + i%10;
//			i=i/10;
//		}
//		System.out.println("Reverse no.: "+rev);
		
		//Using string buffer
		
//		StringBuffer sb = new StringBuffer(String.valueOf(i));
//		StringBuffer rev = sb.reverse();
//		
//		System.out.println("Reverse no.: "+rev);

		//Using string builder
		
		StringBuilder sc = new StringBuilder();
		sc.append(i);
		StringBuilder rev = sc.reverse();
		System.out.println("Reverse no.: "+rev);
		
		
		
	}

}
