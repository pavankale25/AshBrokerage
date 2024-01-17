package AshBrokerage.main;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
public class ProtectiveImpInformation {
	public WebDriver driver;
	public ProtectiveImpInformation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@class='mud-radio-input'])[2]")
	private WebElement noconditionapply;
	
	@FindBy(xpath="//button[@class=\"mud-button-root mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple\"]")
    private WebElement nbtn;
	
	public void switchWindow() throws InterruptedException {
		Set<String> handles = driver.getWindowHandles();
		Iterator it = handles.iterator();
		String parent_id = (String) it.next();
		String child_id = (String) it.next();
		driver.switchTo().window(child_id);  
}
	public void noConditionApply() {
		noconditionapply.click();
	}
	
	public void nextBtn() {
		nbtn.click();
	}
	
	//Start App - Proposed Insured Information Page
	@FindBy(xpath="//div[@class='mud-input mud-input-text mud-input-adorned-end mud-input-underline mud-select-input']//div[@class='mud-input-adornment mud-input-adornment-end mud-select-input']//*[name()='svg']")
	private WebElement suffixdropdown;
	
	@FindBy(xpath="//div[@class='mud-list-item mud-list-item-gutters mud-list-item-clickable mud-ripple']")
	private WebElement Jr;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[3]")
	private WebElement address;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[4]")
	private WebElement address2;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[5]")
	private WebElement City;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[2]")
	private WebElement stateDropdown;
	
	@FindBy(xpath="//p[contains(text(),'Idaho')]")
	private WebElement idahoState;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[6]")
	private WebElement Zip;
	
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[7]")
    private WebElement email;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[8]")
    private WebElement phoneNumber;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[9]")
    private WebElement SSNumber;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[4]")
    private WebElement maritalStatusDropdown;
    
    @FindBy(xpath="//p[@class='mud-typography mud-typography-body1']")
    private WebElement Married;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[5]")
    private WebElement issuedStatedropdown;
    
    @FindBy(xpath="//p[contains(text(),'Idaho')]")
    private WebElement idahostate;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[11]")
    private WebElement DriversLNumber;
	
    @FindBy(xpath="(//input[@class='mud-radio-input'])[2]")
    private WebElement NoOwnerPolicy;
    
    @FindBy(xpath="//span[contains(text(),'Next')]")
    private WebElement nextbtn;
    
	public void suffixSelection() {
		suffixdropdown.click();
		Jr.click();
	}
	
	public void addressSend() {
		address.sendKeys("1234 Idaho Street");
	}
	
	public void address2Send() {
		address2.sendKeys("Apt 1");
	}
	
	public void city() {
		City.sendKeys("Boise");
	}
	
	public void zipCode() {
		Zip.sendKeys("44444");
	}
	
	public void stateSelection() {
		stateDropdown.click();
		Actions action = new Actions(driver);
		action.scrollToElement(idahoState).perform();
		idahoState.click();
	}
	
	public void emailSend() {
		email.sendKeys("test@email.com");
	}
	
	public void phoneNumberSend() {
		phoneNumber.sendKeys("2083457890");
	}
	
	public void SocialSecurityNumber() {
		SSNumber.sendKeys("333224444");
	}
	
	public void maritalStatus() {
		maritalStatusDropdown.click();
		Married.click();
	}
	
	public void issuedInState() {
		issuedStatedropdown.click();
		idahostate.click();
	}
	
	public void driverLicenseNum() {
		DriversLNumber.sendKeys("AA123456B");
	}
	
	public void yesOwnerOfPolicy() {
		NoOwnerPolicy.click();
	}
	
	public void nextBtnPIIpage() {
		nextbtn.click();
	}
	
	
	
	//Proposed Insured Information page
	@FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input']")
	private WebElement birthplaceDropDown;
	
	@FindBy(xpath="//p[contains(text(),'United States')]")
	private WebElement unitedState;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[2]")
	private WebElement birthStateDropDown;
	
	@FindBy(xpath="//p[contains(text(),'Idaho')]")
	private WebElement idahostateforBirth;

	@FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-start']")
	private WebElement householdIncome;
	
	@FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-start']")
	private WebElement estimatedNetWorth;
	
	@FindBy(xpath="//input[@class='mud-radio-input']")
	private WebElement yesUSCitizen;
	
	@FindBy(xpath="//input[@class='mud-radio-input'])[4]")
	private WebElement noUSArmedForce;
	
	@FindBy(xpath="//button[@class='mud-button-root mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
	private WebElement nextBtn;
	
	public void proposedInsuredInfo() {
		birthplaceDropDown.click();
		unitedState.click();
		birthStateDropDown.click();
		idahostateforBirth.click();
		householdIncome.sendKeys("200000");
		estimatedNetWorth.sendKeys("200000");
		yesUSCitizen.click();
		noUSArmedForce.click();
		nextBtn.click();
	}
	
//Existing Policy Information page
	 @FindBy(xpath="(//input[@class='mud-radio-input'])[2]")
	 private WebElement noPending;
	 
	 @FindBy(xpath="(//input[@class='mud-radio-input'])[4]")
	 private WebElement noLifeInsurance;
	 
	 @FindBy(xpath="//button[@class='mud-button-root mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
	 private WebElement next_btn;
	 
	 public void policyInfo() {
		 noPending.click();
		 noLifeInsurance.click();
		 next_btn.click();
	 }
	 
//Suiability page
	 @FindBy(xpath="//input[@class='mud-radio-input']")
	 private WebElement yesmetproposedinsured;
	 
	 @FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input']")
	 private WebElement purposeOfInsuranceDropdown;
	 
	 @FindBy(xpath="//p[contains(text(),'Personal')]")
	 private WebElement personal;
	 
	 @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[2]")
	 private WebElement specifyDropdown;
	 
	 @FindBy(xpath="//p[contains(text(),'Family Protection')]")
	 private WebElement familyProtection;
	 
	 @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[3]")
	 private WebElement premiumPayer;
	 
	 @FindBy(xpath="//p[@class='mud-typography mud-typography-body1']")
	 private WebElement insured;
	 
	 @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[4]")
	 private WebElement premiumPaymentSourceDropdown;
	 
	 @FindBy(xpath="//p[contains(text(),'Income')]")
	 private WebElement income;
	 
	 @FindBy(xpath="(//input[@class='mud-radio-input'])[3]")
	 private WebElement yesDropDown;
	 
	 @FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text']")
	 private WebElement accountHolderFN;  
	 
	 @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[2]")
	 private WebElement accountHolderLN;  
	 
	 @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[3]")
	 private WebElement accountHolderAddress;
	 
	 @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[4]")
	 private WebElement accountHolderCity;  
	 
	 @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[5]")
	 private WebElement accountHolderState;
	 
	 @FindBy(xpath="//p[contains(text(),'Idaho')]")
	 private WebElement idahostateSelected;
	 
	 @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[5]")
	 private WebElement accountHolderzip;  
	 
	 @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[6]")
	 private WebElement FinaInstiName;  
	 
	 @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[6]")
	 private WebElement accountType;
	 
	 @FindBy(xpath="//p[contains(text(),'Checking')]")
	 private WebElement checking;
	 
	 @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[7]")
	 private WebElement routingNum;  
	 
	 @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[8]")
	 private WebElement accountNum; 
	 
	 @FindBy(xpath="//span[contains(text(),'Next')]")
	 private WebElement nextSuitabilitybtn;
	 
	 public void yesMetProposedInsurance() {
		 yesmetproposedinsured.click();
	 }
	 
	 public void purposeOfInsurance() {
		 purposeOfInsuranceDropdown.click();
		 personal.click();
	 }
	 
	 public void specify() {
		 specifyDropdown.click();
		 familyProtection.click();
	 }
	 
	 public void premiumPayer() {
		 premiumPayer.click();
		 insured.click();
	 }
	 
	 public void paymentSource() {
		 premiumPaymentSourceDropdown.click();
		 income.click();
	 }
	 
	 public void temporyCoverage() {
		 yesDropDown.click();
	 }
	 
	 public void accountHolderFirstName() {
		 accountHolderFN.sendKeys("Test");
	 }
	 
	 public void accountHolderLastName() {
		 accountHolderLN.sendKeys("Account Holder");
	 }
	 
	 public void accountHolderAddress() {
		 accountHolderAddress.sendKeys("123 Main St");
	 }
	 
	 public void accountHolderCity() {
		 accountHolderCity.sendKeys("Boise");
	 }
	 
	 public void accountHolderStateSelection() {
		 accountHolderState.click();
		 Actions action = new Actions(driver);
		 action.scrollToElement(idahostateSelected).perform();
		 idahostateSelected.click();
	 }
	 
	 public void accountHolderZIP() {
		 accountHolderzip.sendKeys("83714");
	 }
	 
	 public void finacialInstiName() {
		 FinaInstiName.sendKeys("Bank Name");
	 }
	 
	 public void accountTypeSelection() {
		 accountType.click();
		 checking.click();
	 }
	 
	 public void routingNum() {
		 routingNum.sendKeys("123456789");
	 }
	 
	 public void accountNum() {
		 accountNum.sendKeys("77777777");
	 }
	 
	 public void nextBtnOnSuitabilitypage() {
		 nextSuitabilitybtn.click();
	 }
		
	//Additional Policy Information Page
	 @FindBy(xpath="(//input[@class='mud-radio-input'])[2]")
	 private WebElement NoInterestPolicy;
	 
	 @FindBy(xpath="(//input[@class='mud-radio-input'])[4]")
	 private WebElement noFuturePremiums;
		
	@FindBy(xpath="(//input[@class='mud-radio-input'])[6]")	
	private WebElement proposedInsuredOverAge;
	
	@FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text']")
    private WebElement agentRelationToProposedInsured;
	
    @FindBy(xpath="(//input[@class='mud-radio-input'])[7]")
    private WebElement yesElectronicallyDelivered;
    
    @FindBy(xpath="//button[@class='mud-button-root mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
    private WebElement nextBtnAPI;
    
	
    public void noInterestPolicy() {
    	NoInterestPolicy.click();
    }
    
    public void futurePremium() {
    	noFuturePremiums.click();
    }
    
    public void ageisGreaterThan65() {
    	proposedInsuredOverAge.click();
    	agentRelationToProposedInsured.sendKeys("friend");
    }
    
    public void policyElectronicallyDelivered() {
    	yesElectronicallyDelivered.click();
    }
    
    public void nextBtnOnAPI() {
    	nextBtnAPI.click();
    }
  
    //Agent Attestation
    @FindBy(xpath="//span[contains(text(),'Next')]")
    private WebElement nextBtnOnAgentAttestation;
    
    public void clickOnNextBtn() {
    	nextBtnOnAgentAttestation.click();
    } 
    
    //Agent Information Page
    @FindBy(xpath="//input[@class='mud-radio-input']")
    private WebElement yesAgentSplit;
    
    
	
	
	
	}



