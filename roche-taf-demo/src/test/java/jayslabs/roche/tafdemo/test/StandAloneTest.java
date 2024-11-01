package jayslabs.roche.tafdemo.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import jayslabs.roche.tafdemo.test.components.BaseTest;

public class StandAloneTest extends BaseTest {

	@Test
	public void launchHomePage() {
	    landingPage.goTo();
	    
	    Assert.assertTrue(true);
	}

}
