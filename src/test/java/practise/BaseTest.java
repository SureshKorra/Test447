package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import FrameWorks.FileLib;
import FrameWorks.IAutoConsts;

public class BaseTest implements IAutoConsts {

	public static WebDriver d;
public void openBrowser() throws Throwable {
	
	FileLib flib=new FileLib();
	String browserValue=flib.readPropertyData(proppath, "browser");
	
	if(browserValue.equalsIgnoreCase("chrome")) {
		d=new ChromeDriver();
		
	}
	else {
		System.out.println("Enter proper bowser name");
	}
	
	d.manage().window().maximize();
	String appurl=flib.readPropertyData(proppath, "url");
	d.get(appurl);
	
}

public void closeBrowser() {
	d.quit();
}
}
