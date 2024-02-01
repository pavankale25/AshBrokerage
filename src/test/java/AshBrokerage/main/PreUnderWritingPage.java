package AshBrokerage.main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PreUnderWritingPage {
	public WebDriver driver;
	public PreUnderWritingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='rounded-md flex items-center bg-[#96d7e1] text-black font-semibold text-lg px-4 py-3']")
	private WebElement text;
	
	@FindBy(xpath="//input[@class='svelte-17l1npl']")
	private WebElement height_dropdown;
	
	@FindBy(xpath="(//div[@class='item  svelte-3e0qet'])[20]")
	private WebElement height_selection;
	
	@FindBy(xpath="(//input[@class='svelte-17l1npl'])[3]")
	private WebElement weight_dropdown;
	
	@FindBy(xpath="//div[contains(text(),'180')]")
	private WebElement weight_selection;
	
	@FindBy(xpath="(//input[@class=\"radio checked:radio-primary radio-sm\"])[1]")
	private WebElement US_Citizen;
	
	@FindBy(xpath="(//input[@class=\"svelte-17l1npl\"])[5]")
	private WebElement Marijuana_usage;
	
	@FindBy(xpath="//div[contains(text(),'Never')]")
	private WebElement NeverSelect;
	
	@FindBy(xpath="//input[@name='noHealthConditions']")
	private WebElement healthCondition;
	
	@FindBy(xpath="//div[@class='custom-checkbox-bg']")
	private WebElement checkBox_click;
	
	@FindBy(xpath="//button[@class=\"rounded-md shadow-lg btn uppercase btn-sm btn-next btn-primary\"]")
	private WebElement NextBtn;
	
	public void headlineComparison() {
		String actualText = text.getText();
		String expectedText = "Complete this brief health profile for an accurate rate class recommendation for each unique carrier";
		Assert.assertEquals(actualText, expectedText);
	}
	
	public void heightSelection() {
		height_dropdown.click();
	//	JavascriptExecutor js = (JavascriptExecutor)driver;
	//	js.executeScript("arguments[0].scrollIntoView(true);", height_selection);
		height_selection.click();
	}
	
	public void weightSelection() {
		weight_dropdown.click();
	//	JavascriptExecutor js = (JavascriptExecutor)driver;
	//	js.executeScript("arguments[0].scrollIntoView(true);", weight_dropdown);
		weight_selection.click();
	}
	
	public void yesUSCitizen() {
		US_Citizen.click();   
	}
	
	public void marijuanaConsuming() {
		Marijuana_usage.click();
		NeverSelect.click();
		
	}
	
	public void selectedHealthCondition() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", healthCondition);
		healthCondition.click();
		//checkBox_click.click();
	}
	
	public void clickOnNextBtn() throws InterruptedException {
		NextBtn.click();
		
	}

}
