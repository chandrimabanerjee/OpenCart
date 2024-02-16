package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountRegistrationPage extends BasePage {
//WebDriver driver;
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public  void setFirstName(String firstname) {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
	}
	public  void setLastName(String lastname) {
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
	}
	public  void setEmail(String email) {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
	}
	public  void setPhone(String phone) {
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys(phone);
	}
	
	public  void setPassword(String password) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}
	public  void reenterPassword(String password) {
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(password);
		
	}
	public void setPrivacyPolicy() {
		driver.findElement(By.xpath("//input[@name='agree']")).click();

	}

	public  void clickcheckbox() {
		driver.findElement(By.xpath("//input[ @type='checkbox']")).click();
		
	}
	public  void clickcontinue() {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
	}
	public  String confirmation() {
		try {
			return (driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

		
	}	
	
	
}
