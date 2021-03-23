package com.dstillery.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dstillery.qa.Webpages.SearchPage;
import com.dstillery.qa.Webpages.SearchResultsPage;
import com.dstillery.qa.base.TestBase;
import com.dstillery.qa.util.TestUtil;

public class SearchPageTest extends TestBase{

    SearchPage SearchPageobj;
    
	SearchResultsPage SearchResultsPageobj;
	public SearchPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		SearchPageobj = new SearchPage();
	}
	
	@Test(priority = 1 )
	public void VerifySearchPageTitleTest() {
		String title = SearchPageobj.validateSearchPageTitle();
		Assert.assertEquals(title, "Search - Dstillery Audiences");
	}
	
	@Test(priority = 2 )
	public void VerifyDogSearchResultspageAppearance() throws InterruptedException  {
		SearchResultsPageobj = SearchPageobj.searchAudience(prop.getProperty("audience"));
		Thread.sleep(3000);
	}
	
	@Test(priority = 3 )
	public void VerifyCatSearchresultspageAppearance() throws InterruptedException  {
		SearchResultsPageobj = SearchPageobj.searchAudience(prop.getProperty("audience1"));
		Thread.sleep(3000);
	}
	
	@Test(priority = 4 )
	public void VerifyBirdSearchresultspageAppearance() throws InterruptedException  {
		SearchResultsPageobj = SearchPageobj.searchAudience(prop.getProperty("audience2"));
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
