package WebdriverMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 Followings are conditional Methods which used interact with webelement on page.
isDisplayed()
isEnalbled()
isSelected();
 */
public class conditionalMethodDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		boolean Logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("Logo status:"+Logo);
		
		boolean txtSearch = driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
		System.out.println("Searchbox status:"+txtSearch);
		
		boolean rbtnMale = driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
		System.out.println("Male radio button status:"+rbtnMale);
		
	}
}
