package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class ConfirmationPge extends Base {

	public ConfirmationPge() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="/html/body/div[2]/div/h1")
	WebElement status;
	
	@FindBy(xpath="/html/body/div[2]/div/table/tbody/tr[3]/td[2]")
	WebElement amount;
	
	public String getStatus() {
		return status.getText();
	}
	
	public String getAmount() {
		return amount.getText();
	}
	
	public void loadPage() {
		launch("ConfirmationPage");
	}
	

}
