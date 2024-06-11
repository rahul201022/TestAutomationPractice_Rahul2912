package WaitMethod;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* This is the wait method of webdriver which is perform for synchronization.
1. ImplicitWait
2. ExplicitWait / FluentWait
 */
public class implicitWaitMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		System.out.println("Test Passed !!!");
		driver.quit();
	}

}
