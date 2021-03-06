package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import pages.ConfirmationPge;

public class ConfirmationPageTest extends Base {

	public ConfirmationPageTest() throws IOException {
		super();
	}
	
	
	ConfirmationPge cp = new ConfirmationPge();
	
	@BeforeTest
	public void launchInitialize() {
		cp.loadPage();
	}
	
	@Test
	public void verifyTitle() {
		
		Assert.assertEquals(fetchTitile(), "BlazeDemo Confirmation");
	}
	
	@Test
	public void verifyAmount() {
		Assert.assertTrue(cp.getAmount().contains("555 USD"));
	}
	
	@Test
	public void validateStatus() {
		
		Assert.assertTrue(cp.getStatus().contains("Thank you"));
	}
	
	
}
