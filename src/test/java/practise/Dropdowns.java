package practise;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d =new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("file:///C:/Users/Suresh/Desktop/ESRI%20-works/singleselectDropdown.html");
		
	// System.out.println(d.getTitle());	
//	WebDriverWait wait =new WebDriverWait(d, Duration.ofSeconds(120));
//		wait.until(ExpectedConditions.titleContains("Dropdown | Semantic UI"));
		
 WebElement singledropdown	=d.findElement(By.id("single-select"));
		
			Select sel=new Select(singledropdown);
		//sel.selectByVisibleText("Boston");
			sel.selectByValue("bos");
		singledropdown.click();
		
		
		// multi select dropdown
		
	 	 d.get("file:///C:/Users/Suresh/Desktop/ESRI%20-works/multiselectDropdown.html");
		
	 	 WebElement mul=d.findElement(By.id("single-select"));
	 	     
	 	Select muld= new Select(mul);
	 	 
	 	 
		if (muld.isMultiple()) {
			System.out.println("multiple dropdown");
		}
		
		else {
			System.out.println("single dropdown");
		}
	
	
	muld.selectByVisibleText("Paris");
	
	// get one by one all dropdowns names
	List<WebElement> all=muld.getOptions();
	
	for(int i=0;i<all.size();i++) {
		
		System.out.println(all.get(i).getText());
		
	}
	
	System.out.println(muld.getWrappedElement().getText());
	
	
	
	}

}
