package BasicJavaOps;

public class StaticKeywordDemo {

	int a=100;
	static int b=120;
	
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
	static void data() {
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		//static method and var directly user without creating obj
		System.out.println(b);
		data();
		
		//for non-static method created object 
		StaticKeywordDemo sk = new StaticKeywordDemo();
		System.out.println(sk.a);
		sk.display();
		
	}

}
