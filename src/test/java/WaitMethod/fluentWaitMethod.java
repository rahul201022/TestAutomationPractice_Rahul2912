package WaitMethod;

import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

/* This is the wait method of webdriver which is perform for synchronization.
1. ImplicitWait
2. ExplicitWait / FluentWait
 */

public class fluentWaitMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		            .withTimeout(Duration.ofSeconds(30))
		            .pollingEvery(Duration.ofSeconds(5))
		            .ignoring(ElementNotInteractableException.class);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	
		WebElement lnkOrangeHRM = wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
				return 	driver.findElement(By.linkText("OrangeHRM, Inc"));
			}
		});
		
		lnkOrangeHRM.click();
		System.out.println("Test Passed !!!");
		driver.quit();
	}

}
