package practise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindow {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.naukri.com/");
		
		// close parent/present window
		d.close();
		
		// close all tabs which are opened by selenium
		d.quit();
		
	/*	// close one by one tab with using quit
		Set<String> allwhs =d.getWindowHandles();
		
		for(String oneWh: allwhs) {         // for each loop allwhs converts as one wh
			d.switchTo().window(oneWh);
			d.close();
		Thread.sleep(2000);
		}
		*/
		// can we perform action on particular browser
		Set<String> alwh =d.getWindowHandles();
		
		for(String wh:alwh) {
			 String title = d.switchTo().window(wh).getTitle();
			 if(title.equalsIgnoreCase("Cognizant")) {
				 d.manage().window().maximize();
				 
				 d.findElement(By.xpath("//a[text()='FactSet']")).click();
				 Thread.sleep(3000);
				 d.quit();
				 break;
			 }
			 
			 // Can we also close all child browser only??
			 
			 String parentTitle = d.getTitle();
			 
			 Set<String> allwhs = d.getWindowHandles();
			 for(String onewhs:allwhs) {
				 String ttle=d.switchTo().window(onewhs).getTitle();
				 if (!ttle.equals(parentTitle)) {
					d.close();
					d.switchTo().window(onewhs);
				}
			 }
		}
	}

}
