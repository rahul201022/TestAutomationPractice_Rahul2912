package webTable;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticTableDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		//Open the table and search flight which Price is low
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		//get price list 
		int cols = driver.findElements(By.xpath("//table//td[6]")).size();
		//System.out.println(cols);
		
		String priceList="";
		ArrayList<String> ai = new ArrayList<String>();
		for(int i=1;i<=cols;i++)
		{
			priceList = driver.findElement(By.xpath("//table//tr["+i+"]//td[6]")).getText();
			System.out.println(priceList);
		}
	
		ai.add(priceList);
		System.out.println("List: "+ai);
		Collections.sort(ai);
		System.out.println("Sorted Price List: "+ai);
	}

}
