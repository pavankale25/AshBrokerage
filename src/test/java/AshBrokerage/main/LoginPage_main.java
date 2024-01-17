package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage_main {
	WebDriver driver; 
	 public String title1;
	public LoginPage_main(WebDriver driver){     //page factory
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']")
	private WebElement Email_id;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="(//button[text()=\"Continue\"])[2]")
	private WebElement Continue_btn_login; 
	
	@FindBy(xpath="//span[@id=\"error-element-password\"]")
	private WebElement error_msg;
	
	@FindBy(xpath="//p[text()=\"Log in to acme to continue to Techficient Dynamic SPA.\"]")
	private WebElement headline_loginPage;
	
	@FindBy(xpath="//img[@alt=\"acme\"]")
	private WebElement logoOnLoginPage;
	
	
	public void emailIdPass() {
		Email_id.sendKeys("user@acme.com");
	}
	
	public void passSend() {
	password.sendKeys("Test1234$");
	}
	
	public void clickOnContinueBtn() {
		Continue_btn_login.click();
	}
	
	public void invalidEmailid() {
		Email_id.sendKeys("user@ac.com");
	}
	
	public void invalidPass() {
		password.sendKeys("Test124");
	}
	
	public void errormsg() {
		String act_error_msg = error_msg.getText();
		String exp_error_msg = "Wrong email or password";
		Assert.assertEquals(act_error_msg, exp_error_msg);
	}
	
	public void verifiedHeadline() {
		String headlineOnLoginPageAct = headline_loginPage.getText();
		String headlineOnLoginPageExp = "Log in to acme to continue to Techficient Dynamic SPA.";
		Assert.assertEquals(headlineOnLoginPageAct, headlineOnLoginPageExp);
		System.out.println(headlineOnLoginPageAct);
	}
	
	public void checkLogoOnLoginPage() {
		logoOnLoginPage.isEnabled();       
	}
	//---------
	

	
	@FindBy(xpath="	//button[@class='btn btn-sm btn-primary rounded-md shadow-lg w-[85px] btn-next']")
	public WebElement save_btn;
	
	@FindBy(xpath="//button[@class='btn btn-primary rounded-md shadow-lg btn-next lg:w-40']")
	public WebElement term_btn;
	
	@FindBy(xpath="//button[@class='rounded-md shadow-lg btn uppercase btn-sm btn-next btn-primary']")
	public WebElement next_btn1; 
	
	@FindBy(xpath="//button[@class=\"rounded-md shadow-lg btn uppercase btn-sm btn-next btn-primary\"]")
	public WebElement next_btn2;

}
