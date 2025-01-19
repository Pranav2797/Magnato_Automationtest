package OrangeHRMTest.OrangeHRMTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMTestTest {
	WebDriver driver;
	@Test(priority=1)
	void Openapp()
	{
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test(priority=2)
	void TrstLogo() throws InterruptedException {
		Thread.sleep(500);
		boolean satus=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("logo displayed:"+satus);
		
	}
	@Test(priority=3)
	void TestLogin() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	}
	@Test(priority=4)
	
	void close() {
		driver.quit();
	}
	
  
 
}
