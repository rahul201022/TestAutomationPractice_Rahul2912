package JavaProgrammePractice;

public class PalindromNumber {

	public static void main(String[] args) {
		int num = 16461;
		int rev = 0;
		int result = num;
		
		
		while(num!=0) {
			rev = rev*10+num%10;
			num=num/10;
		}

		if(result==rev) {
			System.out.println("It's Palindrom");
		}
		else {
			System.out.println("Its not Palindrom");
		}

	}

}
