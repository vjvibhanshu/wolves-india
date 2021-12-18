package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.PurchasePage;

public class PurcahseTest extends Base {
	PurchasePage per = new PurchasePage();
	
	public PurcahseTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void launchInitialize() {
		per.loadPage();
	}
	
	@Test
	public void verifyTitle() {
		AssertJUnit.assertEquals(fetchTitile(), "BlazeDemo Purchase");
	}
	
	@Test
	public void verifyStatus() {
		AssertJUnit.assertTrue(per.status().contains("has been reserved"));
	}
	
	@Test
	public void userDetailstest() {
		per.fillUserDetails();
		per.clickOnchkRemeberme();
		per.clickOnPurchasebtn();
	}
}
