package StringProgramme;

public class StringPalindromOrNot {

	public static void main(String[] args) {
		String str = "welcomemoclew";
		
		String orgString = str;
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		if(rev.equals(orgString))
		{
			System.out.println("It's Palindrome");
		}
		else {
			System.out.println("It's not Palindrome");
		}
	}

}
