package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class ReserveFlight extends Base {

	public ReserveFlight() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void chooseFlightNo(){
		String val = getTestDataFor("FlightNo");
		driver.findElement(By.xpath("//*[contains(text(),"+val+")]/preceding-sibling::td/input"))
		.click();
	}
	public void loadPage() {
		launch("ReserveFlight");
	}
}
