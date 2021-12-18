package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.ReserveFlight;

public class ReserveFlightTest extends Base {

	ReserveFlight rev = new ReserveFlight();
	
	public ReserveFlightTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void launchInitialize() {
		rev.loadPage();
	}
	
	@Test
	public void verifyTitle() {
		AssertJUnit.assertEquals(fetchTitile(), "BlazeDemo - reserve");
	}
	
	@Test
	public void bookFlightNo() {
		rev.chooseFlightNo();
	}

}
