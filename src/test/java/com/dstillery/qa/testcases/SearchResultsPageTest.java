package com.dstillery.qa.testcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dstillery.qa.Webpages.SearchPage;
import com.dstillery.qa.Webpages.SearchResultsPage;
import com.dstillery.qa.base.TestBase;

public class SearchResultsPageTest extends TestBase{
    SearchPage SearchPageobj;
    
	SearchResultsPage SearchResultsPageobj;
	
	public SearchResultsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		SearchPageobj = new SearchPage();
		SearchResultsPageobj = new SearchResultsPage();
	}
	
	@Test(priority = 1 )
	public void VerifyDogResultsetSize() throws InterruptedException{
		SearchResultsPageobj = SearchPageobj.searchAudience(prop.getProperty("audience"));
		Assert.assertEquals(SearchResultsPageobj.DogSearchresultssize(), 20);
	}
	
	@Test(priority = 2 )
	public void VerifyDogResultsHeadingtext() throws InterruptedException{
		SearchResultsPageobj = SearchPageobj.searchAudience(prop.getProperty("audience"));
		String exp = "20 Results for \"dog\"";
		Assert.assertEquals(SearchResultsPageobj.DogResultsHeadingtext(), exp);
	}
	
	@Test(priority = 3 )
	public void VerifyDogResultssetlinksTexts() throws InterruptedException{
		SearchResultsPageobj = SearchPageobj.searchAudience(prop.getProperty("audience"));
		List<String> ExpectedsearchresultsDogs = new ArrayList<String>();
		ExpectedsearchresultsDogs.add("Dog Lovers");
		ExpectedsearchresultsDogs.add("Dog Breed Researchers");
		ExpectedsearchresultsDogs.add("Veterinarians");
		ExpectedsearchresultsDogs.add("Pet Lovers");
		ExpectedsearchresultsDogs.add("Pet Owners");
		ExpectedsearchresultsDogs.add("Pet Adoption");
		ExpectedsearchresultsDogs.add("Pet Supplies");
		ExpectedsearchresultsDogs.add("Pet Cluster");
		ExpectedsearchresultsDogs.add("Cat Lovers");
		ExpectedsearchresultsDogs.add("Pet Food Shoppers");
		ExpectedsearchresultsDogs.add("Exotic Pets");
		ExpectedsearchresultsDogs.add("Pet Forums");
		ExpectedsearchresultsDogs.add("Animal Rights Researchers");
		ExpectedsearchresultsDogs.add("Horse Owners");
		ExpectedsearchresultsDogs.add("Bird and Parrot Lovers");
		ExpectedsearchresultsDogs.add("Hunting");
		ExpectedsearchresultsDogs.add("Natural Pet Food Shoppers");
		ExpectedsearchresultsDogs.add("Animal Humane Society Helpers");
		ExpectedsearchresultsDogs.add("Hunters");
		ExpectedsearchresultsDogs.add("Horse Racing");
		
		List<WebElement> actualresults=SearchResultsPageobj.ActualDogsearchresults;
		
		for (int i = 0 ; i < actualresults.size();i++) {
			System.out.println("Actual result number "+ i +" "+actualresults.get(i).getText());
		}
		
		for (int i = 0 ; i < actualresults.size();i++) {
			Assert.assertEquals(actualresults.get(i).getText(), ExpectedsearchresultsDogs.get(i));
		}
	    }
	
	  @Test(priority = 4 )
	  public void VerifyDogLoversLinkText() throws InterruptedException {
		  SearchResultsPageobj = SearchPageobj.searchAudience(prop.getProperty("audience"));
	  Assert.assertEquals(SearchResultsPageobj.DogLoverslinkText(), "Dog Lovers" );
	  Thread.sleep(3000);
	  }
	  
	  @Test(priority = 5 )
	  public void VerifyDogLoversLink() throws InterruptedException {
		  SearchResultsPageobj = SearchPageobj.searchAudience(prop.getProperty("audience"));
	  SearchResultsPageobj.ClickOnDogLoverslink();
	  Thread.sleep(3000);
	  }
	  
	    @Test(priority = 6 )
		public void VerifyCatResultsetSize() throws InterruptedException{
			SearchResultsPageobj = SearchPageobj.searchAudience(prop.getProperty("audience1"));
			Assert.assertEquals(SearchResultsPageobj.CatSearchresultssize(), 20);
		}
		
		@Test(priority = 7 )
		public void VerifyCatResultsHeadingtext() throws InterruptedException{
			SearchResultsPageobj = SearchPageobj.searchAudience(prop.getProperty("audience1"));
			String exp = "20 Results for \"cat\"";
			Assert.assertEquals(SearchResultsPageobj.CatResultsHeadingtext(), exp);
		}
	
		@Test(priority = 8 )
		public void VerifyCatLoversLinkText() throws InterruptedException {
			SearchResultsPageobj = SearchPageobj.searchAudience(prop.getProperty("audience1"));	
		Assert.assertEquals(SearchResultsPageobj.CatloverslinkText(), "Cat Lovers" );
		Thread.sleep(3000);
		}
		
		 @Test(priority = 9 )
		 public void VerifyCatLoversLink() throws InterruptedException {
			 SearchResultsPageobj = SearchPageobj.searchAudience(prop.getProperty("audience1"));
		 SearchResultsPageobj.ClickOnCatLoverslink();
		 Thread.sleep(3000);
		  }
	
		 @Test(priority = 10 )
			public void VerifyCatResultssetlinksTexts() throws InterruptedException{
				SearchResultsPageobj = SearchPageobj.searchAudience(prop.getProperty("audience1"));
				List<String> ExpectedsearchresultsCats = new ArrayList<String>();
				ExpectedsearchresultsCats.add("Cat Lovers");
				ExpectedsearchresultsCats.add("Dog Lovers");
				ExpectedsearchresultsCats.add("Dog Breed Researchers");
				ExpectedsearchresultsCats.add("Pet Lovers");
				ExpectedsearchresultsCats.add("Pet Owners");
				ExpectedsearchresultsCats.add("Pet Adoption");
				ExpectedsearchresultsCats.add("Pet Supplies");
				ExpectedsearchresultsCats.add("Pet Cluster");
				ExpectedsearchresultsCats.add("Exotic Pets");
				ExpectedsearchresultsCats.add("Pet Forums");
				ExpectedsearchresultsCats.add("Veterinarians");
				ExpectedsearchresultsCats.add("Pet Food Shoppers");
				ExpectedsearchresultsCats.add("Animal Rights Researchers");
				ExpectedsearchresultsCats.add("Bird and Parrot Lovers");
				ExpectedsearchresultsCats.add("Natural Pet Food Shoppers");
				ExpectedsearchresultsCats.add("Animal Humane Society Helpers");
				ExpectedsearchresultsCats.add("Petsmart");
				ExpectedsearchresultsCats.add("Reptile Enthusiasts");
				ExpectedsearchresultsCats.add("African-American Hair");
				ExpectedsearchresultsCats.add("Anime");
				
				List<WebElement> actualresults=SearchResultsPageobj.ActualCatsearchresults;
				
				for (int i = 0 ; i < actualresults.size();i++) {
					
					System.out.println("Actual result number "+ i +" "+actualresults.get(i).getText());
				}
				
				for (int i = 0 ; i < actualresults.size();i++) {
					Assert.assertEquals(actualresults.get(i).getText(), ExpectedsearchresultsCats.get(i));
				}
			    } 
		 
		 @Test(priority = 11 )
   		public void VerifyBirdResultsetSize() throws InterruptedException{
				SearchResultsPageobj = SearchPageobj.searchAudience(prop.getProperty("audience2"));
				Assert.assertEquals(SearchResultsPageobj.BirdSearchresultssize(), 20);
			}
			
			@Test(priority = 12 )
			public void VerifyBirdResultsHeadingtext() throws InterruptedException{
				SearchResultsPageobj = SearchPageobj.searchAudience(prop.getProperty("audience2"));
				String exp = "20 Results for \"bird\"";
				Assert.assertEquals(SearchResultsPageobj.BirdResultsHeadingtext(), exp);
			}
		
			@Test(priority = 13 )
			public void VerifyBirdWatchingLinkText() throws InterruptedException {
				SearchResultsPageobj = SearchPageobj.searchAudience(prop.getProperty("audience2"));	
			Assert.assertEquals(SearchResultsPageobj.BirdWatchinglinkText(), "Bird Watching" );
			Thread.sleep(3000);
			}
			
			 @Test(priority = 14 )
			 public void VerifyBirdLoversLink() throws InterruptedException {
				 SearchResultsPageobj = SearchPageobj.searchAudience(prop.getProperty("audience2"));
			 SearchResultsPageobj.ClickOnBirdWatchinglink();
			 Thread.sleep(3000);
			  }
		
			 @Test(priority = 15 )
				public void VerifyBirdResultssetlinksTexts() throws InterruptedException{
					SearchResultsPageobj = SearchPageobj.searchAudience(prop.getProperty("audience2"));
					List<String> ExpectedsearchresultsBird = new ArrayList<String>();
					ExpectedsearchresultsBird.add("Bird Watching");
					ExpectedsearchresultsBird.add("Bird and Parrot Lovers");
					ExpectedsearchresultsBird.add("Bird Watching Enthusiasts");
					ExpectedsearchresultsBird.add("Reptile Enthusiasts");
					ExpectedsearchresultsBird.add("Exotic Pets");
					ExpectedsearchresultsBird.add("Dog Breed Researchers");
					ExpectedsearchresultsBird.add("Fishing");
					ExpectedsearchresultsBird.add("Dog Lovers");
					ExpectedsearchresultsBird.add("Hunting");
					ExpectedsearchresultsBird.add("Marsh");
					ExpectedsearchresultsBird.add("Giant Eagle");
					ExpectedsearchresultsBird.add("Chick-Fil-A");
					ExpectedsearchresultsBird.add("Koi Pond Enthusiasts");
					ExpectedsearchresultsBird.add("Healthy Eaters");
					ExpectedsearchresultsBird.add("Home Aquarium Enthusiasts");
					ExpectedsearchresultsBird.add("Pet Lovers");
					ExpectedsearchresultsBird.add("Fishing Enthusiasts");
					ExpectedsearchresultsBird.add("Cat Lovers");
					ExpectedsearchresultsBird.add("Cookie Eaters");
					ExpectedsearchresultsBird.add("Animal Rights Researchers");
					
					List<WebElement> actualresults=SearchResultsPageobj.ActualBirdsearchresults;
					
					for (int i = 0 ; i < actualresults.size();i++) {
						System.out.println("Actual result number "+ i +" "+actualresults.get(i).getText());
					}
					
					for (int i = 0 ; i < actualresults.size();i++) {
						Assert.assertEquals(actualresults.get(i).getText(), ExpectedsearchresultsBird.get(i));
					}
				    } 
		 
	    @AfterMethod
	    public void tearDown() {
		driver.quit();
	    }
	
	
}
