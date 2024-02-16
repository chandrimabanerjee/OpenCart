package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ShoppingCartPage extends BasePage
	{
	public ShoppingCartPage(WebDriver driver)
	{
		super(driver);
	}
		
	public void clickItemsToNavigateToCart()
	{
		driver.findElement(By.xpath("//div[@id='cart']")).click();
	}
	
	public void clickViewCart()
	{
		driver.findElement(By.xpath("//strong[normalize-space()='View Cart']")).click();
	}
	
	public String getTotalPrice()
	{
		return driver.findElement(By.xpath("//*[@id='content']/div[2]/div/table//strong[text()='Total:']//following::td")).getText();
	}
	
	public void clickOnCheckout()
	{
		driver.findElement(By.xpath("//a[text()='Checkout']")).click();
	}
}
