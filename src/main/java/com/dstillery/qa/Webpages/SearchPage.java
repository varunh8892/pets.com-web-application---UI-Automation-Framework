package com.dstillery.qa.Webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dstillery.qa.base.TestBase;

public class SearchPage extends TestBase{
	
	@FindBy(css = "div.main-body:nth-child(2) div.page-content.search-page header.intro-image-container:nth-child(1) div.title:nth-child(2) form:nth-child(2) > input:nth-child(1)")
	WebElement searchTextBox;
	
    @FindBy(xpath = "//button[@type='submit']")
	WebElement searchButton;
    
    @FindBy(xpath = "//a[@title='Home – dstillery']")
  	WebElement dstilleryLabel;
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateSearchPageTitle() {
		return driver.getTitle();
	}
	
	public boolean dstilleryLabel() {
		return dstilleryLabel.isDisplayed();
	}
	
	public SearchResultsPage searchAudience(String audience) throws InterruptedException {
		
		Thread.sleep(3000);
		searchTextBox.sendKeys(audience);
		Thread.sleep(3000);
		searchButton.click();
		Thread.sleep(3000);
		return new SearchResultsPage();
	}
}
