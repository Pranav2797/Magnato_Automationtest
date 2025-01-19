package PageObject;

import javax.print.DocFlavor.BYTE_ARRAY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	// constructor
	LoginPage(WebDriver driver){
		this.driver=driver;
	}
	// locators
	By text_username_loc=By.xpath("//input[@placeholder='Username']");
	By text_pasword_loc=By.xpath("//input[@placeholder='Password']");
	By btn_login_loc=By.xpath("//button['normalize.space()=login']");
	
	// Action method 
	public void SetUserName(String user) {
		driver.findElement(text_username_loc).sendKeys(user);
	}
	public void setPasword(String pwd) {
		driver.findElement(text_pasword_loc).sendKeys(pwd);
	}
	public void clickLogin() {
		driver.findElement(btn_login_loc).click();
	}

}
