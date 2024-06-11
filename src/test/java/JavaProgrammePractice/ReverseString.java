package JavaProgrammePractice;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Welcome to Java Automation";
		StringBuilder input = new StringBuilder();
		input.append(s);
		input = input.reverse();
		System.out.println(input);
		for(int i=0;i<input.length();i++) {
			System.out.print(input.charAt(i));
		}

	}

}
