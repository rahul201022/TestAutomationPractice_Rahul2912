package BasicJavaOps;

public class MethodDemo {

	int id=100;
	String ename="Test";
	int salary = 20000;
	
	//1. No parameter and no return
	void displayData() {
		System.out.println(id + "  " + ename + "  "+salary);
	}
	
	//2. No Parameter and return value
	String m2()
	{
		return ("Hello...!");	
	}
	
	//3. with Parameter and no return
	void m3(String name)
	{
		System.out.println(name);
	}
	
	//4. with parameter and return value
	String m4(String name)
	{
		return("Hello, How are you  ???" + name);
	}
	
	public static void main(String[] args) {
		
		//1.
		MethodDemo emp1 = new MethodDemo();
//		emp1.id=101;
//		emp1.ename="Rahul";
//		emp1.salary=50000;
//		emp1.displayData();
//		
//		MethodDemo emp2 = new MethodDemo();
//		emp2.displayData();
		
		//2.
		String str = emp1.m2();
		System.out.println(str);
		
		//3.
		emp1.m3("Testing");
		
		//4.
		String name = emp1.m4("John");
		System.out.println(name);
	}

}
