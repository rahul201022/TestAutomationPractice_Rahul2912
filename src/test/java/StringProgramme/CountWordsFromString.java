package StringProgramme;

import java.util.Scanner;

public class CountWordsFromString {

	public static void main(String[] args) {
		System.out.println("Enter any string:- ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count =1;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("No. of words in string:- "+count);
	}

}
