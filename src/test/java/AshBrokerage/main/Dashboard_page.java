package AshBrokerage.main;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Dashboard_page {
WebDriver driver;
	public Dashboard_page(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[@class='ml-5 text-md text-black font-bold text-secondary']")
	private WebElement dashboard;
	
	@FindBy(xpath="//a[@class='flex items-center py-4 hover:bg-primary-focus bg-primary-focus']//span[text()='Dashboard']")
	private WebElement DashBoard_btn;
	
	@FindBy(xpath="//span[normalize-space()='Clients']")
	private WebElement Clients_btn;
	
	@FindBy(xpath="(//a[@class='flex items-center py-4 hover:bg-primary-focus'])[2]")
	private WebElement Quotes_btn;
	
	@FindBy(xpath="(//a[@class='flex items-center py-4 hover:bg-primary-focus'])[3]")
	private WebElement cases_btn;
	
	@FindBy(xpath="(//a[@class='flex items-center py-4 hover:bg-primary-focus'])[4]")
	private WebElement InForcePolicy_btn;
	
	@FindBy(xpath="//span[text()='Call Support']")
	private WebElement call_support_btn;
	
	@FindBy(xpath="//span[@class='ml-3 text-[0.85rem] leading-5 font-light']")
	private WebElement support_mobile_number;
	
	@FindBy(xpath="//span[text()='Email Support']")
	private WebElement email_support_btn;
	
	@FindBy(xpath="//span[@class='ml-3 text-[0.85rem] break-all leading-5 font-light']")
	private WebElement support_email;
	
	@FindBy(xpath="//span[text()='acme']")
	private WebElement organization_name;    //organization name 
	
	@FindBy(xpath="input[@name='organizationName']")
	private WebElement org_name;    
	
	@FindBy(xpath="(//span[@class='a11yText svelte-17l1npl'])[5]")
	private WebElement Modetypes;   //
	
	@FindBy(xpath="//img[@alt='Logo']")
	private WebElement logo;  
	
	@FindBy(xpath="//a[@class=\"flex items-center py-4 hover:bg-primary-focus\"]")
	private WebElement clients_btn;   //
	
	@FindBy(xpath="(//div/input[@class='svelte-17l1npl'])[9]")
	private WebElement demodropdown;
	
	@FindBy(xpath="//div[contains(text(),'Regular Mode')]")
	private WebElement regularMode;
	
	public void pageName() {   //verify page name
		String actual_text = dashboard.getText();
		String expected_text = "Dashboard";
		Assert.assertEquals(actual_text, expected_text);
	}
	
	public void Dashboard_btn() {
		DashBoard_btn.isDisplayed();
	}
	
	public void Client_btn() throws InterruptedException {
	//	System.out.println(Clients_btn.isDisplayed());
		Clients_btn.click();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
	}
	
	public void Quotes_btn() throws InterruptedException {
	//	Quotes_btn.isDisplayed(); 
		Quotes_btn.click();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
	}
	
	public void cases_btn() throws InterruptedException {
	//	cases_btn.isDisplayed();
		cases_btn.click();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
	}
	 
	public void inForcePolicy_btn() throws InterruptedException {
	//	InForcePolicy_btn.isDisplayed();
		InForcePolicy_btn.click();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
	}
	
	public void callSupport_btn() {
		call_support_btn.isDisplayed();
		String actualmobileNumber = support_mobile_number.getText();
		String expectmobileNumber = "800 - 589 - 3000";
		Assert.assertEquals(actualmobileNumber, expectmobileNumber);
		
	}
	
	public void emailSupportbtn() {
		email_support_btn.isDisplayed();
		String demoEmail = support_email.getText();
		String expectEmail = "support@techf.com";
		Assert.assertEquals(demoEmail, expectEmail);
	}
	
	//
/*	public void verifiedOrganizationName() {
		
		String act_title=organization_name.getText();
	//	Assert.assertEquals(super.title1,act_title);
	}*/
	
	public void mode_dropdown() {
		demodropdown.click();
		
	/*	List<WebElement> options = driver.findElements(By.xpath("//div[@class='listContainer svelte-1uyqfml']"));
		for(WebElement p:options) {    //getting value from dropdown
        System.out.println(p.getText());*/
		}
	
	public void selectedRegularMode() {
		regularMode.click();
	}
	
	
	public void logoIsDisplay() {
		logo.isDisplayed();      //logo checking
	}
	
	public void clickonClientsbtn() {
		clients_btn.click();       
	}
	
    
	
}
