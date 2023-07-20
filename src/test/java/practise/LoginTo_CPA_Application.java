package practise;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTo_CPA_Application {

	
	public static void main(String[] args) throws Throwable {
		

		WebDriverManager.chromedriver().setup();
		WebDriver d =new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://gis.cityofpaloalto.org/portal/apps/webappviewer/index.html?id=b95d4a68b5574f1c9c324cc57440ff77");
		
		Thread.sleep(5000);
		
		// verify the page is Displayed
		
		String expectedTitle="Sign In";
		String actualTitle =d.getTitle();
		
		if (actualTitle.equals(actualTitle)) {
			System.out.println("Login page is displayed");
		} else {
			
			System.out.println("Login page is not displayed");
		}
		
		Thread.sleep(3000);
		
		
		d.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		//1. click on Argis and Find Username Textbox and enter the valid username
		
		
		d.findElement(By.xpath("//div[@id='loginTitle']")).click();
		
		Thread.sleep(3000);
		
		d.findElement(By.id("user_username")).sendKeys("CPA_iSpatial");
		Thread.sleep(3000);
		d.findElement(By.id("user_password")).sendKeys("CPA&iST@1234");
		//Thread.sleep(3000);
		
		// click on sign In
		d.findElement(By.id("signIn")).click();
		
		WebDriverWait wait =new WebDriverWait(d, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.titleContains("Hydrant Inspection"));
		
	//	Thread.sleep(6000);
		String expectedHomeTitle ="Hydrant Inspection";
		String actualHomeTitle=d.getTitle();
		
		if (actualHomeTitle.equals(expectedHomeTitle)) {
			System.out.println("Home page is displayed , PASS");
		} else {
			System.out.println("Home page is NOT displayed , fAIL");
		}
		
		
	}

}
