package AshBrokerage.main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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
	
	//Validation message verification proposed Insured Information Page
	@FindBy(xpath="//div[@class='me-auto']")
	private WebElement BirthPlaceValidation;
	
	@FindBy(xpath="(//div[@class='me-auto'])[2]")
	private WebElement HouseHoldIncomeValidation;
	
	@FindBy(xpath="(//div[@class='me-auto'])[3]")
	private WebElement USCitizenRadioBtnFieldValidation;
	
	@FindBy(xpath="(//div[@class='me-auto'])[4]")
	private WebElement ServiceMemberOfUSArmyValidation;
	
	
	
	public void birthplaceFieldValidationMsg() {
		String ExpecedErrorMsg = "You must select one.";
		String ErrorMsgOfBirthPlaceField = BirthPlaceValidation.getText();
		Assert.assertEquals(ExpecedErrorMsg, ErrorMsgOfBirthPlaceField);
	}
	
	public void houseHoldIncomeFieldvalidationMsg() {
		String ExpecedErrorMsg = "This field is required.";
		String ErrorMsgOfHouseHoldIncomeField = HouseHoldIncomeValidation.getText();
		Assert.assertEquals(ExpecedErrorMsg, ErrorMsgOfHouseHoldIncomeField);
	}
	
	public void usCitizenFieldValidation() {
		String ExpecedErrorMsg = "This field is required.";
		String ErrorMsgOfUSCitizenField = USCitizenRadioBtnFieldValidation.getText();
		Assert.assertEquals(ExpecedErrorMsg, ErrorMsgOfUSCitizenField);
	}
	
	public void usArmedForcedFieldValidationMsg() {
		String ExpecedErrorMsg = "This field is required.";
		String ErrorMsgOfUSArmedForcedField = ServiceMemberOfUSArmyValidation.getText();
		Assert.assertEquals(ExpecedErrorMsg, ErrorMsgOfUSArmedForcedField);
	}
	
	//Validation message of PI Page for Corebridge journey.
	@FindBy(xpath="//div[@class='me-auto']")
	private WebElement SSNumberValidationMsg;
	
	@FindBy(xpath="(//div[@class='me-auto'])[2]")
	private WebElement AddressFieldValidionMsg;
	
	@FindBy(xpath="(//div[@class='me-auto'])[3]")
	private WebElement CityFieldValidationMsg;
	
	@FindBy(xpath="(//div[@class='me-auto'])[4]")
	private WebElement StateFieldValidationMsg;
	
	@FindBy(xpath="(//div[@class='me-auto'])[5]")
	private WebElement ZipFieldValidationMsg;
	
	@FindBy(xpath="(//div[@class='me-auto'])[6]")
	private WebElement EmailFieldValidationMsg;
	
	@FindBy(xpath="(//div[@class='me-auto'])[7]")
	private WebElement PhoneFieldValidationMsg;
	
	@FindBy(xpath="(//div[@class='me-auto'])[8]")
	private WebElement DriverLicenceFieldValidationMsg;
	
	@FindBy(xpath="(//div[@class='me-auto'])[9]")
	private WebElement OwnerOfPolicyFieldValidationMsg;
	
	public void validationMsgOfSSNumber() {
		String ActualSSNValidation = SSNumberValidationMsg.getText();
		String ExpectedSSNumberValidationMsg = "This field is required.";
		Assert.assertEquals(ActualSSNValidation, ExpectedSSNumberValidationMsg);
	}
	
	public void validationMsgOfAddressField() {
		String ActualAddressFieldValidation = AddressFieldValidionMsg.getText();
		String ExpectedAddressFieldValidationMsg = "This field is required.";
		Assert.assertEquals(ActualAddressFieldValidation, ExpectedAddressFieldValidationMsg);
	}
	
	public void validationMsgOfCityField() {
		String ActualCityFieldValidationMsg = CityFieldValidationMsg.getText();
		String ExpectedCityFieldValidationMsg = "This field is required.";
		Assert.assertEquals(ActualCityFieldValidationMsg, ExpectedCityFieldValidationMsg);
	}
	
	public void validationMsgOfStateField() {
		String ActualStateFieldValidationMsg = StateFieldValidationMsg.getText();
		String ExpectedStateFieldValidationMsg = "You must select one.";
		Assert.assertEquals(ActualStateFieldValidationMsg, ExpectedStateFieldValidationMsg);
	}
	
	public void validationMsgOfZipField() {
		String ActualZipFieldValidationMsg = ZipFieldValidationMsg.getText();
		String ExpectedZipFieldValidationMsg = "This field is required.";
		Assert.assertEquals(ActualZipFieldValidationMsg, ExpectedZipFieldValidationMsg);
	}
	
	public void validationMsgOfEmailField() {
		String ActualEmailFieldValidationMsg = EmailFieldValidationMsg.getText();
		String ExpectedEmailFieldValidationMsg = "This field is required.";
		Assert.assertEquals(ActualEmailFieldValidationMsg, ExpectedEmailFieldValidationMsg);
	}
	
	public void validationMsgOfPhoneNumField() {
		String ActualPhoneFieldValidationMsg = PhoneFieldValidationMsg.getText();
		String ExpectedPhoneFieldValidationMsg = "This field is required.";
		Assert.assertEquals(ActualPhoneFieldValidationMsg, ExpectedPhoneFieldValidationMsg);
	}
	
	public void validationMsgOfDriverLicenceDropdown() {
		String ActualPhoneFieldValidationMsg = PhoneFieldValidationMsg.getText();
		String ExpectedPhoneFieldValidationMsg = "This field is required.";
		Assert.assertEquals(ActualPhoneFieldValidationMsg, ExpectedPhoneFieldValidationMsg);
	}
	
	public void validationMsgOfOwnerOfPolicyDropdown() {
		String ActualPhoneFieldValidationMsg = PhoneFieldValidationMsg.getText();
		String ExpectedPhoneFieldValidationMsg = "This field is required.";
		Assert.assertEquals(ActualPhoneFieldValidationMsg, ExpectedPhoneFieldValidationMsg);
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
		ownerFirstName.sendKeys("Tdferty");
	}
	
	public void ln() {
		ownerLastName.sendKeys("Ohgty");
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
	
	@FindBy(xpath="//div[@class='me-auto']")
	private WebElement ValidationMsgOfIsOwnerSection;
	
	public void validationMsgIsOwnerField() {
		String ActualValidation = ValidationMsgOfIsOwnerSection.getText();
		String ExpectedValidationMsg = "This field is required.";
		Assert.assertEquals(ActualValidation, ExpectedValidationMsg);
	}
	
	//Negative test cases for Policy Owner Information Page for Protective journey.
	@FindBy(xpath="//div[@class='me-auto']")
	private WebElement ValidationMsgOnFNField;  
	
	@FindBy(xpath="(//div[@class='me-auto'])[2]")
	private WebElement ValidationMsgOnLNField;  
	
	@FindBy(xpath="(//div[@class='me-auto'])[3]")
	private WebElement ValidationMsgOnRelationshipField;  
	
	@FindBy(xpath="(//div[@class='me-auto'])[4]")
	private WebElement ValidationMsgOnGenderField;  
	
	@FindBy(xpath="(//div[@class='me-auto'])[5]")
	private WebElement ValidationMsgOnDOBField;  
	
	@FindBy(xpath="(//div[@class='me-auto'])[6]")
	private WebElement ValidationMsgOnSSNField;  
	
	@FindBy(xpath="(//div[@class='me-auto'])[7]")
	private WebElement ValidationMsgOnMobileNumField;  
	
	@FindBy(xpath="(//div[@class='me-auto'])[8]")
	private WebElement ValidationMsgOnEmailField;  
	
	@FindBy(xpath="(//div[@class='me-auto'])[9]")
	private WebElement ValidationMsgOnAddressField;  
	
	@FindBy(xpath="(//div[@class='me-auto'])[10]")
	private WebElement ValidationMsgOnCityField;  
	
	@FindBy(xpath="(//div[@class='me-auto'])[11]")
	private WebElement ValidationMsgOnStateField;  
	
	@FindBy(xpath="(//div[@class='me-auto'])[12]")
	private WebElement ValidationMsgOnZipField;  
	
	public void validationMessage() { //Individual 
		String ExpectedValidationMsg = "This field is required.";
		String ErrorMsgOnFNfield = ValidationMsgOnFNField.getText();
		Assert.assertEquals(ExpectedValidationMsg, ErrorMsgOnFNfield);
		
		String ErrorMsgOnLNfield = ValidationMsgOnLNField.getText();
		Assert.assertEquals(ExpectedValidationMsg, ErrorMsgOnLNfield);
		
		String ExpectedDropdownValidationMsg = "You must select one.";
		String ErrorMsgOnRelationshipfield = ValidationMsgOnRelationshipField.getText();
		Assert.assertEquals(ExpectedDropdownValidationMsg, ErrorMsgOnRelationshipfield);
		
		String ErrorMsgOnGenderfield = ValidationMsgOnGenderField.getText();
		Assert.assertEquals(ExpectedDropdownValidationMsg, ErrorMsgOnGenderfield);
		
		String ErrorMsgOnDOBfield = ValidationMsgOnDOBField.getText();
		Assert.assertEquals(ExpectedValidationMsg, ErrorMsgOnDOBfield);
		
		String ErrorMsgOnSSNField = ValidationMsgOnSSNField.getText();
		Assert.assertEquals(ErrorMsgOnSSNField, ExpectedValidationMsg);
		
		String ErrorMsgOnMobileNumField = ValidationMsgOnMobileNumField.getText();
		Assert.assertEquals(ErrorMsgOnMobileNumField, ExpectedValidationMsg);
		
		String ErrorMsgOnEmailField = ValidationMsgOnEmailField.getText();
		Assert.assertEquals(ErrorMsgOnEmailField, ExpectedValidationMsg);
		
		String ErrorMsgOnAdressField = ValidationMsgOnAddressField.getText();
		Assert.assertEquals(ErrorMsgOnAdressField, ExpectedValidationMsg);
		
		String ErrorMsgOnCityField = ValidationMsgOnCityField.getText();
		Assert.assertEquals(ErrorMsgOnCityField, ExpectedValidationMsg);
		
		String ErrorMsgOnStateField = ValidationMsgOnStateField.getText();
		Assert.assertEquals(ErrorMsgOnStateField, ExpectedDropdownValidationMsg);
		
	}
	
	@FindBy(xpath="(//div[@class='me-auto'])[4]")
	private WebElement ValidationMsgOnDOBFieldCore; 
	
	@FindBy(xpath="(//div[@class='me-auto'])[5]")
	private WebElement ValidationMsgOnSSNumberFieldCore;  
	
	@FindBy(xpath="(//div[@class='me-auto'])[6]")
	private WebElement ValidationMsgOnMobileNumberFieldCore;  
	
	@FindBy(xpath="(//div[@class='me-auto'])[7]")
	private WebElement ValidationMsgOnEmailNumberFieldCore;  
	
	@FindBy(xpath="(//div[@class='me-auto'])[8]")
	private WebElement ValidationMsgOnAddressFieldCore;  
	
	@FindBy(xpath="(//div[@class='me-auto'])[9]")
	private WebElement ValidationMsgOnCityFieldCore;  
	
	@FindBy(xpath="(//div[@class='me-auto'])[10]")
	private WebElement ValidationMsgOnStateFieldCore;  
	
	@FindBy(xpath="(//div[@class='me-auto'])[11]")
	private WebElement ValidationMsgOnZipFieldCore; 
	
	@FindBy(xpath="(//div[@class='me-auto'])[12]")
	private WebElement ValidationMsgOnDriverLicenceFieldCore; 
	
	
	
	
	public void validationMsgPICorebridgeJourney() {
		String ExpectedValidationMsg = "This field is required.";
		String ErrorMsgOnFNfield = ValidationMsgOnFNField.getText();
		Assert.assertEquals(ExpectedValidationMsg, ErrorMsgOnFNfield);
		
		String ErrorMsgOnLNfield = ValidationMsgOnLNField.getText();
		Assert.assertEquals(ExpectedValidationMsg, ErrorMsgOnLNfield);
		
		String ExpectedDropdownValidationMsg = "You must select one.";
		String ErrorMsgOnRelationshipfield = ValidationMsgOnRelationshipField.getText();
		Assert.assertEquals(ExpectedDropdownValidationMsg, ErrorMsgOnRelationshipfield);
		
		String ErrorMsgOnDOBfield = ValidationMsgOnDOBFieldCore.getText();
		Assert.assertEquals(ExpectedValidationMsg, ErrorMsgOnDOBfield);
		
		String ErrorMsgOnSSNumberfield = ValidationMsgOnSSNumberFieldCore.getText();
		Assert.assertEquals(ExpectedValidationMsg, ErrorMsgOnSSNumberfield);
		
		String ErrorMsgOnAddressfield = ValidationMsgOnAddressFieldCore.getText();
		Assert.assertEquals(ExpectedValidationMsg, ErrorMsgOnAddressfield);
		
		String ErrorMsgOnCityfield = ValidationMsgOnCityFieldCore.getText();
		Assert.assertEquals(ExpectedValidationMsg, ErrorMsgOnCityfield);
		
		String ErrorMsgOnStatefield = ValidationMsgOnStateFieldCore.getText();
		Assert.assertEquals(ExpectedDropdownValidationMsg, ErrorMsgOnStatefield);
		
		String ErrorMsgOnDriverLicenceField = ValidationMsgOnDriverLicenceFieldCore.getText();
		Assert.assertEquals(ErrorMsgOnDriverLicenceField, ExpectedValidationMsg);
		
	}
	
	//Validation message on Proposed Insured Information Page for Corebride journey
	@FindBy(xpath="//div[@class='me-auto']")
	private WebElement BirthPlaceValidationMsg;
	
	@FindBy(xpath="(//div[@class='me-auto'])[2]")
	private WebElement USCitizenValidationMsg;
	
	@FindBy(xpath="(//div[@class='me-auto'])[3]")
	private WebElement USArmedForcedValidationMsg;
	
	public void validationMsgOfPIIPage() {
		String expectedValidationMsgofDropdown = "You must select one.";
		String ActualBirthPlaceValidationMsg = BirthPlaceValidationMsg.getText();
		Assert.assertEquals(expectedValidationMsgofDropdown, ActualBirthPlaceValidationMsg);
		
		String expectedValidationMsg = "This field is required.";
		String ActualUSCitizenFieldValidation = USCitizenValidationMsg.getText();
		Assert.assertEquals(expectedValidationMsg, ActualUSCitizenFieldValidation);
		
		String ActualUSArmedForceFieldValidation = USCitizenValidationMsg.getText();
		Assert.assertEquals(expectedValidationMsg, ActualUSArmedForceFieldValidation);
		
		
	}
	
	
	@FindBy(xpath="//p[@class='mud-typography mud-typography-body1']")
	private WebElement TrustOwner;
	
	@FindBy(xpath="//div[@class='me-auto']")
	private WebElement ValidationMsgOnTrustNameField;  
	
	@FindBy(xpath="(//div[@class='me-auto'])[2]")
	private WebElement ValidationMsgOnTaxIDField;  
	
	@FindBy(xpath="(//div[@class='me-auto'])[3]")
	private WebElement ValidationMsgOnTrustDateField;  
	
	@FindBy(xpath="(//div[@class='me-auto'])[4]")
	private WebElement ValidationMsgOnTrusteeNameField;  
	
	public void trustOwnerSelection() {
		isTheOwner.click();
		TrustOwner.click();
	}
	
	public void validationMsgOnTrustOwnerSection() {
		String ExpectedValidationMessage = "This field is required.";
		String errorMsgOnTrustNameField = ValidationMsgOnTrustNameField.getText();
		Assert.assertEquals(errorMsgOnTrustNameField, ExpectedValidationMessage);
		
		String errorMsgOnTaxIDfield = ValidationMsgOnTaxIDField.getText();
		Assert.assertEquals(errorMsgOnTaxIDfield,ExpectedValidationMessage);
		
		String errorMsgOnTrustDatefield = ValidationMsgOnTrustDateField.getText();
		Assert.assertEquals(errorMsgOnTrustDatefield, ExpectedValidationMessage);
		
		String errormsgOnTrusteeName = ValidationMsgOnTrusteeNameField.getText();
		Assert.assertEquals(ExpectedValidationMessage, errormsgOnTrusteeName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[2]")
	private WebElement RelationDrpLGATerm;
	
	@FindBy(xpath="//p[@class='mud-typography mud-typography-body1']")
	private WebElement brother;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[8]")
	private WebElement cityForLGATerm;  
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[9]")
	private WebElement ZipForLGATerm;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[3]")
	private WebElement stateDrpLGATerm;
	
	@FindBy(xpath="//p[@class='mud-typography mud-typography-body1']")
	private WebElement Alabama;
	
	public void relationDrpLGATerm() {
		RelationDrpLGATerm.click();
		brother.click();
	}
	
	public void cityLGATerm() {
		cityForLGATerm.sendKeys("tert");
	}
	
	public void zipLGATerm() {
		ZipForLGATerm.sendKeys("56789");
	}
	
	public void stateDropdownLGATerm() {
		stateDrpLGATerm.click();
		Alabama.click();
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
	
	@FindBy(xpath="//p[@class='mud-typography mud-typography-body1']")
	private WebElement AgricultureOccuption;
	
	@FindBy(xpath="//p[contains(text(),'Automotive')]")
	private WebElement Automative;
	
	public void occupationSpecificLifeSelection() throws InterruptedException {
		occupationSpecificLife.sendKeys("agriculture");
		Thread.sleep(5000);
		AgricultureOccuption.click();
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


//Proposed Insured Information page for Symetra

   @FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input']")
   private WebElement BirthPlaceDropdown;
   
   @FindBy(xpath="//p[contains(text(),'Afghanistan')]")
   private WebElement afganistan;
   
   @FindBy(xpath="//input[@class='mud-radio-input']")
   private WebElement YesUSCtizens;
   
   @FindBy(xpath="(//input[@class='mud-radio-input'])[3]")
   private WebElement YesHaveLifeInsurance;
   
   @FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text']")
   private WebElement Insurancehave;
   
   @FindBy(xpath="(//input[@class='mud-radio-input'])[5]")
   private WebElement YesAgentResponse;
   
   @FindBy(xpath="(//input[@class='mud-radio-input'])[7]")
   private WebElement YesClientResponse;
   
   @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[3]")
   private WebElement typeOfPolicyAgent;
   
   @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[4]")
   private WebElement typeOfPolicyClient;
   
   @FindBy(xpath="//p[contains(text(),'Life Insurance')]")
   private WebElement lifeInsurance;
   
  @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[5]")
   private WebElement CompanySelection;
  
  @FindBy(xpath="//p[contains(text(),'AAA Life Ins. Co')]")
  private WebElement companyName;
  
  @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[2]")
  private WebElement PolicyNum;
  
  @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[3]")
  private WebElement IssueDate;
  
  @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[6]")
  private WebElement PolicyTypeSelection;
  
  @FindBy(xpath="//p[contains(text(),'Permanent')]")
  private WebElement permanent;
  
  @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[7]")
  private WebElement PolicyPurposeDropdown;
  
  @FindBy(xpath="//p[contains(text(),'Personal')]")
  private WebElement Personal;
  
  @FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-start']")
   private WebElement faceAmount;
  
  @FindBy(xpath="(//input[@class='mud-radio-input'])[10]")
  private WebElement noReplacingPolicy;
  
  @FindBy(xpath="(//input[@class='mud-radio-input'])[12]")
  private WebElement noExchange;
  
  @FindBy(xpath="(//input[@class='mud-radio-input'])[13]")
  private WebElement YesSalesMaterialUsed;
  
  @FindBy(xpath="(//input[@class='mud-radio-input'])[15]")
  private WebElement YesTerminatingExistPolicy;
  
  @FindBy(xpath="(//input[@class='mud-radio-input'])[17]")
  private WebElement noDuePolicyContact;
  
  @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[4]")
  private WebElement FormNum;
  
  @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[5]")
  private WebElement typeOfMaterial;
   
   public void birthPlaceSelection() throws InterruptedException {
	   BirthPlaceDropdown.click();
	   Thread.sleep(3000);
	   afganistan.click();
   }
   
   @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[2]")
   private WebElement statedropdown;
   
   @FindBy(xpath="//p[contains(text(),'Alabama')]")
   private WebElement alabama;
   
   public void  stateOfBirth() {
	   statedropdown.click();
	   alabama.click();
   }
   
   public void yesUSCitizen() {
	   YesUSCtizens.click();
   }
   
   public void yesHaveLifeInsurance() {
	   YesHaveLifeInsurance.click();
   }
   
   public void howMuchInsuranceHave() {
	   Insurancehave.sendKeys("2");
   }
   
   public void yesAgentResponse() {
	   YesAgentResponse.click();
   }
   
   public void yesClientResponse() {
	   YesClientResponse.click();
   }
   
   public void policySelectionAgent() throws InterruptedException {
	   typeOfPolicyAgent.click();
	   Thread.sleep(3000);
	   lifeInsurance.click();
   }
   
   public void policySelectionClient() throws InterruptedException {
	   typeOfPolicyClient.click();
	   Thread.sleep(3000);
	   lifeInsurance.click();
   }
   
   public void companySelection() {
	   CompanySelection.click();
	   companyName.click();
   }
   
   public void policyNum() {
	   PolicyNum.sendKeys("987857687");
   }
   
   public void faceAmount() {
	   faceAmount.sendKeys("100000");
   }
   
   public void issueDate() {
	   IssueDate.sendKeys("09091980");
   }
   
   public void policyType() {
	   PolicyTypeSelection.click();
	   permanent.click();
   }
   
   public void policyPurpose() {
	   PolicyPurposeDropdown.click();
	   Personal.click();
   }
   
   public void noReplacingPolicy() {
	   noReplacingPolicy.click();
   }
   
   public void noExchange() {
	   noExchange.click();
   }
   
   public void salesMaterialUsed() {
	   YesSalesMaterialUsed.click();
	   FormNum.sendKeys("3");
	   typeOfMaterial.sendKeys("gold");
   }
   
   public void yesTerminatingExistPolicy() {
	   YesTerminatingExistPolicy.click();
   }
   
   public void noduePolicyContact() {
	   noDuePolicyContact.click();
   }
   
   @FindBy(xpath="//button[@class='mud-button-root mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
   private WebElement nextBtnPIInfo;
   
   public void nextBtnPIIPage() {
	   nextBtnPIInfo.click();
   }
   
 //Symetra Specific Information Page
  @FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text']")
  private WebElement howLongKnownInsured;
  
  @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[2]")
  private WebElement whatCapacity;
  
  @FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input']")
  private WebElement sourceToPayPremiumdropdown;
  
  @FindBy(xpath="//p[contains(text(),'Current Income')]")
  private WebElement currentIncome;
  
  @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[3]")
  private WebElement whyfield;
  
  @FindBy(xpath="//button[@class='mud-button-root mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
  private WebElement nextBtnonSymetraSI; 
  
  public void durationKnownToInsured() {
	  howLongKnownInsured.sendKeys("3 years");
  }
  
  public void capacity() {
	  whatCapacity.sendKeys("gfdfds");
  }
  
  public void sourceToPayPremium() {
	  sourceToPayPremiumdropdown.click();
	  currentIncome.click();
  }
  
  public void ownersResidentialState() {
	  whyfield.sendKeys("pouyggvfg");
  }
  
  public void nextBtnOnSymetraSpecificInfoPage() {
	  nextBtnonSymetraSI.click();
  }
  
  //negative test case of pacific life journey
  @FindBy(xpath="//div[@class='me-auto']")
  private WebElement BirthPlacevalidation;
  
  @FindBy(xpath="(//div[@class='me-auto'])[2]")
  private WebElement Occupationvalidation;
  
  @FindBy(xpath="(//div[@class='me-auto'])[3]")
  private WebElement USCitizenvalidation;
  
  @FindBy(xpath="(//div[@class='me-auto'])[4]")
  private WebElement USArmedvalidation;
  
  
  //Validation Message on Proposured Insured Information page for pecific Life journey
  @FindBy(xpath="//div[@class='me-auto']")
  private WebElement BirthPlaceValidionPLJ;
  
  @FindBy(xpath="(//div[@class='me-auto'])[2]")
  private WebElement OccupationValidionPLJ;
  
  @FindBy(xpath="(//div[@class='me-auto'])[3]")
  private WebElement USCitizenRadioButtonValidionPLJ;
  
  @FindBy(xpath="(//div[@class='me-auto'])[4]")
  private WebElement USArmedForcedRadioButtonValidionPLJ;
  
  public void validationMsgOnPIInfoPageForPacific() {
	  String ExpectedValidationMsgForDropdown = "You must select one.";
	  String ExpectedValidationMsgForTextBoxField = "This field is required.";
	  String ActualValidationMsgForDropdownField = BirthPlaceValidionPLJ.getText();
	  Assert.assertEquals(ExpectedValidationMsgForDropdown, ActualValidationMsgForDropdownField);
	  
	  String ActualValidationMsgOnOccuptionField = OccupationValidionPLJ.getText();
	  Assert.assertEquals(ActualValidationMsgOnOccuptionField, ExpectedValidationMsgForDropdown);
	  
	  String ActualValidationMsgForTextBoxField = USCitizenRadioButtonValidionPLJ.getText();
	  Assert.assertEquals(ExpectedValidationMsgForTextBoxField, ActualValidationMsgForTextBoxField);
	  
	  String ActualValidationMsgForUSArmedForced = USArmedForcedRadioButtonValidionPLJ.getText();
	  Assert.assertEquals(ActualValidationMsgForUSArmedForced, ExpectedValidationMsgForTextBoxField);
  }
  
  
  
  
  
  
  
}









