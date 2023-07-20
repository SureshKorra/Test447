package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver d =new ChromeDriver();
		
			d.manage().window().maximize();
			
			d.get("file:///C:/Users/Suresh/Desktop/ESRI%20-works/SELE/frames.html");
			Thread.sleep(2000);
			// frames method
			d.switchTo().frame(0);
			Thread.sleep(2000);
			d.switchTo().frame("bottom");
			
			//element
			
			WebElement frAdr=d.findElement(By.xpath("//frame[@name ='top']"));
			
			d.switchTo().frame(frAdr);
			
			// switch parent frame
			d.switchTo().parentFrame();
			
			// default frame
			
			d.switchTo().defaultContent();
	}

}
