package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_004_SearchProductTest extends BaseClass {

	@Test(groups= {"master"})
	public void verify_pruductSearch() throws InterruptedException {
		logger.info(" Starting TC_004_SearchProductTest ");

		try {
			
			HomePage hm=new HomePage(driver);
			System.out.println("driver="+driver);
			//hm.enterProductName("iPhone");
			hm.enterProductName("mac");
			
			hm.clickSearch();
			Thread.sleep(3000);
			logger.info("searching complete");
			
			SearchPage dm=new SearchPage(driver);
			System.out.println("driver="+driver);
			boolean s=dm.isProductExist("MacBook");

			Assert.assertEquals(s,true);

		} catch (Exception e) {
			Assert.fail();
		}

		logger.info(" Finished TC_004_SearchProductTest ");

	}
}