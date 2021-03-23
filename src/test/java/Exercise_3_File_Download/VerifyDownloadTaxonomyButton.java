package Exercise_3_File_Download;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyDownloadTaxonomyButton {
	
	WebDriver driver;
	File folder;
	
	@BeforeMethod
	public void setUp() {
		
		folder = new File(UUID.randomUUID().toString());
		folder.mkdir();
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		Map<String,Object> prefs = new HashMap<String,Object>();
		
		prefs.put("profile.default_content_settings.popups",0);
		
		prefs.put("download.default_directory", folder.getAbsolutePath());
		
		options.setExperimentalOption("prefs", prefs);
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		
		driver = new ChromeDriver(cap);
	}
	
	    @Test
	    public void VerifyDownloadTaxonomyButton() throws InterruptedException {
		
		driver.get("https://audiences.dstillery.com/taxonomy");
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		Thread.sleep(3000);
		
		WebElement DwldFullTaxmonyBtn = driver.findElement(By.cssSelector("body:nth-child(2) div.main-body:nth-child(2) div.page-content div.taxonomy-table-container > input.download-taxonomy"));
		
		DwldFullTaxmonyBtn.click();
		//wait for  3 seconds
		Thread.sleep(3000);
		
		File listOfFiles[] = folder.listFiles();
		//make sure the directory is not empty
		
		Assert.assertTrue(listOfFiles.length>0);
		
		for(File file:listOfFiles) {
			//make sure that downloaded file is not empty
			Assert.assertTrue(file.length()>0);
		}
	}
	     @AfterMethod
	     public void tearDown() {
		 driver.quit();
	}
}
