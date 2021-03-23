package com.dstillery.qa.Webpages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dstillery.qa.base.TestBase;

public class SearchResultsPage extends TestBase{

    @FindBy(css = "tr td a")
	public List<WebElement> ActualDogsearchresults;
    
    @FindBy(xpath = "//a[@href='/explore/interest/Dog-Lovers-19758']")
   	WebElement DogLoversLink;
    
    @FindBy(xpath = "//div[@class='num-results']")
   	WebElement DogResultsHeading;
    
    @FindBy(css = "tr td a")
   	public List<WebElement> ActualCatsearchresults;
    
    @FindBy(xpath = "//a[contains(text(),'Cat Lovers')]")
   	WebElement CatLoversLink;
    
    @FindBy(xpath = "//div[@class='num-results']")
   	WebElement  CatResultsHeading;
    
    @FindBy(css = "tr td a")
	public List<WebElement> ActualBirdsearchresults;
    
    @FindBy(xpath = "//tr[1]//td[2]//a[1]")
   	WebElement BirdWatchingLink;
    
    @FindBy(xpath = "//div[@class='num-results']")
   	WebElement BirdResultsHeading;
    
     public  SearchResultsPage() 
     {
		PageFactory.initElements(driver, this);
	 }
    
    public int DogSearchresultssize() 
     {
    	return ActualDogsearchresults.size();
     }
    
     public String DogResultsHeadingtext() 
     {
    	return DogResultsHeading.getText();
     }
     
     public List<WebElement>  Dogsearchresults()
     {
    	return ActualDogsearchresults;
     }
    
	public String DogLoverslinkText() 
	{
	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,1000)");
		String DogLoverslinkText = DogLoversLink.getText();
		return DogLoverslinkText;
	}
	
	   public AudienceDetailsPage ClickOnDogLoverslink() 
	    {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	js.executeScript("window.scrollBy(0,1000)");
	    	DogLoversLink.isDisplayed();
	    	DogLoversLink.isEnabled();
	    	DogLoversLink.click();
	    	return new AudienceDetailsPage();
	    }
	 
    public int CatSearchresultssize() 
    {
    	return ActualCatsearchresults.size();
    }
    
    public String CatResultsHeadingtext() 
    {
    	return CatResultsHeading.getText();
    }
    
    public List<WebElement>  Catsearchresults()
    {
    	return ActualCatsearchresults;
    }
	
	public String CatloverslinkText() 
	{
	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,1000)");
		String CatloverslinkText = CatLoversLink.getText();
		return CatloverslinkText;
	}
	
	public AudienceDetailsPage ClickOnCatLoverslink() 
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,1000)");
    	CatLoversLink.isDisplayed();
    	CatLoversLink.isEnabled();
    	CatLoversLink.click();
    	return new AudienceDetailsPage();
    }
	
	public int BirdSearchresultssize() 
    {
   	return ActualBirdsearchresults.size();
    }
   
    public String BirdResultsHeadingtext() 
    {
   	return BirdResultsHeading.getText();
    }
    
    public List<WebElement>  Birdsearchresults()
    {
   	return ActualBirdsearchresults;
    }
   
	public String BirdWatchinglinkText() 
	{
	JavascriptExecutor js = (JavascriptExecutor) driver;
   	js.executeScript("window.scrollBy(0,1000)");
		String BirdWatchinglinkText = BirdWatchingLink.getText();
		return BirdWatchinglinkText;
	}
	
	   public AudienceDetailsPage ClickOnBirdWatchinglink() 
	    {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	js.executeScript("window.scrollBy(0,1000)");
	    	BirdWatchingLink.isDisplayed();
	    	BirdWatchingLink.isEnabled();
	    	BirdWatchingLink.click();
	    	return new AudienceDetailsPage();
	    }
}
