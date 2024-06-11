package JavaProgrammePractice;

public class SwappingNumber {

	public static void main(String[] args) {
		//Swapping of 2 number without using 3rd one
		int a = 30, b=20;
		System.out.println("Before swapping: "+a+","+b);
		//solution 1
	
//		a=a-10;
//		b=b+10;
//
//		System.out.println("After swapping: "+a+","+b);
		
		//solution 2
		a=a+b; //a=50
		b=a-b; //b=30
		a=a-b; //a=20
		
		System.out.println("After swapping: "+a+","+b);
		
		
	}

}
