package BasicJavaOps;

public class ConstructorDemo {

	int a;
	int b;
	String name = "";
	
	//default constructor
	
	ConstructorDemo()
	{
		a = 100;
		b = 200;
		name = "Rahul";
	}
	
	void displayData()
	{
		System.out.println(a + "   " + b + "   "+name);
	}
	
	//Parameterized constructor
	
	ConstructorDemo(int i, int j, String sname)
	{
		a=i;
		b=j;
		name=sname;
	}
	
	public static void main(String[] args) {
		//default contructor
		
		ConstructorDemo cd = new ConstructorDemo();
		cd.displayData();

		
		//parameterized construcotr
		ConstructorDemo c = new ConstructorDemo(10,20,"Rahul");
		c.displayData();
	}

}
