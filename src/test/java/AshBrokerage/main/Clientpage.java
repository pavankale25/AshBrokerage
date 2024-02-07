package AshBrokerage.main;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Clientpage {   //
	WebDriver driver; 
	 public String title1;
	public Clientpage(WebDriver driver){     //page factory
		this.driver = driver;
		PageFactory.initElements(driver, this);
	} 
	//Client page information 
	//@FindBy(xpath="(//button[@class=\"btn btn-sm btn-primary rounded-md shadow-lg action-btn w-[97px]\"])[2]")
	@FindBy(xpath="//button[@class='btn btn-primary rounded-md shadow-lg btn-next']")
	private WebElement view_btn;
	
	@FindBy(xpath="//button[text()='Add Client']")
	private WebElement add_client_btn; 
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement first_name;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	public WebElement Last_name; 
	
	@FindBy(xpath="//input[@placeholder='Date of Birth']")
	public WebElement Date_of_Birth; 
	
	@FindBy(xpath="//*[@id=\"page-content\"]/div/div[3]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[2]/div[1]/div/input[1]")
	public WebElement Gender; 
	
	@FindBy(xpath="//*[@id=\"page-content\"]/div/div[3]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[1]")
	public WebElement malegender;  //gender selection
	
	@FindBy(xpath="	//button[@class='btn btn-sm btn-primary rounded-md shadow-lg w-[85px] btn-next']")
	public WebElement save_btn;    //clicked on save button
	
	@FindBy(xpath="//button[contains(text(),'Term')]")  //staging
	//@FindBy(xpath="//button[text()='Quote & Apply']")
    public WebElement TermQuoteBtn;
	
	@FindBy(xpath="//button[@class=\"btn btn-primary rounded-md shadow-lg btn-next lg:w-40\" and text()=\"Term\"]")
	public WebElement term_quote; 
	
	@FindBy(xpath="//p[@class='text-xs text-error']")
	private WebElement fnerrormsg;
	
	@FindBy(xpath="(//p[@class='text-xs text-error'])[2]")
	private WebElement lnameerrormsg;
	
	@FindBy(xpath="(//p[@class='text-xs text-error'])[3]")
	private WebElement DOBerrormsg;
	
	@FindBy(xpath="(//p[@class='text-xs text-error'])[4]")
	private WebElement Gendererrormsg;

	public void clickOnAddClientBtn() {
		add_client_btn.click();
	}
	
	public void firstName() {
		first_name.sendKeys("fName");
	}
	
	public void lastName() {
		Last_name.sendKeys("lName");
	}
	
	public void DOB() {
		Date_of_Birth.sendKeys("09091985"); 
	}
	
	public void genderSelection() {
		Gender.click();
		malegender.click();   //selected male gender
	}
	
	public void savebtn() {
		save_btn.click();
	}
	
	public void applyBtn(){
		TermQuoteBtn.click();
		
	}
	
	public void fName() {
		first_name.sendKeys("6677@#");
	}
	
	public void firstNameErrorMsg() {
		String error_msgforFNfield=fnerrormsg.getText();
		String expectederrorMsgFNfield="This field is required.";
		Assert.assertEquals(expectederrorMsgFNfield,error_msgforFNfield);
	}
	
	public void lastNameErrorMsg() {
		String errorMsgLNfield=lnameerrormsg.getText();
		String expectederrorMsgLNfield = "This field is required.";
		Assert.assertEquals(errorMsgLNfield, expectederrorMsgLNfield);
	}
	
	public void dateOfBirthErrorMsg() {
		String errorMsgofDOBfield = DOBerrormsg.getText();
	    String expectederrorMsgDOBfield = "This field is required.";
	    Assert.assertEquals(errorMsgofDOBfield, expectederrorMsgDOBfield);
	}
	
	public void genderfieldErrorMsg() {
		String errorMsgofGenderfield = Gendererrormsg.getText();
		String expectederrorMsgGenderfield = "This field is required.";
		Assert.assertEquals(errorMsgofGenderfield, expectederrorMsgGenderfield);
	}
	
	public void firstname() {
		first_name.sendKeys("76565#@");
		String error_msgforFNfield=fnerrormsg.getText();
		String expectedFNfield = "Please provide valid name";
		Assert.assertEquals(error_msgforFNfield, expectedFNfield);
	}
	
	public void lastname() {
		Last_name.sendKeys("5655#$");
		String error_msgforLNfield=lnameerrormsg.getText();
		String expectedFNfield = "Please provide valid name";
		Assert.assertEquals(error_msgforLNfield, expectedFNfield);
	}
	
	public void dateOfBirth() {
		Date_of_Birth.sendKeys("7843");
		String validErrormsg = DOBerrormsg.getText();
		String expectedFNfield = "Please provide valid name";
		Assert.assertEquals(validErrormsg, expectedFNfield);
	}
	
	
	
	
}






