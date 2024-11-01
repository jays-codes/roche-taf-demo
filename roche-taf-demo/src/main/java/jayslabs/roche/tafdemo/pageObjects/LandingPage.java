package jayslabs.roche.tafdemo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import jayslabs.roche.tafdemo.Utility;

public class LandingPage extends AbstractComponent{

	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	public void goTo() {
		driver.get(Utility.getProperty("landingPageUrl"));
	}
	

	//goto Digital Pathology list item and click
	public void goToDigitalPathology() {
		driver.findElement(By.xpath("//*[@id='menu-item-100']/a")).click();
	}


	//check if on landing page
	public boolean isAt() {
		return driver.getTitle().equals("Roche - Diagnostics Solutions");
	}
}
