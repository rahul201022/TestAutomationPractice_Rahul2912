package ArrayProgramme;

public class searchElement {

	public static void main(String[] args) {
		
		int a[] = {23,100,70,69,800};
		boolean status = false; // mean not found
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==203) {
				System.out.println("Element found in list");
				status = true;
				break;
			}
		}
		if(status==false) {
			System.out.println("Element not found");	
		}
		
	}

}
