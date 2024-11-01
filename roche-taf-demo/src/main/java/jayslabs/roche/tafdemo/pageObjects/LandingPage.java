package jayslabs.roche.tafdemo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractComponent{

	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	public void goTo() {
		driver.get("https://diagnostics.roche.com/global/en/home.html");
	}
	
	public boolean isAt() {
		return driver.getTitle().equals("Roche - Diagnostics Solutions");
	}
}
