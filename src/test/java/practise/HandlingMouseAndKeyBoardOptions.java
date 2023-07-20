package practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMouseAndKeyBoardOptions {

	public static void main(String[] args) throws  Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver d =new ChromeDriver();
		
		d.manage().window().maximize();
	/*	d.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[text()='✕']")).click();
		
		Actions ac=new Actions(d);
		
		Thread.sleep(3000);
		// move to element 
		WebElement fash=d.findElement(By.xpath("//div[text()='Fashion']"));
		
		ac.moveToElement(fash).perform();
		
		
		Thread.sleep(3000);
		// perform Doube click 
		
		
		WebElement search=d.findElement(By.name("q"));
		
		
		search.sendKeys("mobile");
		Thread.sleep(3000);
		ac.doubleClick(search).perform();
		
		
		// Right click 
		
		Thread.sleep(3000);
		search.clear();
WebElement searchbar=d.findElement(By.name("q"));
		
	
		Thread.sleep(3000);
		ac.contextClick(searchbar).perform();
		
		
		// robot class
		
	 Robot	rt =new Robot();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
		*/
		
		d.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(3000);
		Actions ac=new Actions(d);
		
		WebElement src=d.findElement(By.id("box3"));
		Thread.sleep(3000);
		WebElement des=d.findElement(By.id("box106"));
		
		
		
		Thread.sleep(3000);
		
		ac.dragAndDrop(src,des).perform();
		
	}
}
