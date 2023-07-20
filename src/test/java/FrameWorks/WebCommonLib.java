package FrameWorks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import practise.BaseTest;

public class WebCommonLib {

	public void verify(String actualTitle, String expectedTitle, String page) {
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println(page+"is displayed, PASS");
		}
		else {
			System.out.println(page+"is not displayed, Fail");
		}
	}
	public String getPageTitle() {
	 String	title=BaseTest.d.getTitle();
	 return title;
	}
	public void waitForPageTitle(String title) {
	    WebDriverWait wait=new WebDriverWait(BaseTest.d, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.titleContains(title));
	}
	public void selectOptions(WebElement element, String text) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public void selectOptions(String value,WebElement element) {
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void selectOptions(int index,WebElement element) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void mouseHover(WebElement element) {
		Actions ac=new Actions(BaseTest.d);
		ac.moveToElement(element).perform();
	}
	public void rightClick(WebElement element) {
		Actions ac=new Actions(BaseTest.d);
		ac.contextClick(element).perform();
	}
	public void getScreenShot(String path) throws Throwable {
		TakesScreenshot ts=(TakesScreenshot)BaseTest.d;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest= new File(path);
		Files.copy(src, dest);
	}
	public void getElementScreenShot(WebElement element ,String path) throws Throwable {
		File src=element.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		Files.copy(src, dest);
	}
	public void switchToFrame(int index) {
		BaseTest.d.switchTo().frame(index);
	}
	public void switchToFrame(String value) {
		BaseTest.d.switchTo().frame(value);
	}
	public void switchToFrame(WebElement element) {
		BaseTest.d.switchTo().frame(element);
	}
}
