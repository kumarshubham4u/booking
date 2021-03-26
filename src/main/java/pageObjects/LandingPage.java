/**
 * 
 */
package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author kshubham
 *
 */
public class LandingPage {

	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	private By accept= By.xpath("//div[@class='text-center col-xs-12']/button");
	
	private By options= By.xpath("//div[@class='h_menu_drop_button hidden-xs']/a/i");
	private By login= By.xpath("//button[@class='search_btn']");
	
	public WebElement getAccept() {
		return driver.findElement(accept);
	}
	
	public int getAcceptSize() {
		return driver.findElements(accept).size();
	}
	
	public WebElement getOptions() {
		return driver.findElement(options);
	}

	public WebElement getLogin() {
		return driver.findElement(login);
	}
	
}
