package AshBrokerage.main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PreUnderWritingPage2 {
	public WebDriver driver;
	public PreUnderWritingPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='rounded-md flex items-center bg-[#96d7e1] text-black font-semibold text-lg px-4 py-3']")
	private WebElement act_text;
	
	@FindBy(xpath="(//input[@class='radio checked:radio-primary radio-sm' and @name='drivingConvictionDui'])[2]")
	private WebElement DUIselection;
	
	@FindBy(xpath="(//input[@name='drivingConvictionViolations'])[2]")
	private WebElement violations;
	
	@FindBy(xpath="(//input[@name='drivingConvictionSuspension'])[2]")
	private WebElement noLicenseSuspended;
	
	@FindBy(xpath="(//input[@name='criminalhistory'])[2]")
	private WebElement criminalHistory;
	
	@FindBy(xpath="//button[@class='rounded-md shadow-lg btn uppercase btn-sm btn-next btn-primary']")
	private WebElement nextbtn;
	
	public void textCompare() {
		String Expected_text = "By providing accurate details and adding additional data, we can provide accurate quotes and the best underwriting journey";
		Assert.assertEquals(act_text, Expected_text);
	}
	
	public void noDUI() {
		DUIselection.click();
	}
	
	public void noViolations() {
		violations.click();
	}
	
	public void noLicensesuspended() {
		noLicenseSuspended.click();
	}
	
	public void noCriminalHistory() {
		criminalHistory.click();
	}
	
	public void clickOnNextBtn() {
		nextbtn.click();
	}
	
	
	
}
