package StringProgramme;

public class RemoveJunkCharFromString {

	public static void main(String[] args) {
		String str = "we$#?#lc@@@@o%me";

		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		//Output: welcome
	}

}
