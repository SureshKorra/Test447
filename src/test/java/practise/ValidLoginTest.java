package practise;

import org.openqa.selenium.By;

import FrameWorks.WebCommonLib;

public class ValidLoginTest extends BaseTest {
public static void main(String[] args) throws Throwable {
	
	BaseTest bt=new BaseTest();
	bt.openBrowser();
	
	WebCommonLib wlib=new WebCommonLib();
	String actualTitle=wlib.getPageTitle();
	
	FileLib flib=new FileLib();
	String expectedTitle=flib.readPropertyData(proppath, "loginTitle");
	wlib.verify(actualTitle, expectedTitle, "LoginPage");
	
//wlib.verify(wlib.getPageTitle(), flib.readPropertyData(proppath, "loginTitle"), "LoginPage");
wlib.waitForPageTitle(flib.readPropertyData(proppath, "loginTitle"));
String un = flib.readPropertyData(proppath, "username");
d.findElement(By.id("username")).sendKeys(un);

String pwd=flib.readPropertyData(proppath, "password");
d.findElement(By.name("pwd")).sendKeys(pwd);

d.findElement(By.xpath("//div[text()='Login ']")).click();

// verify home page
wlib.waitForPageTitle(flib.readPropertyData(proppath, "homeTitle"));
wlib.verify(wlib.getPageTitle(), flib.readPropertyData(proppath, "homeTitle"), "actiTIME - Enter Time-Track");

}}
