package ArrayProgramme;

public class FindRepeatedNumber {

	public static void main(String[] args) {
		// Find no. of repetitions
		
		int a[] = {10,10,20,10,30,20,10,40};
		
		int count = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==10) {
				count++;
			}
		}
		System.out.println(" no. is Repeats: "+count);

	}

}
