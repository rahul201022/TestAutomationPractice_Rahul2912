package dropdownHandle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropdownDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement ddlCountry = driver.findElement(By.xpath("//select[@id='country']"));
		Select ddlCountryList = new Select(ddlCountry);
		ddlCountryList.selectByVisibleText("India");
		List<WebElement> list = ddlCountryList.getOptions();
		
		//Get count from dropdown 
		System.out.println(list.size());
	
		//Get all the option list from dropdown using for loop
		
//		for(int i=0;i<list.size();i++) {
//			System.out.println("Option: "+list.get(i).getText());
//			if(list.get(i).getText().equals("Japan")) {
//				list.get(i).click();
//			}
//		}
		
		//Get all the option list using enhance loop
		
		for(WebElement ele:list) {
			System.out.println(ele.getText());
			if(ele.getText().equals("Canada")) {
				ele.click();
			}
		}
		
	}

}
