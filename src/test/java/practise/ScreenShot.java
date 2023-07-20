package practise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
	WebDriver 	d =new ChromeDriver();
		d.get("https://www.google.com/");
		
		// 
		TakesScreenshot ts=(TakesScreenshot)d;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\Suresh\\Desktop\\ESRI -works/google.jpg");
		Files.copy(src, dest);
		
		
		
		// downcasting 
		
		RemoteWebDriver rwd=(RemoteWebDriver)d;
		File srcs=rwd.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\Suresh\\Desktop\\ESRI -works/google2.jpg");
		Files.copy(srcs, des);
		
		
		// particular element
		WebElement e=d.findElement(By.xpath("//div[@class='o3j99 LLD4me LS8OJ']"));
		File rcs=e.getScreenshotAs(OutputType.FILE);
		
		File dree =new File("C:\\Users\\Suresh\\Desktop\\ESRI -works/google1.jpg");
		Files.copy(rcs, dree);
	}
}
