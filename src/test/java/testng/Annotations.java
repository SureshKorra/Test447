package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public abstract class Annotations {

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("coonect to the DataBase", true);
	}
	 @AfterSuite
	 public void afterSuite() {
		 Reporter.log("Dissconect the Db", true);
	 }
	 
	 @BeforeTest
	 public void beforeTest() {
		 
	 }
}
