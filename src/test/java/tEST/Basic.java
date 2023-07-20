package tEST;

import java.time.Duration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic {
public static void main(String[] args) throws Throwable {
	
	
	WebDriverManager.chromedriver().setup();
	 
WebDriver d =new ChromeDriver();

d.get("https://www.amazon.in/");
Thread.sleep(3000);

WebElement ee=d.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));
Thread.sleep(3000);
Point po=ee.getLocation();
System.out.println(po);
JavascriptExecutor jse =(JavascriptExecutor)d;
jse.executeScript("window.scrollBy"+po);




}}
