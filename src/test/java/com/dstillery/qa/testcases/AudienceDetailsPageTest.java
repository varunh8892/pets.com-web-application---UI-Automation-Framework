package com.dstillery.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dstillery.qa.Webpages.AudienceDetailsPage;
import com.dstillery.qa.Webpages.SearchPage;
import com.dstillery.qa.Webpages.SearchResultsPage;
import com.dstillery.qa.base.TestBase;

public class AudienceDetailsPageTest extends TestBase{
	
    SearchPage SearchPageobj;
	SearchResultsPage SearchResultsPageobj;
	AudienceDetailsPage AudienceDetailsPageobj;
	
	public AudienceDetailsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		SearchPageobj = new SearchPage();
		SearchResultsPageobj = new SearchResultsPage();
	}
	
	@Test(priority = 1 )
	public void verifyDogLoversAudienceLabel() throws InterruptedException {
		SearchResultsPageobj = SearchPageobj.searchAudience(prop.getProperty("audience"));
		AudienceDetailsPageobj = new  AudienceDetailsPage();
		AudienceDetailsPageobj = SearchResultsPageobj.ClickOnDogLoverslink();
		Assert.assertEquals(AudienceDetailsPageobj.Dogloverslabeltext(), "DOG LOVERS" );
		Thread.sleep(3000);
	}
	
	@Test(priority = 2 )
	public void verifyCatLoversAudienceLabel() throws InterruptedException {
		SearchResultsPageobj = SearchPageobj.searchAudience(prop.getProperty("audience1"));
		AudienceDetailsPageobj = new  AudienceDetailsPage();
		AudienceDetailsPageobj = SearchResultsPageobj.ClickOnCatLoverslink();
		Assert.assertEquals(AudienceDetailsPageobj.Catloverslabeltext(), "CAT LOVERS" );
		Thread.sleep(3000);
	}
	
	@Test(priority = 3 )
	public void verifyBirdWatchingAudienceLabel() throws InterruptedException {
		SearchResultsPageobj = SearchPageobj.searchAudience(prop.getProperty("audience2"));
		AudienceDetailsPageobj = new  AudienceDetailsPage();
		AudienceDetailsPageobj = SearchResultsPageobj.ClickOnBirdWatchinglink();
		Assert.assertEquals(AudienceDetailsPageobj.BirdWatchinglabeltext(), "BIRD WATCHING" );
		Thread.sleep(3000);
	}
	
	 @AfterMethod
	    public void tearDown() {
		driver.quit();
	    }
	
}
