package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgFlags {
	
	@Test(priority = 1)
public  void run() {
		
		Reporter.log("sumo class");
		
	}
	@Test( invocationCount = 2, enabled = true)
public  void bun() {
		
		Reporter.log("remo class");
		
	}
@Test( dependsOnMethods = {"run","bun"})
public  void gun() {
	
	Reporter.log("demo class");
}
}
