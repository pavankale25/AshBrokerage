package AshBrokerage.main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreUnderWritingPage3 {
	public WebDriver driver;
	public PreUnderWritingPage3(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='noHealthConditions2']")
	private WebElement healthCondition;
	
	@FindBy(xpath="(//input[@name='conditionsFamilyHxParents'])[2]")
	private WebElement familyHealthCon;
	
	@FindBy(xpath="(//input[@name='conditionsFamilyHxSiblings'])[2]")
	private WebElement siblingsHealthCon;
	
	@FindBy(xpath="//button[contains(text(),'Get Quote')]")
	private WebElement getQuote_btn;
	
	public void insuredMedication() {
		healthCondition.click();
	}
	
	public void familyHealthCondition() {
		familyHealthCon.click();
	}
	
	public void siblingHealthCondition() {
		siblingsHealthCon.click();
	}
	
	public void clickedOngetQuotebtn() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", getQuote_btn);
		getQuote_btn.click();
	}
	
	
	
}
