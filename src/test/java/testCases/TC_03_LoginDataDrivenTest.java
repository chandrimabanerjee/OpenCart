package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_03_LoginDataDrivenTest extends BaseClass {

	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	void DataDrivenLogin(String email,String password,String exp) {
		logger.info("---start TC03---");
		try {
		HomePage h1=new HomePage(driver);
		logger.info("Click on my Account");
		h1.clickMyAccount();
		logger.info("Click on login");
		
		h1.clickLogin();
		
		LoginPage l= new LoginPage(driver);
		logger.info("fill the details-");
		l.fillEamil(email);
		l.fillPassword(password);
		//l.fillEamil("hime.sen@gmail.com");
		//l.fillPassword("himasen");
		
		l.clicksetLogin();
		logger.info("click on login button");
		
		logger.info("Validate the details");
		//My Account Page
		MyAccountPage macc=new MyAccountPage(driver);
				
		boolean targetPage=macc.isMyAccountPageExists();
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetPage==true)
			{
				macc.logout();;
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetPage==true)
			{
				macc.logout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
	}
	catch(Exception e)
	{
		Assert.fail("An exception occurred: " + e.getMessage());
	}
		
	logger.info("**** Finished TC_003_LoginDDT *****");
}









		

	}

