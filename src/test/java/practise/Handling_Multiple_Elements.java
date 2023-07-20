package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Multiple_Elements {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver d =new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("one plus phones");
		Thread.sleep(2000);
		d.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(4000);
		List<WebElement> alllinks =d.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		System.out.println("links count "+ alllinks.size());
		
		for(int i=0; i<alllinks.size();i++) {
			
			System.out.println(alllinks.get(i).getText());
		}
		
		Thread.sleep(2000);
		
		
		
		
		

	}

}
