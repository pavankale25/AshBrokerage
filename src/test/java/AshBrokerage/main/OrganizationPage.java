package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	WebDriver driver; 
	 public String title1;
	public OrganizationPage(WebDriver driver){     //page factory
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='organizationName']")
	private WebElement OrganizationName;     //textbox
	
	@FindBy(xpath="//button[@name='action']")
	private WebElement Continue_btn;
	
	public void enteroriganzationName() {
		OrganizationName.sendKeys("acme");}
	public void getOrgname() {
		  title1 = OrganizationName.getText();
	}
	
	public void clickonContinuebtn() {
		Continue_btn.click();
	}
	
	

}
