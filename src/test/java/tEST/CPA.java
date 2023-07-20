package tEST;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CPA {
public static void main(String[] args) throws Throwable {
	
	WebDriverManager.chromedriver().setup();
	WebDriver d =new ChromeDriver();
	d.manage().window().maximize();
	
	
	d.get("https://opengis.cityofpaloalto.org/parcelreports/");
	
	WebDriverWait wait =new WebDriverWait(d, Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='searchInput firstFocusNode']")));
	 
	// WebElement  apn = d.findElement(By.xpath("//input[@class='searchInput firstFocusNode']"));
	 
	 
	 WebElement  mapclick = d.findElement(By.xpath("//div[@id='map_layers']"));
	 mapclick.click();
	 Thread.sleep(2000);
//	//apn.sendKeys("132-15-056");
//	Thread.sleep(2000);
//	apn.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	d.findElement(By.xpath("//img[@alt='Legend']")).click();
	
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='ParcelReport']")));
	 
	TakesScreenshot ss=(TakesScreenshot)d;
	File src =ss.getScreenshotAs(OutputType.FILE);
File dest	= new File("D:\\ss/Parcel.jpg");
	Files.copy(src, dest);
	Thread.sleep(3000);
	
	d.findElement(By.xpath("//img[@alt='Print']")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='jimu-btn']")));
	
	d.findElement(By.xpath("//div[@data-dojo-attach-point='printButtonDijit']")).click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'South Ct')]")));
	
	File src1 =ss.getScreenshotAs(OutputType.FILE);
File dest1	= new File("D:\\ss/Parcel2.jpg");
	Files.copy(src1, dest1);
	
	Thread.sleep(5000);
System.out.println("Hydrant Application");
	 	d.get("https://gis.cityofpaloalto.org/portal/apps/webappviewer/index.html?id=b95d4a68b5574f1c9c324cc57440ff77");
	 	
	 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("///div[@id='loginTitle']']")));
	 	
	 	d.findElement(By.xpath("//div[@id='loginTitle']")).click();
	 	Thread.sleep(2000);
	 	
	 WebElement	un =d.findElement(By.name("username"));
	 
	 un.sendKeys("CPA_iSpatial");
	 Thread.sleep(2000);
	 
 WebElement	pw =d.findElement(By.name("password"));
	 
	 pw.sendKeys("CPA&iST@1234");
	 Thread.sleep(2000);
	 d.findElement(By.id("signIn")).click();
	 
	 
}
	
	
	
}

