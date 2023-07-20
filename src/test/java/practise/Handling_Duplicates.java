package practise;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Duplicates {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
	WebDriver	d =new ChromeDriver();
	
	d.get("file:///C:/Users/Suresh/Desktop/ESRI%20-works/multiselectDropdown.html");
	
	 WebElement drp=d.findElement(By.id("single-select"));

Select 	sel = new Select(drp);

 System.out.println("--------------warpped text --------------");
 
	 System.out.println(sel.getWrappedElement().getText());
	
	
	 System.out.println("--------------get options text --------------");
	
	 List<WebElement> allOp=sel.getOptions();
	
	 for(int i=0;i<allOp.size();i++) {
		 System.out.println(allOp.get(i).getText());
	 }
	 
	 
	 System.out.println("--------------Tree set options text --------------");

	
	TreeSet<String> allSorted =new TreeSet<String>();
	
	for(int i=0;i<allOp.size();i++) {
		String text= allOp.get(i).getText();
		
		allSorted.add(text);
	}
	for(String oneText: allSorted) {
		System.out.println(oneText);
	}
	
	
	System.out.println("-----------Hashset---------");
	
	List<WebElement> alloptions=sel.getOptions();
	
	HashSet<String> has=new HashSet<String>();
	for(int i=0;i<alloptions.size();i++) {
		String textt=alloptions.get(i).getText();
		has.add(textt);
			}
	
	for(String oneTex : has) {
		System.out.println(oneTex);
	}
	}
	
	

}
