package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisabledElement {

	public static void main(String[] args) throws Throwable {
	
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		
		d.get("file:///C:/Users/Suresh/Desktop/ESRI%20-works/DisabledElement.html");
		
		d.findElement(By.id("i1")).sendKeys("admin");
		Thread.sleep(2000);
		
		 WebElement pwd= d.findElement(By.id("i2"));
		 
		 if (pwd.isEnabled()) {
			System.out.println("Textbox is enabled");
		}
		 else {
			 System.out.println("paasword textbox is diabled");
			 
			 JavascriptExecutor jse=(JavascriptExecutor)d;
			 
			 jse.executeScript("document.getElementById('i2').value=\"manager\"");
			 
		}
		 
		 
	}

}
