package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public  void fillEamil(String Email) {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(Email);		
	}
	public  void fillPassword(String Pass) {
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(Pass);		
	}
	public  void clicksetLogin() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
	}
	
}
