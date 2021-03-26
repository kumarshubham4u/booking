/**
 * 
 */
package testCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.BaseTest;

/**
 * @author kshubham
 *
 */
public class Testscript_Login extends BaseTest {
	public WebDriver driver;
	private static Logger log=LogManager.getLogger(BaseTest.class.getName());
	
	
	@BeforeMethod
	public void initialize() throws IOException {
		
		log.info("Initializing browser");
		driver=initializeBrowser();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void Login() {
		
		LandingPage objLand=new LandingPage(driver);
		
		if(objLand.getAcceptSize()>0)
		{
			objLand.getAccept().click();
		}
		
		objLand.getOptions().click();
		objLand.getLogin().click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
