package practise;

import FrameWorks.WebCommonLib;

public class POM_TestClass extends BaseTest{

	public static void main(String[] args) throws Throwable {
		 BaseTest bt=new BaseTest();
		 bt.openBrowser();
		 
		 LoginPage_Pom lp=new LoginPage_Pom();
		 
		FileLib flib= new FileLib();
		
		lp.loginToApps(flib.readPropertyData(proppath,"username"),flib.readPropertyData(proppath, "password") );
		
		WebCommonLib wlib=new WebCommonLib();
		wlib.waitForPageTitle(flib.readPropertyData(proppath, "homeTitle"));
		
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(proppath, "homeTitle"), "actiTIME - Enter Time-Track");

	}

}
