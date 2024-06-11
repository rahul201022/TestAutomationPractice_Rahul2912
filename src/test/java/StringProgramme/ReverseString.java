package StringProgramme;

public class ReverseString {

	public static void main(String[] args) {
		// Solution 1
		
		String str = "Welcome to Java";
		/*String rev = "";
		
		System.out.println("Before reverse string: "+str);
		
		for(int i=str.length()-1;i>=0;i--) 
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("After reverse string: "+rev);
*/
		// Solution 2
		/*StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
		*/
		//Solution 3 - without using string method
		char a[] = str.toCharArray(); //To charArray store string as in array format
		System.out.println(a);
		String rev="";
		
		for(int i=a.length-1;i>=0;i--)
		{
			 rev = rev +a[i];
		}
		System.out.println(rev);
	}

}
