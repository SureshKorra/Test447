package practise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Pom {

	//declaration
	
	@FindBy(id = "username")private WebElement un;
	@FindBy(name = "pwd")private WebElement pw;
	@FindBy(xpath = "//div[text()='Login ']")private WebElement lpginBtn;
	
	public WebElement getUn() {
		return un;
	}


	public void setUn(String untb) {
		un.sendKeys(untb);
	}


	public WebElement getPw() {
		return pw;
	}


	public void setPw(String pwd) {
		pw.sendKeys(pwd);
	}


	public WebElement getLpginBtn() {
		return lpginBtn;
	}


	public void setLpginBtn( ) {
		lpginBtn.click();
	}


	
	// utilization
	
	public LoginPage_Pom() {
		PageFactory.initElements(BaseTest.d, this);
	}
	// business logic class
	public void loginToApps(String untb, String pwd){
		un.sendKeys(untb);
		pw.sendKeys(pwd);
		lpginBtn.click();
	}
	
}
