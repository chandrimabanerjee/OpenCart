package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isMyAccountPageExists()   // MyAccount Page heading display status
	{
		try {
			return (driver.findElement(By.xpath("//div[@id='content']/h2[text()='My Account']")).isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}

	public void logout() {
		driver.findElement(By.xpath("//a[text()='Logout' and @class='list-group-item']")).click();
	}
	

	
}
