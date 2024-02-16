package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
// WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public  void clickMyAccount() {
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(10));
	      //Thread.sleep(5000);
	    w.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//span[text()='My Account']")))).click();
		
	}
	public  void clickRegister() {
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
	}
	public  void clickLogin() {
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
	}
	public void enterProductName(String pName) {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(pName);
}
	public void clickSearch() {
		
		driver.findElement(By.xpath("//div[@id='search']//button[@type='button']")).click();
	}
}
