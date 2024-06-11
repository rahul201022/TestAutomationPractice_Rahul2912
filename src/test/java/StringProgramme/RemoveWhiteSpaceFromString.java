package StringProgramme;

public class RemoveWhiteSpaceFromString {

	public static void main(String[] args) {
		String str ="Welcome       t o th e         Jav a Au    tomation ";
		
		//Solution 1
		//str = str.replaceAll(" ", "");
		
		//Solution 2
		//str = str.replaceAll("\\s", "");
		System.out.println(str);
	}

}
