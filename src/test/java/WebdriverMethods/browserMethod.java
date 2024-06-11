package WebdriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* This is the Browser method of webdriver which is perform action on browser only
close()
quit()

 */
public class browserMethod {

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
		driver.quit();
		//driver.close();
	}

}
