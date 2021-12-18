package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class HomePage extends Base{
	
	@FindBy(xpath="*//select[1]")
	WebElement deptcity;
	@FindBy(xpath="*//select[2]")
	WebElement destcity;
	@FindBy(xpath="/html/body/div[3]/form/div/input")
	WebElement findBtn;
	
	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void selectDeptcityText()
	{
		dropDownSelect(deptcity,"deptcity");
	}
	
	public void selectDestcityText()
	{
		dropDownSelect(destcity,"destcity");
	}
	
	public void clickOnfindFlight() {
		findBtn.click();
	}
	public void loadPage() {
		launch("HomePage");
	}
}
