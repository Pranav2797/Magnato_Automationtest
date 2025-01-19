package OrangeHRMTest.OrangeHRMTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo {
	@BeforeMethod
	void Login() {
		System.out.println("This is login");
	}
	@Test(priority=1)
	void Search(){
		System.out.println();
	}
	
	@Test(priority=2)
	void advacedsearch() {
		System.out.println("this is search");
	}
	@AfterMethod
	void Logout() {
		System.out.println("this is logout..");
	}
	

}
