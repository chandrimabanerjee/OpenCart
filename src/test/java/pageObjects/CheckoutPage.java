package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage{

	
	public CheckoutPage(WebDriver driver)
	{
		super(driver);
	}			
	

	
	

	public void setfirstName(String firstName) {
		driver.findElement(By.xpath("//input[@id='input-payment-firstname']")).sendKeys(firstName);
	}


	public void setlastName(String lastName) {
		driver.findElement(By.xpath("//input[@id='input-payment-lastname']")).sendKeys(lastName);
	}


	public void setaddress1(String address1) {
		driver.findElement(By.xpath("//input[@id='input-payment-address-1']")).sendKeys(address1);
	}


	public void setaddress2(String address2) {
		driver.findElement(By.xpath("//input[@id='input-payment-address-2']")).sendKeys(address2);
	}


	public void setcity(String city) {
		driver.findElement(By.xpath("//input[@id='input-payment-city']")).sendKeys(city);
	}


	public void setpin(String pin) {
		driver.findElement(By.xpath("//input[@id='input-payment-postcode']")).sendKeys(pin);
	}


	public void setCountry(String Country) {
		new Select(driver.findElement(By.xpath("//select[@id='input-payment-country']"))).selectByVisibleText(Country);
	}


	public void setState(String State) {
		new Select(driver.findElement(By.xpath("//select[@id='input-payment-zone']"))).selectByVisibleText(State);
	}
	
	public void clickOnContinueAfterBillingAddress()
	{
		driver.findElement(By.xpath("//input[@id='button-payment-address']")).click();
	}
	
	public void clickOnContinueAfterDeliveryAddress()
	{
		driver.findElement(By.xpath("//input[@id='button-shipping-address']")).click();
	}
	
	
	public void setDeliveryMethodComment(String deliverymsg)
	{
		driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys(deliverymsg);
		
	}
	
	public void clickOnContinueAfterDeliveryMethod()
	{
		driver.findElement(By.xpath("//input[@id='button-shipping-method']")).click();
	}
	
	public void selectTermsAndConditions()
	{
		driver.findElement(By.xpath("//input[@name='agree']")).click();
	}
	
	public void clickOnContinueAfterPaymentMethod()
	{
		driver.findElement(By.xpath("//input[@id='button-payment-method']")).click();
	}
	
	public String  getTotalPriceBeforeConfOrder()
	{
		return driver.findElement(By.xpath("//strong[text()='Total:']//following::td")).getText(); //$207.00
		
	}
	
	public void clickOnConfirmOrder() {
		driver.findElement(By.xpath("//input[@id='button-confirm']")).click();
	}
	
	public boolean isOrderPlaced() throws InterruptedException
	{
		try
		{
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='button-confirm']")).click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//*[@id='content']/h1")).getText().equals("Your order has been placed!"))
			return true;
		else
			return false;
		}catch(Exception e)
		{
			return false;
		}
		
	}
	
}
