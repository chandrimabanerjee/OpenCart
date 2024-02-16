package testCases;

import java.time.Duration;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_01_AccountRegistration extends BaseClass {

	@Test(groups= {"regression","master"})
	public void verify_Registration() {
		logger.info("starting TC01");
		try {
		HomePage h=new HomePage(driver);
		logger.info("Click on my Account");
		h.clickMyAccount();
		logger.info("Click on registration link");
		h.clickRegister();
		logger.info("Entering customer information---");
		AccountRegistrationPage arp=new AccountRegistrationPage(driver);
		arp.setFirstName(randomeString().toUpperCase());
		arp.setLastName(randomeString().toUpperCase());
		arp.setEmail(randomeString()+"@gmail.com");
		arp.setPhone(randomeNumber());
		String pass=randomAlphaNumeric();
		arp.setPassword(pass);
		arp.reenterPassword(pass);
		arp.clickcheckbox();
		arp.clickcontinue();
		String str=arp.confirmation();
		
		Assert.assertEquals(str, "Your Account Has Been Created!!");}
		catch(Exception e){
			logger.error("Test failed");
			Assert.fail();
		}
		logger.info("Test case finish");
	}


}
