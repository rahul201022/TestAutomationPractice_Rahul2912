package ElementOperations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		//Select any specific
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//Select all checkbox
		List<WebElement> allCheckboxes= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		//1.Normal way
		
//		for(int i=0;i<allCheckboxes.size();i++) {
//			allCheckboxes.get(i).click();
//		}
		
		//2.Latest way
		
//		for(WebElement checkbox:allCheckboxes) {
//			checkbox.click();
//		}
			
		//select last 3 checkbox
		
//		for(int i=4;i<allCheckboxes.size();i++) {
//			allCheckboxes.get(i).click();
//		}
		
		//Select first 3 checkbox	
//		for(int i=0;i<3;i++) {
//			allCheckboxes.get(i).click();
//		}
		
		//Unselect which is selected checkbox
		for(int i=0;i<3;i++) {
			allCheckboxes.get(i).click();
		}	
		Thread.sleep(5000);
		for(int i=0;i<allCheckboxes.size();i++) {
			if(allCheckboxes.get(i).isSelected()) {
				allCheckboxes.get(i).click();
		}
	}
		System.out.println("Test Passed !!!");
}
}