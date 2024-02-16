package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchPage extends BasePage
{   
			
	public SearchPage(WebDriver driver)
	{
		super(driver);
	}	
			
		public boolean isProductExist(String productName)
		{
			
			boolean flag=false;
			for(WebElement product:(driver.findElements(By.xpath("//div[@class='image']//a//img"))))
			{				
				if(product.getAttribute("title").equals(productName))
				{
				flag=true;
				break;
				}
			}
			
			return flag;
		
		}
		
		public void selectProduct(String productName)
		{
			for(WebElement product:(driver.findElements(By.xpath("//div[@class='image']//a//img"))))
			{				
				if(product.getAttribute("title").equals(productName))
				{
					product.click();
				}
			}
		
		}
		
		public void setQuantity(String qty) throws InterruptedException
		{   WebElement s=driver.findElement(By.xpath("//input[@id='input-quantity']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='';", s);
			//s.clear();
		Thread.sleep(1000);
			s.sendKeys(qty);
		}
		
		public void addToCart()
		{
			(driver.findElement(By.xpath("//button[text()='Add to Cart']"))).click();
		}
		
		public boolean checkConfMsg()
		{
			try
			{
			return (driver.findElement(By.xpath("//div[contains(text(),'Success: You have added')]"))).isDisplayed();
			}
			catch(Exception e)
			{
				return false;
			}
		}
		
}

