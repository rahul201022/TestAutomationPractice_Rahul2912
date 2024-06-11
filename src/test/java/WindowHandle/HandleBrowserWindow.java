package WindowHandle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* This is the wait method of webdriver which is perform for synchronization.
1. ImplicitWait
2. ExplicitWait / FluentWait
 */
public class HandleBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> allWindow = driver.getWindowHandles();
		
		//Approch1 using List method we will extract windows ID from set
		
//		List<String> listWindow = new ArrayList<String>(allWindow);
//		String parentID = listWindow.get(0);
//		String ChildID = listWindow.get(1);
//		
//		//Switch child window using ID	
//		driver.switchTo().window(ChildID);
//		System.out.println(driver.getTitle());
//		
//		//Switch parent window using ID
//		driver.switchTo().window(parentID);
//		System.out.println(driver.getTitle());
//		
//		System.out.println("Test Passed !!!");
//		driver.quit();
		
		//Approch2 - when there is multiple windows and want to switch particular
		
		for(String list:allWindow) {
			
			String windowList = driver.switchTo().window(list).getTitle();
			
			if(windowList.equals("Human Resources Management Software | OrangeHRM"))
			{
				System.out.println("Test Passed !!!");
			}
		}
		
		driver.quit();
	}

}
