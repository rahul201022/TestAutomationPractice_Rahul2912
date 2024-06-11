package ArrayProgramme;

import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		// Reverse an array order
		
		int a[] = {100,2,5,3,7,8};
		
		System.out.println("Before reverse: "+Arrays.toString(a));
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}
	
	}

}
