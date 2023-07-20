package practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popups {

	public static void main(String[] args) throws Throwable {
			WebDriverManager.chromedriver().setup();
	WebDriver d =new ChromeDriver();
	
		d.manage().window().maximize();
		
		/*    Handling Java Script
		 	
		d.get("file:///C:/Users/Suresh/Desktop/ESRI%20-works/SELE/javaPopup.html");
		
		d.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert al= d.switchTo().alert();
		
		Thread.sleep(2000);
		System.out.println(al.getText());
	//	al.accept();
	
		al.dismiss();
		
		*/
		
		// Hidden Division popup -movable,colourful, inspectable - so we handle usimg fe(),click(), sendkeys()
		
		
	/*	
		// Browser notifications 
	ChromeOptions	co =new ChromeOptions();
		co.addArguments("--disable-notifications");
		co.addArguments("start-maximized");
		WebDriverManager.chromedriver().setup();
		WebDriver dr =new ChromeDriver(co);
		dr.get("https://www.yatra.com/");
		*/
		
		// Window Based Applications
	/*	// file uploads
		d.get("https://www.foundit.in/");
		d.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
		
		Thread.sleep(2000);
		
		//hidden division popups will opened
		
		d.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Suresh\\Documents/missing Arabic (v10)-02 dec.docx");
        Thread.sleep(2000);
        d.findElement(By.xpath("//input[@value='Submit']")).click();
	*/
		
		// File downloads
		d.get("https://www.selenium.dev/downloads/");
		
		d.findElement(By.xpath("//a[text()='4.10.0']")).click();
		// We use Robot class for Up, Down, Enter buttons
		//  Robot r=new Robot();
		
	}

}
