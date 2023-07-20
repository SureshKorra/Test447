package practise;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotsFull {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.amazon.in/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// full screenshot
		
		TakesScreenshot ts= (TakesScreenshot)d;
	File	src=ts.getScreenshotAs(OutputType.FILE);
		
File des=new File("C:\\Users\\Suresh\\Desktop/SS.jpg");

Files.copy(src, des);



// particulaer element

WebElement ee =d.findElement(By.xpath("//span[@class='navFooterBackToTopText']")); 
File srcs =ee.getScreenshotAs(OutputType.FILE);
File des2 =new File("C:\\\\Users\\\\Suresh\\\\Desktop/SS1.jpg");
Files.copy(srcs, des2);

	}

}
