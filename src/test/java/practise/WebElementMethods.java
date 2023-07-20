package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://demo.actitime.com/login.do");
		
		WebElement un=d.findElement(By.id("username"));
		un.sendKeys("admin");
		un.clear();
		Thread.sleep(2000);
		
		System.out.println("tag name:   "+ un.getTagName());
		System.out.println("attritube value    "+ un.getAttribute("placeholder"));
		
		WebElement pw=d.findElement(By.name("pwd"));
		
		pw.sendKeys("admin");
		Thread.sleep(2000);
		System.out.println(pw.getAttribute("value"));
		System.out.println(un.getLocation());
		System.out.println(un.getRect());
		System.out.println(un.getSize());
		
		
		
		WebElement chk=d.findElement(By.name("remember"));
		
		if (chk.isDisplayed()) {
			System.out.println("check box displayed");
		}
		if (chk.isEnabled()) {
			System.out.println("check is enabled");
		}
		if (chk.isSelected()) {
			System.out.println("slected ");
		}
		else {
			System.out.println("click");
			chk.click();
		}
	}

}
