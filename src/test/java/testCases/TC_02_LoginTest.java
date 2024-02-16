package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_02_LoginTest extends BaseClass{

	
	@Test(groups= {"sanity","master"})
	
	public void Login() {
		
		
			
		logger.info("---start TC02---");
		try {
		HomePage h1=new HomePage(driver);
		logger.info("Click on my Account");
		h1.clickMyAccount();
		logger.info("Click on login");
		
		h1.clickLogin();
		
		LoginPage l= new LoginPage(driver);
		logger.info("fill the details-");
		l.fillEamil(p.getProperty("email"));
		l.fillPassword(p.getProperty("password"));
		//l.fillEamil("hime.sen@gmail.com");
		//l.fillPassword("himasen");
		Thread.sleep(5000);
		l.clicksetLogin();
		logger.info("click on login button");
		Thread.sleep(5000);
		logger.info("Validate the details");
		//My Account Page
		MyAccountPage macc=new MyAccountPage(driver);
				
		boolean targetPage=macc.isMyAccountPageExists();
		if(targetPage==true)
		
		{Assert.assertTrue(true);
		
		}
		else {
			Assert.fail();
			}
	}
		catch(Exception e)
		{
			logger.error("Test failed");
			Assert.fail();
		}
		
		logger.info("Test Completed");
	}
}
