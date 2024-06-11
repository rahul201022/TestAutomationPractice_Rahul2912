package ElementOperations;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Normal alert
//		driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
//		
//		Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(myAlert.getText());
//		Thread.sleep(3000);
//		myAlert.accept();
		
		//Confirmation alert
//		driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']")).click();
//		Thread.sleep(3000);
//		//driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
		//Prompt Alert
		driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
		Thread.sleep(3000);
		
		Alert myAlert = driver.switchTo().alert();
		myAlert.sendKeys("Rahul");
		myAlert.accept();
	}

}
