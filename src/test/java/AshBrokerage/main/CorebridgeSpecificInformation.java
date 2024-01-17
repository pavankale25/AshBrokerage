package AshBrokerage.main;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CorebridgeSpecificInformation {
	public WebDriver driver;
	public CorebridgeSpecificInformation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//body/div[@id='app']/div[@class='mud-layout']/div[@class='mud-main-content']/div[@class='mud-expansion-panels ml-5 mr-5']/div[@class='mud-expand-panel mud-elevation-3 mud-expand-panel-border']/div[1]//*[name()='svg']")
	private WebElement developerToolDropdown;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkBox;
	
	@FindBy(xpath="(//input[@class='mud-radio-input'])[1]")
	private WebElement yesdropdown;
	
	@FindBy(xpath="//span[@class='mud-typography mud-typography-button']")
	private WebElement nextBtn; 
	
	public void switchWindow() {
		Set<String> handles = driver.getWindowHandles();
		Iterator it = handles.iterator();
		String parent_id = (String) it.next();
		String child_id = (String) it.next();
		driver.switchTo().window(child_id);  
	}


   public void developerTooldropDown() {
	   developerToolDropdown.click();
	   checkBox.click();
   }
	
   public void criteriaMet() {
	   yesdropdown.click();
   }
	public void clickOnNextBtn() {
	nextBtn.click();
   }



   





}