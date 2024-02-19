package AshBrokerage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LgaTerm {
	public WebDriver driver;
	public LgaTerm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Start App - Proposed Insured Information Page
	@FindBy(xpath="//body/div[@id='app']/div[@class='mud-layout']/div[@class='mud-main-content']/div[@class='mud-expansion-panels ml-5 mr-5']/div[@class='mud-expand-panel mud-elevation-3 mud-expand-panel-border']/div[1]//*[name()='svg']")
	private WebElement DevelopTool;
	
	@FindBy(xpath="//input[@class='mud-checkbox-input']")
	private WebElement  checkBox;
	
	@FindBy(xpath="(//button[@class='mud-button-root mud-button mud-button-filled mud-button-filled-surface mud-button-filled-size-medium mud-ripple'])[2]")
    private WebElement RefreshData;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[3]")
	private WebElement SSNumber;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[4]")
	private WebElement Address;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[5]")
	private WebElement City;
	
	@FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input']")
	private WebElement StateDropdown;
	
	@FindBy(xpath="//p[contains(text(),'Alabama')]")
	private WebElement Alabama;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[6]")
	private WebElement Zip;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[7]")
	private WebElement Email;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[8]")
	private WebElement PhoneNum;
	
	@FindBy(xpath="(//input[@class='mud-radio-input'])[2]")
	private WebElement noUSCitizen;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[2]")
	private WebElement dropResidentState;
	
	@FindBy(xpath="(//p[@class='mud-typography mud-typography-body1'])[2]")
	private WebElement USvisatype;
	
	@FindBy(xpath="//button[@class='mud-button-root mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
	private WebElement NextBtnOnPIpage;
	
	public void developerTDropdown() {
		DevelopTool.click();
		checkBox.click();
	}
	
	public void refreshData() {
		RefreshData.click();
	}
	
	public void ssnumber() {
		SSNumber.sendKeys("906701234");
	}
	
	public void address() {
		Address.sendKeys("hgdsa");
	}
	
	public void city() {
		City.sendKeys("mnbvc");
	}
	
	public void stateSelection() {
		StateDropdown.click();
		Alabama.click();
	}
	
	public void zip() {
		Zip.sendKeys("90154");
	}
	
	public void email() {
		Email.sendKeys("nbv@gmail.com");
	}
	
	public void phoneNumber() {
		PhoneNum.sendKeys("9078122100");
	}
	
	public void noUScitizen() {
		noUSCitizen.click();
	}
	
	public void residentialStatus() {
		dropResidentState.click();
		USvisatype.click();
	}
	
	public void nextBtnOnPIpage() {
		NextBtnOnPIpage.click();
	}
	
	//Proposed Insured Information Continued Page
	
	@FindBy(xpath="(//input[@class='mud-radio-input'])[2]")
	private WebElement NoOwnnerPolicy;
	
	@FindBy(xpath="(//input[@class='mud-radio-input'])[4]")
	private WebElement NoTempInsuAgreement;
	
	@FindBy(xpath="(//input[@class='mud-radio-input'])[6]")
	private WebElement NoSaveAge;
	
	@FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input']")
	private WebElement PurposeOfInsudropdown;
	
	@FindBy(xpath="(//p[@class='mud-typography mud-typography-body1'])[3]")
	private WebElement FamilyProtection;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[2]")
	private WebElement PaymentFreqdropdown;
	
	@FindBy(xpath="//p[@class='mud-typography mud-typography-body1']")
	private WebElement Monthly;
	
	@FindBy(xpath="//button[@class='mud-button-root mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
	private WebElement NextBtn;
	
	public void noOwnerPolicy() {
		NoOwnnerPolicy.click();
	}
	
	public void noTempInsuAgreement() {
		NoTempInsuAgreement.click();
	}
	
	public void noSaveAge() {
		NoSaveAge.click();
	}
	
	public void purposeOfInsuredDropdown() {
		PurposeOfInsudropdown.click();
		FamilyProtection.click();
	}
	
	public void paymentFrequency() {
		PaymentFreqdropdown.click();
		Monthly.click();
	}
	
	public void nextBtn() {
		NextBtn.click();
	}
	
	//Beneficiary Information Page
	
	@FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input']")
	private WebElement RelationshipDropdown;
	
	@FindBy(xpath="(//p[@class='mud-typography mud-typography-body1'])[3]")
	private WebElement brother;
	
	@FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text']")
	private WebElement FirstName;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[2]")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end']")
	private WebElement Percentage;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[3]")
	private WebElement DOB;
	
	public void relationshipSelection() {
		RelationshipDropdown.click();
		brother.click();
	}
	
	public void firstName() {
		FirstName.sendKeys("uytr");
	}
	
	public void lastName() {
		LastName.sendKeys("asdf");
	}
	
	public void percentage() {
		Percentage.sendKeys("50");
	}
	
	public void dob() {
		DOB.sendKeys("07071989");
	}
	
	@FindBy(xpath="//button[@class='mud-button-root mud-icon-button mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
	private WebElement AddPrimaryBene;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[2]")
	private WebElement RelationDropdown;
	
	@FindBy(xpath="//p[contains(text(),'Business')]")
	private WebElement Bussiness;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[4]")
	private WebElement BussinessName;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end'])[2]")
	private WebElement per2;
	
	public void addPrimaryBene() {
		AddPrimaryBene.click();
	}
	
	public void relationSelectionaddPrimary() {
		RelationDropdown.click();
		Bussiness.click();
	}
	
	public void bussinessName() {
		BussinessName.sendKeys("hgffj");
	}
	
	public void percentageAddPrimary() {
		per2.sendKeys("50");
	}
	
	//Contingent Beneficiaries
	@FindBy(xpath="(//button[@class='mud-button-root mud-icon-button mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple'])[2]")
	private WebElement AddContingentBtn;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[3]")
	private WebElement relationDropdown;
	
	@FindBy(xpath="//p[contains(text(),'Business Partner')]")
	private WebElement bussinessPartner;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[5]")
	private WebElement FNforContingent;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[6]")
	private WebElement LNforContingent;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end'])[3]")
	private WebElement PerForContingent;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[7]")
	private WebElement DOBforContingent;
	
	@FindBy(xpath="//button[@class='mud-button-root mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
	private WebElement nextBtn;
	
	public void contingentButton() {
		AddContingentBtn.click();
	}
	
	public void relationSelectionContingent() {
		relationDropdown.click();
		bussinessPartner.click();
	}
	
	public void fNameContingent() {
		FNforContingent.sendKeys("hgjf");
	}
	
	public void lastNameContingent() {
		LNforContingent.sendKeys("rewqw");
	}
	
	public void percentageContingent() {
		PerForContingent.sendKeys("100");
	}
	
	public void dobContingent() {
		DOBforContingent.sendKeys("02211990");
	}
	
	public void nextBtnOnBIpage() {
		nextBtn.click();
	}
	
//Agent Information Page
	@FindBy(xpath="//input[@class='mud-radio-input']")
	private WebElement YesAppointed;
	
	@FindBy(xpath="//button[@class='mud-button-root mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
	private WebElement NextBtnOnAIpage;
	
	public void yesAppointedWithBanner() {
		YesAppointed.click();
	}
	
	public void nextBtnAIPageOnLGAJourney() {
		NextBtnOnAIpage.click();
	}
	
//Submit Page
	@FindBy(xpath="(//h1[@class='mud-typography mud-typography-h1'])[2]")
	private WebElement Headline;
	
	public void headlineVerify() {
		String ExpectedHeadline ="Final steps to complete your life insurance application";
		String ActualHeadline = Headline.getText();
		Assert.assertEquals(ActualHeadline,ExpectedHeadline);
	}
	
	@FindBy(xpath="//div[@class='mud-alert-message']")
	private WebElement AlertMsg;
	
	public void alertMsg() {
		String ActualAlertMsg = AlertMsg.getText();
		String ExpectAlertMsg = "Please note this is the last page before your information will be locked within this application. If you would like to review or modify any information please do so before proceeding forward.";
		Assert.assertEquals(ActualAlertMsg, ExpectAlertMsg);
	}
	
	@FindBy(xpath="//button[@class='mud-button-root mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
	private WebElement SubmitBtn;
	
	public void submitBtn() {
		SubmitBtn.click();
	}
	
	
	
}
