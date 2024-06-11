package WebdriverMethods;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* This is the getMethods of Webdriver which is work and interact with webpage only not webelement
get()
getTitle()
GetCurrentURL()
getPageSource()
getWindowHandle()
getWindowHandles()
 */
public class getMethodDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowIDs = driver.getWindowHandles();
		System.out.println(windowIDs);
	}
}
