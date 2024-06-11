package WaitMethod;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/* This is the wait method of webdriver which is perform for synchronization.
1. ImplicitWait
2. ExplicitWait / FluentWait
 */

public class explicitWaitMethod {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	
		WebElement lnkOrangeHRM = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("OrangeHRM, Inc")));
		lnkOrangeHRM.click();
		System.out.println("Test Passed !!!");
		driver.quit();
	}

}
