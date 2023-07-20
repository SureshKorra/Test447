package practise;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriverManager.chromedriver().setup();
	 WebDriver	d=new ChromeDriver();
	 
	 d.manage().window().maximize();
	 
	 
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	d.get("https://www.selenium.dev/documentation/webdriver/waits/");
	
	// type casting scroll
	 JavascriptExecutor jse=(JavascriptExecutor)d;
	 
	 // manually scroll 
	// jse.executeScript("window.scrollBy(0,1000)");
	 
	 // location scroll
	WebElement loc= d.findElement(By.id("options"));
Point point	= loc.getLocation();

	jse.executeScript("window.scrollBy"+point);
	 Thread.sleep(2000);
	 
	// Down casting
 RemoteWebDriver	r=(RemoteWebDriver)d;
 r.executeScript("window.scrollBy(0,1000)");
	
	}

}
