package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LgaTerm {
	public WebDriver driver;
	public LgaTerm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/*[name()='svg'][1]/*[name()='path'][2]")
	private WebElement DevelopTool;
	
	@FindBy(xpath="//input[@class='mud-checkbox-input']")
	private WebElement  checkBox;
	
	@FindBy(xpath="(//button[@class='mud-button-root mud-button mud-button-filled mud-button-filled-surface mud-button-filled-size-medium mud-ripple'])[2]")
    private WebElement RefreshData;
	
	@FindBy(xpath="//button[@class='mud-button-root mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
	private WebElement NextBtnOnPIpage;
	
	public void developerTDropdown() {
		DevelopTool.click();
		checkBox.click();
	}
	
	public void refreshData() {
		RefreshData.click();
	}
	
	public void nextBtnOnPIpage() {
		NextBtnOnPIpage.click();
	}
	
	
	
	
	
	
	
}
