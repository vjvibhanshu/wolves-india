package testcases;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.HomePage;

public class HomePageTest extends Base{
	
	HomePage hp = new HomePage();
	public HomePageTest() throws IOException{
		
		super();
	}
	
	
	@BeforeMethod
	public void launchInitialize() {
		hp.loadPage();
	}
	
	
	@Test
	public void verifyTitle() {
	
		AssertJUnit.assertEquals(fetchTitile(), "BlazeDemo");
	}

	
	@Test
	public void findFlight() {
		hp.selectDeptcityText();
		hp.selectDestcityText();
		hp.clickOnfindFlight();
	}
	
}
