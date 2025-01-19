package OrangeHRMTest.OrangeHRMTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethod {
	WebDriver driver;

	@Test(priority=1)
	void  openapp() {
		
		
		Assert.assertTrue(false);
	}
	@Test(priority=2,dependsOnMethods={"openapp"})
	void login() {
		Assert.assertTrue(true);
	}
	@Test(priority=3,dependsOnMethods = {"login"})
	void search() {
		Assert.assertTrue(true);
	}
	@Test(priority=4,dependsOnMethods = {"login","search"})
	void advnsearch() {
		Assert.assertTrue(true);
		
	}
	@Test(priority=5)
	void logout() {
		Assert.assertTrue(true);
	}

}
