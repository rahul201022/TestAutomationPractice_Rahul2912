package JavaProgrammePractice;

public class EvenOrOddNumbers {

	public static void main(String[] args) {
		
		//int i = 1;
		
//		while(i<=10) {
//			
//			//System.out.println(i);
//			if(i%2==0)
//			{
//				System.out.println(i+" Even number");
//			}
//			else {
//				System.out.println(i+" Odd number");
//			}
//			i++;
//		}
	//2.	
//		for(int i=1;i<=10;i++) {
//			
//			if(i%2==0) {
//				System.out.println(i+" Even number");
//			}
//			else {
//				System.out.println(i+" Odd number");
//			}
//		}
//
		
		int i = 12345;
		int evenCount=0;
		int oddCount=0;
		while(i!=0) {
			int rem =i%10;
			if(rem%2==0) {
				System.out.println("Even no is: "+ rem);
				evenCount++;
			}else {
				System.out.println("Odd no is: "+ rem);
				oddCount++;
			}
			i=i/10;
			}
		System.out.println("Even count is "+ evenCount);
		System.out.println("Odd count is "+ oddCount);
	}

}
