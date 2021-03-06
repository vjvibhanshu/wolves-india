package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class PurchasePage extends Base{

	public PurchasePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"inputName\"]")
	WebElement name;
	
	@FindBy(xpath="//*[@id=\"address\"]")
	WebElement address;
	
	@FindBy(xpath="//*[@id=\"city\"]")
	WebElement city;
	
	@FindBy(xpath="//*[@id=\"state\"]")
	WebElement state;
	
	@FindBy(xpath="//*[@id=\"zipCode\"]")
	WebElement zipcode;
	
	@FindBy(xpath="//*[@id=\"cardType\"]")
	WebElement cardtype;
	
	@FindBy(xpath="//*[@id=\"creditCardNumber\"]")
	WebElement cardNo;
	
	@FindBy(xpath="//*[@id=\"creditCardMonth\"]")
	WebElement cardMonth;
	
	@FindBy(xpath="//*[@id=\"creditCardYear\"]")
	WebElement cardYear;
	
	@FindBy(xpath="//*[@id=\"rememberMe\"]")
	WebElement chkRemeberme;
	
	@FindBy(xpath="//form/div[11]/div/input")
	WebElement btnPurchase;
	
	@FindBy(xpath="//*[@id=\"nameOnCard\"]")
	WebElement nameoncard;
	
	@FindBy(xpath="/html/body/div[2]/h2")
	WebElement statusText;
	
	public String status() {
		return statusText.getText();
	}
	
	public void fillUserDetails() {
		
		type(name,"name");
		type(address,"address");
		type(city,"city");
		type(state,"state");
		type(zipcode,"zipcode");
		dropDownSelect(cardtype,"cardtype");
		type(cardNo,"cardno");
		type(cardMonth,"month");
		type(cardYear,"year");
		type(nameoncard,"nameoncard");
	}
	
	public void clickOnPurchasebtn() {
		btnPurchase.click();
	}
	
	public void clickOnchkRemeberme() {
		chkRemeberme.click();
	}
	
	public void loadPage() {
		launch("PurchasePage");
	}
}
