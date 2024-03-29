package AshBrokerage.main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
public class ProposedInsuredInformationPage {
	
	public WebDriver driver;
	public ProposedInsuredInformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='###-##-####']")
	private WebElement socialSecurityNumber;
	
	public void SSN() {
		socialSecurityNumber.sendKeys("333224444");
	}
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement address;
	
	public void addressSend() {
		address.sendKeys("1234 Idaho Street");
	}
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	private WebElement address2;
	
	public void address2Send() {
		address2.sendKeys("Apt 1");
	}
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	private WebElement city;
	
	public void citypass() {
		city.sendKeys("Boise");
	}
	
	@FindBy(xpath="(//input[@type='text'])[8]")
	private WebElement stateDropdown;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[13]/div[1]/p[1]")
	private WebElement Idahostate;
	
	public void stateSelection() throws InterruptedException {
		stateDropdown.click();
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.scrollToElement(Idahostate).perform();
		Thread.sleep(5000);
		Idahostate.click();
		
	//	JavascriptExecutor js = (JavascriptExecutor)driver;
	//	js.executeScript("arguments[0].scrollIntoView(true);", Idahostate);
		Thread.sleep(5000);
	//	Idahostate.click();
	}
	
	@FindBy(xpath="//input[@placeholder='#####']")
	private WebElement zip;
	
	public void sendZipCode() {
		zip.sendKeys("44444");
	}
	
	@FindBy(xpath="(//input[@type='text'])[10]")
	private WebElement email;
	
	public void emailPass() {
		email.sendKeys("test@email.com");
	}
	
	@FindBy(xpath="//input[@placeholder='(###) ###-####']")
	private WebElement phoneNumber;
	
	public void phoneNumberPass() {
		phoneNumber.sendKeys("2083457890");
	}
	
	@FindBy(xpath="(//input[@class='mud-radio-input'])[1]")
	private WebElement validDriverLicdrp;
	
	public void yesValidDriverLic() {
		validDriverLicdrp.click();
	}
	
	@FindBy(xpath="(//*[name()='svg'][@aria-label='Icon'])[3]")
	private WebElement issuedStateDrp;
	
	@FindBy(xpath="//p[normalize-space()='Idaho']")
	private WebElement IdahoState;
	
	public void IssuedState() throws InterruptedException {
		issuedStateDrp.click();
		Actions action = new Actions(driver);
		action.scrollToElement(IdahoState).perform();
		Thread.sleep(5000);
		IdahoState.click();
	}
	
	@FindBy(xpath="(//input[@type='text'])[14]")
	private WebElement DriverlicenseNum;
	
	public void driverLicenseNumber() {
		DriverlicenseNum.sendKeys("AA123456B");
	}
	
	@FindBy(xpath="(//span[@class='mud-radio-button'])[4]")
	private WebElement OwnerOfPolicy;
	
	public void noOwnerofThisPolicy() {
		OwnerOfPolicy.click();
	}
	
	@FindBy(xpath="(//*[name()='svg'][@class='mud-icon-root mud-svg-icon mud-icon-size-medium'])[6]")
	private WebElement nextbtn;
	
	
	public void clickOnnextBtn() throws InterruptedException {
		Actions action = new Actions(driver);
		action.scrollToElement(nextbtn).perform();
		Thread.sleep(4000);
		nextbtn.click();
	}
	
	//Policy Owner Information Page
	@FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input']")
	private WebElement isTheOwner;
	
	@FindBy(xpath="//p[contains(text(),'Individual')]")
	private WebElement Individual;
	
	@FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text']")
	private WebElement ownerFirstName;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[2]")
	private WebElement ownerLastName;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[2]")
	private WebElement relationshipdropdown;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[3]")
	private WebElement relationshipDropdownProtective;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[4]")
	private WebElement genderDropdown;
	
	@FindBy(xpath="//p[contains(text(),'Male')]")
	private WebElement male;
	
	@FindBy(xpath="//p[contains(text(),'Spouse')]")
	private WebElement spouse;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[3]")
	private WebElement DateOfBirth;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[4]")
	private WebElement SSN;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[5]")
	private WebElement mobileNumber;
	
	@FindBy(xpath="//input[@placeholder='(###) ###-####']")
	private WebElement mobilenoSpecificLife;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[3]")
	private WebElement CountryOfBirthDropDown;
	
	@FindBy(xpath="//p[contains(text(),'United States')]")
	private WebElement UnitedState;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[5]")
	private WebElement EmailSpecificLife;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[6]")
	private WebElement AddressSpecificLife;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[7]")
	private WebElement CitySpecificLife;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[8]")
	private WebElement ZipSpecificLife;
	
	@FindBy(xpath="(//input[@class='mud-radio-input'])[2]")
	private WebElement NoContingentOwner;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[6]")
	private WebElement emailId;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[7]")
	private WebElement addse;  //corebridge
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[8]")
	private WebElement citysend;  //corebridge
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[9]")
	private WebElement cityForSymetra;   
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[3]")
	private WebElement stateDropDown;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[5]")
	private WebElement StateDropDownProtective;
	
	@FindBy(xpath="//p[contains(text(),'Colorado')]")
	private WebElement Coloradoprotective;
	
	@FindBy(xpath="(//p[@class='mud-typography mud-typography-body1'])[6]")
	private WebElement coloradoState;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[9]")
	private WebElement zipcode;  //corebridge
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[10]")
	private WebElement zipcodeForSymetra;   
	
	public void zipCodeSymetra() {
		zipcodeForSymetra.sendKeys("45678");
	}
	
	@FindBy(xpath="//input[@class='mud-radio-input']")
	private WebElement yeslicense;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[4]")
	private WebElement DLissueddropdown;
	
	@FindBy(xpath="//p[contains(text(),'Idaho')]")
	private WebElement idaho;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[10]")
	private WebElement ownerDriverLicensenum;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement nextBtnpoi;
	
	public void ownerSelection() {
		isTheOwner.click();
		Individual.click();
	}
	
	public void fn() {
		ownerFirstName.sendKeys("Test");
	}
	
	public void ln() {
		ownerLastName.sendKeys("owner");
	}
	
	public void relationship() {
		relationshipdropdown.click();
		Actions action = new Actions(driver);
		action.scrollToElement(spouse).perform();
		spouse.click();
	}
	
	public void relaDropProtective() {
		relationshipDropdownProtective.click();
		Actions action = new Actions(driver);
		action.scrollToElement(spouse).perform();
		spouse.click();
	}
	
	public void genderSelection() {   //protective 
		genderDropdown.click();
		male.click();
	}
	
	public void dateOfBirth() {
		DateOfBirth.sendKeys("08151981");
	}
	
	public void SSNumber() {
		SSN.sendKeys("555567890");
	}
	
	public void mobileNumber() {
		mobileNumber.sendKeys("7891234567");
	}
	
	public void mobileNoSpecificLife() {
		mobilenoSpecificLife.sendKeys("7896546765");
		}
	
	public void emailSpecifcLife() {
		EmailSpecificLife.sendKeys("owner@email.com");
	}
	
	public void addressSpecificLife() {
		AddressSpecificLife.sendKeys("5678 Main Street");
	}
	
	public void citySpecificLife() {
		CitySpecificLife.sendKeys("Fort Collins");
	}
	
	public void zipSpecificLife() {
		ZipSpecificLife.sendKeys("80525");
	}
	
	public void birthState() {
		stateDropDown.click();
		UnitedState.click();
	}
	public void stateSpecificLife() {
		DLissueddropdown.click();
		coloradoState.click();
	}
	
	public void noContingentOwner() {
		NoContingentOwner.click();
	}
	
	
	
	public void email() {
		emailId.sendKeys("owner@email.com");
	}
	
	public void address() {
		addse.sendKeys("5678 Main Street");
	}
	
	public void city() {
		citysend.sendKeys("Fort Collins");
	}
	
	public void citySendSymetra() {
		cityForSymetra.sendKeys("Fort Collins");
	}
	
	public void stateDropDownProtective() {
		StateDropDownProtective.click();
		Coloradoprotective.click();
	}
	public void stateSelected() {
		stateDropDown.click();
		coloradoState.click();
	}
	
	public void zipcode() {
		zipcode.sendKeys("80525");
	}
	
	public void haveDriversLicense() {
		yeslicense.click();
	}
	
	public void DLissued() {
		DLissueddropdown.click();
		idaho.click();
	}
	
	public void driverLicenseNum() {
		ownerDriverLicensenum.sendKeys("AA123456B");
	}
	
	public void nextBtnOnPolicyOwnerInfo() {
		nextBtnpoi.click();
	}
	
	
	
	//Proposed Insured Information page - 2
	
	@FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input']")
	private WebElement birthplaceDropdown;
	
	@FindBy(xpath="(//p[@class='mud-typography mud-typography-body1'])[1]")
	private WebElement UnitedStates;
	
	public void birthplaceSelection() {
		birthplaceDropdown.click();
		UnitedStates.click();
	}
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[2]")
	private WebElement stateofBirth;
	
	@FindBy(xpath="//p[contains(text(),\"Idaho\")]")
	private WebElement idahostate;
	
	public void stateofBirthSelection() throws InterruptedException {
		stateofBirth.click();
		Actions action = new Actions(driver);
		action.scrollToElement(idahostate).perform();
		Thread.sleep(4000);
		idahostate.click();
	}
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[3]")
	private WebElement occupationSpecificLife;
	
	@FindBy(xpath="//p[contains(text(),'Automotive')]")
	private WebElement Automative;
	
	public void occupationSpecificLifeSelection() {
		occupationSpecificLife.click();
		Automative.click();
	}
	
	@FindBy(xpath="(//input[@class='mud-radio-input'])[4]")
	private WebElement NoUSArmedForce;
	
	public void noInUSarmedForced() {
		NoUSArmedForce.click();
	}
	
	@FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-start']")
	private WebElement HouseHoldIncome;  //for protective
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-start'])[2]")
	private WebElement EstimatedNetWorth;
	
	public void houseHoldIncome() {
		HouseHoldIncome.sendKeys("200000");
	}
	
	public void estimatedNetWorth() {
		EstimatedNetWorth.sendKeys("200000");
	}
	@FindBy(xpath="(//input[@class='mud-radio-input'])[2]")
	private WebElement noUSCitizen;
	
	public void nUsCitizen() {
		noUSCitizen.click();
	}
	public void citizenCounty() {
		CitizenCountDropdown.click();
		afghan.click();
		visaTypeDropdown.click();
		E1.click();
	}
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[3]")
	private WebElement CitizenCountDropdown;
	
	@FindBy(xpath="//p[@class='mud-typography mud-typography-body1' and text()='Afghanistan']")
	private WebElement afghan;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[4]")
	private WebElement visaTypeDropdown;
	
	@FindBy(xpath="(//p[@class='mud-typography mud-typography-body1'])[2]")
	private WebElement E1;
	
	@FindBy(xpath="(//input[@class='mud-radio-input'])[4]")
	private WebElement NoArmyForced;
	
	public void noUSArmyForced() {
		NoArmyForced.click();
	}
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement nextBtn;
	
	public void nextBtn() {
		nextBtn.click();
	}
	

}
