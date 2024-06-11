package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 Test case:
 	1. Open chrome browser
	2. open URL https://demo.nopcommerce.com/
	3. Validate title should be "nopCommerce demo store"
	4. Close browser

 */

public class LaunchBrowser_01 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		String act_title = driver.getTitle();
		if(act_title.equals("nopCommerce demo store")) {
			System.out.println("Test Passed...");
		}
		else {
			System.out.println("Test Failed...");
		}
		driver.close();
	}
}
