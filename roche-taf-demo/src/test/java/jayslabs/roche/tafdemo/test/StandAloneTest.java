package jayslabs.roche.tafdemo.test;

import java.time.Duration;
import jayslabs.roche.tafdemo.test.components.BaseTest;

import org.testng.annotations.Test;
import org.testng.Assert;

public class StandAloneTest extends BaseTest {

	@Test
	public void launchHomePage() {
	    landingPage.goTo();
	    
	    Assert.assertTrue(true);
	}

}
