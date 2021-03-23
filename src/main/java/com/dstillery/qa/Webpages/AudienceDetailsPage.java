package com.dstillery.qa.Webpages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dstillery.qa.base.TestBase;

public class AudienceDetailsPage extends TestBase {

	@FindBy(xpath="//h1[contains(text(),'DOG LOVERS')]")
	WebElement DOGLOVERSLABEL;
	
	@FindBy(xpath="//h1[contains(text(),'CAT LOVERS')]")
	WebElement CATLOVERSLABEL;
	
	@FindBy(xpath="//h1[contains(text(),'BIRD WATCHING')]")
	WebElement BIRDWATCHINGLABEL;
	
	 public  AudienceDetailsPage() {
			PageFactory.initElements(driver, this);
		}
	
	 public String  Dogloverslabeltext(){
	    	return DOGLOVERSLABEL.getText();
	    }
	
	 public String  Catloverslabeltext(){
	    	return CATLOVERSLABEL.getText();
	    }
	 
	 public String  BirdWatchinglabeltext(){
	    	
	    	return BIRDWATCHINGLABEL.getText();
	    }
}
