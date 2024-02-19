package AshBrokerage.main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.interactions.Actions;
public class ExistingPolicyInformationPage {
	public WebDriver driver;
	public ExistingPolicyInformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@class='mud-radio-input'])[2]")
	private WebElement noPendingApp;
	
	public void noPendingApplication() {
		noPendingApp.click();
	}
	
	@FindBy(xpath="(//input[@class='mud-radio-input'])[4]")
	private WebElement noInsuredDeclined;
	
	public void noProposedInsuredDeclined() {
		noInsuredDeclined.click();
	}
	
	@FindBy(xpath="(//input[@class='mud-radio-input'])[5]")
	private WebElement anyLifeInsured;
	
	public void proposedHasAnyLifeInsurance() {
		anyLifeInsured.click();
	}
	
	@FindBy(xpath="(//input[@class='mud-radio-input'])[3]")
	private WebElement anyLifeInsuredProtective;
	
	public void yesAnyLifeInsuredProtective() {
		anyLifeInsuredProtective.click();
	}
	
	@FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text']")
	private WebElement company;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[2]")
	private WebElement policynum;
	
	@FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-start']")
	private WebElement faceamount;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[3]")
	private WebElement issueDate;
	
	@FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input']")
	private WebElement policyTypedropdown;
	
	@FindBy(xpath="(//p[@class='mud-typography mud-typography-body1'])[2]")
	private WebElement term;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[2]")
	private WebElement policyPurposedrop;
	
	@FindBy(xpath="//p[@class='mud-typography mud-typography-body1']")
	private WebElement personalPurpose;
	
	
	@FindBy(xpath="(//input[@class='mud-radio-input'])[8]")
	private WebElement noReplacing;
	
	@FindBy(xpath="(//input[@class='mud-radio-input'])[10]")
	private WebElement noExistingPolicyradio;
	
	@FindBy(xpath="(//input[@class='mud-radio-input'])[12]")
	private WebElement noNewPolicyradio;
	
	@FindBy(xpath="(//input[@class='mud-radio-input'])[13]")
	private WebElement yesSalesMaterialUsed;
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[4]")
	private WebElement salesMaterial;
	
	@FindBy(xpath="(//span[@class='mud-button-label'])[2]")
	private WebElement nextbtnEPI;
	
	public void existingPolicyDetail() {
		company.sendKeys("Test");
		policynum.sendKeys("123ABCXYZ");
		faceamount.sendKeys("50000");
		issueDate.sendKeys("12122002");
		policyTypedropdown.click();
		term.click();
		policyPurposedrop.click();
		personalPurpose.click();
	}
	public void questionForExistingPolicy() {
		noReplacing.click();
		noExistingPolicyradio.click();
		noNewPolicyradio.click();
		yesSalesMaterialUsed.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", nextbtnEPI);
		salesMaterial.sendKeys("qwer");
	}
	
	@FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input']")
	private WebElement policyTypeDropDown;
	
	@FindBy(xpath="//p[contains(text(),'Whole Life')]")
	private WebElement wholeLife;
	
	@FindBy(xpath="(//input[@class='mud-radio-input'])[6]")
	private WebElement NoreplacingProtective;
	
	@FindBy(xpath="(//input[@class='mud-radio-input'])[7]")
	private WebElement Yes1035Exchange;
	
	public void existingPolicyDetailProtective() {
		company.sendKeys("Test");
		policynum.sendKeys("123ABCXYZ");
		faceamount.sendKeys("50000");
		issueDate.sendKeys("12122002");
		policyTypeDropDown.click();
		wholeLife.click();
		NoreplacingProtective.click();
		Yes1035Exchange.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", nextbtnEPI);
	}
	
	public void nextBtnOnExistingPolicyInfoPage() {
		nextbtnEPI.click();
	}
	
	@FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-start'])[1]")
	private WebElement EarnedIncome;
	
	public void earnedIncome() {
		EarnedIncome.sendKeys("100000");
	}
	
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-start'])[2]")
    private WebElement HouseHoldIncome;
    
    public void sendHouseHoldIncome() {
    	HouseHoldIncome.sendKeys("200000");
    }
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-start'])[3]")
    private WebElement netWorth;
    
    public void sendNetWorthIncome() {
    	netWorth.sendKeys("200000");
    }
    
    @FindBy(xpath="(//input[@class='mud-radio-input'])[2]")
    private WebElement InsuredReplace;
    
    public void insuredReplace() {
    	InsuredReplace.click();
    }
    
    @FindBy(xpath="(//input[@class='mud-radio-input'])[4]")
    private WebElement noAwareaboutOther;
    
    public void noAwareAboutOtherInsured() {
    	noAwareaboutOther.click();
    }
    
    @FindBy(xpath="(//span[@class='mud-typography mud-typography-button'])[2]")
    private WebElement nextBtn;
    
    public void nextBtnOnFinacialInformationPage() {
    	nextBtn.click();
    }
    
    //Additional Policy Information Page
    
    @FindBy(xpath="//input[@class='mud-radio-input']")
    private WebElement metProposedInsured;
    
    public void YesmetProposedInsured() {
    	metProposedInsured.click();
    }
    
    @FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input']")
    private WebElement purposeofInsuranceaDropdown;
    
    @FindBy(xpath="//p[@class='mud-typography mud-typography-body1']")
    private WebElement personal;
    
    public void selectedInsuredType() {
    	purposeofInsuranceaDropdown.click();
    	personal.click();
    }
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[2]")
    private WebElement reason;
    
    @FindBy(xpath="//p[contains(text(),'Family Protection')]")
    private WebElement familyprotection;
    
    public void specifyInsuredPurpose() {
    	reason.click();
    	Actions action = new Actions(driver);
    	action.scrollToElement(familyprotection).perform();
    	familyprotection.click();
    }
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[3]")
    private WebElement premiumPayer;
    
    @FindBy(xpath="//p[text()='Insured']")
    private WebElement insured;
    
    public void premiumPayerSelection() {
    	premiumPayer.click();
    	insured.click();
    }
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[4]")
    private WebElement premiumPaymentSourceDrop;
    
    @FindBy(xpath="(//p[@class='mud-typography mud-typography-body1'])[1]")
    private WebElement income;
    
    public void paymentSourceSelected() {
    	premiumPaymentSourceDrop.click();
    	income.click();
    }
    
    @FindBy(xpath="(//input[@class='mud-radio-input'])[4]")
    private WebElement noTIA;
    
    public void noTemporyInsuranceAgreement() {
    	noTIA.click();
    }
    
    @FindBy(xpath="(//div[@class='d-flex justify-space-between pa-5']//span[@class='mud-typography mud-typography-button'])[2]")
    private WebElement nextBtnAPI;
    
    public void nextBtnOnAdditionalPolicyInformationPage() {
    	nextBtnAPI.click();
    }
    
    //Beneficiary  Information Page
    @FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input']")
    private WebElement relationshipdropdown;
    
    @FindBy(xpath="//p[contains(text(),'Cousin')]")
    private WebElement cousin;
    
    @FindBy(xpath="//p[@class='mud-typography mud-typography-body1' and text()='Domestic Partner']")
    private WebElement domesticPartner;
    
    public void relationshipSelection() {
    	relationshipdropdown.click();
    	Actions action = new Actions(driver);
    	action.scrollToElement(domesticPartner).perform();
    	domesticPartner.click();
    }
    
    public void relationship() { //protective
    	relationshipdropdown.click();
    	Actions action = new Actions(driver);
    	action.scrollToElement(cousin).perform();
    	cousin.click();
    }
    
    @FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text']")
    private WebElement firstname;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[2]")
    private WebElement lastname;
    
    @FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end']")
    private WebElement percentage;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[3]")
    private WebElement ssn;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[4]")
    private WebElement DateOfBirth;
    
    
    public void information() {
    	firstname.sendKeys("Test");
    	lastname.sendKeys("Spouse");
    	percentage.sendKeys("50");
    	ssn.sendKeys("558-88-1900");
    	//nextBtnOnBIP.click();
    }
    
    public void dateOfBirth() {
    	DateOfBirth.sendKeys("12091989");
    }
    
    //Add Primary Beneficiaries
    @FindBy(xpath="//button[@class='mud-button-root mud-icon-button mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
    private WebElement PrimaryBeneficiaries;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[2]")
    private WebElement relationship;
    		
    @FindBy(xpath="(//p[@class='mud-typography mud-typography-body1'])[2]")
    private WebElement brother;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[4]")
    private WebElement Firstname;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[5]")
    private WebElement Lastname;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end'])[2]")
    private WebElement primaryBpercntage;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[6]")
    private WebElement SSN;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[8]")
    private WebElement DOB;
    
    public void addPrimaryBeneficiaries() {
    	PrimaryBeneficiaries.click();
    }
    
    public void selectedRelationship() {
    	relationship.click();
    	brother.click();
    }
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[5]")
    private WebElement FirstName;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[6]")
    private WebElement LastName;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[7]")
    private WebElement SSNumber;
    
    public void benefiariesDetailProtective() {
    	FirstName.sendKeys("test");
    	LastName.sendKeys("name");
    	primaryBpercntage.sendKeys("50");
    	SSNumber.sendKeys("767767766");
    }
    
    public void benefiariesDetail() {
    	Firstname.sendKeys("test");
    	Lastname.sendKeys("name");
    	primaryBpercntage.sendKeys("50");
    	SSN.sendKeys("767767766");
    }
    
    public void dateOfBirthBrother() {
    	DOB.sendKeys("09092000");
    }
    //Contingent Beneficiaries 
  
    @FindBy(xpath="(//button[@class='mud-button-root mud-icon-button mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple'])[2]")
    private WebElement ContingentBeneficiaries;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[3]")
    private WebElement ContigentRelationDrop;
    
    @FindBy(xpath="//p[contains(text(),'Business')]")
    private WebElement bussiness;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[7]")
    private WebElement bussinessEntityName;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[9]")
    private WebElement bussinessEntityNameProtective;
    
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end'])[3]")
    private WebElement perContigentBene;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[8]")
    private WebElement corpOfficerFirstName;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[9]")
    private WebElement corpOfficerLastName;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[10]")
    private WebElement corpOfficerTitle;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[11]")
    private WebElement bussEntityTIN;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[10]")
    private WebElement bussEntityTINProtective;
    
    @FindBy(xpath="//button[@class='mud-button-root mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
    private WebElement nextBtnOnBIP;
    
    
    public void addContingentBeneficiaries() {
    	ContingentBeneficiaries.click();
    }
    
    public void relationSelection() throws InterruptedException {
    	ContigentRelationDrop.click();
    	Actions action = new Actions(driver);
    	Thread.sleep(3000);
    	action.scrollToElement(bussiness);
    	bussiness.click();
    }
    
    public void contigentDetail() {
    	bussinessEntityName.sendKeys("test");
    	perContigentBene.sendKeys("100");
    	}
    
    public void corporateOfficeFN() {
    	corpOfficerFirstName.sendKeys("test1");
    }
    
    public void corporateOfficeLN() {
    	corpOfficerLastName.sendKeys("test2");
    }
    
    public void corporateOfficerTitle() {
    	corpOfficerTitle.sendKeys("child");
    }
    
    public void bussinessEntityTIN() {
    	bussEntityTIN.sendKeys("897572576");
    	}
    
    public void bussinessEntityNameProtective() {
    	bussinessEntityNameProtective.sendKeys("entity");
    	perContigentBene.sendKeys("100");
    }
    
    public void bussinessEntityTINProtective() {
    	bussEntityTINProtective.sendKeys("897572576");
    }
    
    public void nextBtn() {
    	nextBtnOnBIP.click();
    }
    
 //Beneficiary Information page for Symetra
    @FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input']")
    private WebElement relationDropdown;
    
    @FindBy(xpath="(//p[@class='mud-typography mud-typography-body1'])[2]")
    private WebElement parent;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[5]")
    private WebElement PhoneNumber;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[6]")
    private WebElement Email;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[7]")
    private WebElement Address;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[8]")
    private WebElement City;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[2]")
    private WebElement stateDropdown;
    
    @FindBy(xpath="//p[@class='mud-typography mud-typography-body1']")
    private WebElement alabamaState;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[9]")
    private WebElement Zip;
    
    public void relationSelectionForSymetra() {
    	relationDropdown.click();
    	parent.click();
    }
    
    public void phoneNumber() {
    	PhoneNumber.sendKeys("9090897867");
    }
    
    public void email() {
    	Email.sendKeys("abc@gmail.com");
    }

    public void address() {
    	Address.sendKeys("tyrtytrhr");
    }
    
    public void city() {
    	City.sendKeys("samdd");
    }
    
    public void stateSelection() {
    	stateDropdown.click();
    	alabamaState.click();;
    }
    
    public void zip() {
    	Zip.sendKeys("65654");
    }
    
    //Add Primary Beneficiaries for symetra
    @FindBy(xpath="//button[@class='mud-button-root mud-icon-button mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
    private WebElement addPrimaryBene;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[3]")
    private WebElement relationDropdownforAddPrimary;
    
    @FindBy(xpath="(//p[@class='mud-typography mud-typography-body1'])[5]")
    private WebElement trust;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[10]")
    private WebElement TrustName;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end'])[2]")
    private WebElement peragent;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[12]")
    private WebElement trustDate;
    
    public void addPrimaryBeneficiary() {
    	addPrimaryBene.click();
    }
    
    public void relationDropDown() {
    	relationDropdownforAddPrimary.click();
    	trust.click();
    }
    public void trustName() {
    	TrustName.sendKeys("one");;
    }
    
    public void agentPercentage() {
    	peragent.sendKeys("50");
    }
    
    public void trustDate() {
    	trustDate.sendKeys("12031990");
    }
    
    //Contingent Bene
    @FindBy(xpath="(//button[@class='mud-button-root mud-icon-button mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple'])[2]")
    private WebElement addContingentBene;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[4]")
    private WebElement relationDrp;
    
    @FindBy(xpath="//p[contains(text(),'Parent')]")
    private WebElement Parent;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[13]")
    private WebElement FirstN;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[14]")
    private WebElement LastN;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end'])[3]")
    private WebElement PercentageContigent;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[15]")
    private WebElement SSNforConti;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[16]")
    private WebElement DofBirth;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[17]")
    private WebElement MobileNum;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[18]")
    private WebElement Emailpass;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[19]")
    private WebElement AddressforCont;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[20]")
    private WebElement CityforConti;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[5]")
    private WebElement stateDrpForCont;
    
    @FindBy(xpath="//p[contains(text(),'Alabama')]")
    private WebElement AlabamaState;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[21]")
    private WebElement ZipforConti;
    
    @FindBy(xpath="//button[@class='mud-button-root mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
    private WebElement btnBIPage;
    
    public void addContingentbeneficiaries() {
    	addContingentBene.click();
    }
    
    public void relationselection() {
    	relationDrp.click();
    	Parent.click();
    }
    
    public void fName() {
    	FirstN.sendKeys("yyturtyu");
    }
    
    public void lName() {
    	LastN.sendKeys("lkkjh");
    }
    
    public void percentageForCont() {
    	PercentageContigent.sendKeys("100");
    }
    
    public void ssnCont() {
    	SSNforConti.sendKeys("786789098");
    }
    
    public void dateOfBirthCont() {
    	DofBirth.sendKeys("01021980");
    }
    
    public void mobileNumCont() {
    	MobileNum.sendKeys("9090121343");
    }
    
    public void emailCont() {
    	Emailpass.sendKeys("xyz@gmail.com");
    }
    
    public void addressCont() {
    	AddressforCont.sendKeys("mnbv");
    }
    
    public void cityCont() {
    	CityforConti.sendKeys("vittrt");
    }
    
    public void stateCont() {
    	stateDrpForCont.click();
    	AlabamaState.click();
    }
    
    public void zipCont() {
    	ZipforConti.sendKeys("76890");
    }
    
    public void btnOnBIpage() {
    	btnBIPage.click();
    }
    
    
  //Agent Information page 
    @FindBy(xpath="//input[@class='mud-radio-input']")
    private WebElement agentSplit;
    
    @FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end']")
    private WebElement agentPercentage;
    
    @FindBy(xpath="(//*[name()='path'])[7]")
    private WebElement AddAgent;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[14]")
    private WebElement AgentFirstName;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[15]")
    private WebElement AgentLastName;
    
 //   @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[16]")
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[3]")
    private WebElement AgentSSN;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[16]")
    private WebElement AgentSSNumber;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end'])[2]")
    private WebElement AgentPer;
    
    @FindBy(xpath="(//span[@class='mud-typography mud-typography-button'])[2]")
    private WebElement submitBtn;
    
    public void yesAgentSplit() throws InterruptedException {
    	agentSplit.click();
    	Thread.sleep(5000);
    	agentPercentage.clear();
    	Thread.sleep(5000);
    	agentPercentage.sendKeys("50");
    }
     
    public void addAgent() {
    	AddAgent.click();
    }
    
    public void agentDetail() throws InterruptedException {
    	Actions action = new Actions(driver);
    	Thread.sleep(3000);
    	action.scrollToElement(submitBtn);
    	AgentFirstName.sendKeys("fir");
    	AgentLastName.sendKeys("last");
    	AgentSSN.sendKeys("987641234");
    	AgentSSNumber.sendKeys("345690878");
    	AgentPer.sendKeys("90");
    }
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[15]")
    private WebElement AgentFirstNameCoreBridge;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[16]")
    private WebElement AgentLastNameCoreBridge;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[17]")
    private WebElement AgentSSNCoreBridge;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[18]")
    private WebElement CarrierAppoNum;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end'])[2]")
    private WebElement AgentPerCoreBridge;
    
 public void agentDetailCoreBridge() {
	 AgentFirstNameCoreBridge.sendKeys("fir");
	 AgentLastNameCoreBridge.sendKeys("last");
	 AgentSSNCoreBridge.sendKeys("987641234");
	 CarrierAppoNum.sendKeys("2345798067");
	 AgentPerCoreBridge.sendKeys("90");
    }
 
   @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[13]")
   private WebElement FNAgent;
   
   @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[14]")
   private WebElement LNAgent;
   
   @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[15]")
   private WebElement SSNAgent;
   
   @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end'])[2]")
   private WebElement percentageSplit;
   
 public void agentDetailPacificLife() {
	 FNAgent.sendKeys("ghjk");
	 LNAgent.sendKeys("lkjh");
	 SSNAgent.sendKeys("789456123");
	 percentageSplit.sendKeys("90");
 }
    
    public void clickOnSubmitBtn() {
    	submitBtn.click();
    }
    
    //Agent Information Page for Symetra Journey
     
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[5]")
    private WebElement AgencyName;
    
    @FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end']")
    private WebElement percentageAgentSplit;
    
    @FindBy(xpath="//button[@class='mud-button-root mud-icon-button mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
    private WebElement AddAgentSplit;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[13]")
    private WebElement FnameAgent;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[14]")
    private WebElement LnameAgent;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[15]")
    private WebElement PhoneNumAgent;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[16]")
    private WebElement EmailAgent;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[17]")
    private WebElement Agencyname;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[18]")
    private WebElement NPN;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[6]")
    private WebElement NPNAgentInfo;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end'])[2]")
    private WebElement perAddAgent;
    
    @FindBy(xpath="//button[@class='mud-button-root mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
    private WebElement nextBtnAgentInfo;
    
    public void agencyName() {
    	AgencyName.sendKeys("licufg");
    }
    
    public void perAgentSplit() {
    	percentageAgentSplit.sendKeys(Keys.BACK_SPACE);
    }
    
    public void addAgentSplit() {
    	AddAgentSplit.click();
    }
    
    public void fnameAgent() {
    	FnameAgent.sendKeys("lkjhg");
    }
    
    public void lnameAgent() {
    	LnameAgent.sendKeys("poiuy");
    }
    
    public void phoneNumberAgent() {
    	PhoneNumAgent.sendKeys("9087658798");
    }
    
    public void emailAgent() {
    	EmailAgent.sendKeys("abc@gmail.com");
    }
    
    public void agentName() {
    	Agencyname.sendKeys("uyityo");
    }
    
    public void npn() throws InterruptedException {
    	NPN.clear();
    	Thread.sleep(4000);
    	NPN.sendKeys("46790");
    }
    
    public void npnAgentNum() throws InterruptedException {
    	for(int i=1;i<=9;i++) {
    		NPNAgentInfo.sendKeys(Keys.BACK_SPACE);
    	}
    	Thread.sleep(4000);
    	NPNAgentInfo.sendKeys("46790");
    }
    
    @FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input']")
    private WebElement carrierAppointmentNum;
    
    @FindBy(xpath="(//p[@class='mud-typography mud-typography-body1'])[2]")
    private WebElement AppointmentNum;
    
    public void appointNum() {
    	carrierAppointmentNum.click();
    	AppointmentNum.click();
    }
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[2]")
    private WebElement carrierAppointmentNumAgentSplit;
    
    public void carrierAppoAgentSplit() {
    	carrierAppointmentNumAgentSplit.click();
    	AppointmentNum.click();
    }
    
    public void percentaheAddAgent() {
    	perAddAgent.sendKeys("90");
    }
    
    public void nextBtnOnAgentInfoPage() {
    	nextBtnAgentInfo.click();
    }
    
    @FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text']")
    private WebElement AgentFirstN;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[2]")
    private WebElement AgentLastN;
    
    public void agentFirstN() {
    	AgentFirstN.sendKeys("lkjghfgh");
    }
    
    public void agentLastN() {
    	AgentLastN.sendKeys("asdfgh");
    }
    
    //Agent Attestation Page for symetra
  @FindBy(xpath="//input[@class='mud-checkbox-input']")
  private 	WebElement chckBox1;
  
  @FindBy(xpath="(//input[@class='mud-checkbox-input'])[2]")
  private 	WebElement chckBox2;
  
  @FindBy(xpath="(//input[@class='mud-checkbox-input'])[3]")
  private 	WebElement chckBox3;
  
  @FindBy(xpath="(//input[@class='mud-checkbox-input'])[4]")
  private 	WebElement chckBox4;
  
  @FindBy(xpath="(//input[@class='mud-checkbox-input'])[5]")
  private 	WebElement chckBox5;
  
  @FindBy(xpath="(//input[@class='mud-checkbox-input'])[6]")
  private 	WebElement chckBox6;
  
  @FindBy(xpath="(//input[@class='mud-checkbox-input'])[7]")
  private 	WebElement chckBox7;
  
  @FindBy(xpath="(//input[@class='mud-checkbox-input'])[8]")
  private 	WebElement chckBox8;
  
  @FindBy(xpath="//button[@class='mud-button-root mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
  private WebElement SubmitButton;
  
public void clickOnCheckBox() {
	chckBox1.click();
	chckBox2.click();
	chckBox3.click();
	chckBox4.click();
	chckBox5.click();
	chckBox6.click();
	chckBox7.click();
	chckBox8.click();
}

public void submitButton() {
	SubmitButton.click();
}

    
    
    
    
    //submit page
    
    @FindBy(xpath="//button[@title='Refresh Data']//span[@class='mud-icon-button-label']//*[name()='svg']")
    private WebElement refreshbtn;
    
    @FindBy(xpath="(//h1[@class='mud-typography mud-typography-h1'])[2]")
    private WebElement status;
    
    public void refreshBtn() throws InterruptedException {
    	 for(int i=1;i<10;i++) {
    		 refreshbtn.click();
    		 Thread.sleep(3000);
    		 if(status.getText().equalsIgnoreCase("Status: Application Submitted To Carrier")) {
    			 break;
    		 }
    		 else {
    			 continue;
    		 }
    		 
    	    }
    }
    
    //negative test case of Existing Policy Info Page
    @FindBy(xpath="//div[@class='me-auto']")
    private WebElement ValidationMsgforApplicationPendingDropdown;
    
    @FindBy(xpath="(//div[@class='me-auto'])[2]")
    private WebElement ValidationMsgForPostpondDropdown;
    
    @FindBy(xpath="(//div[@class='me-auto'])[3]")
    private WebElement ValidationMsgForAnyLifeInsuranceddropdown;
    
    public void validationMsgofExistingPolicyInfoPage() {
    	String ExpectedValidationMsg = "This field is required.";
    	String ActualValidationMsgForApplicationPending = ValidationMsgforApplicationPendingDropdown.getText();
    	Assert.assertEquals(ExpectedValidationMsg, ActualValidationMsgForApplicationPending);
    	
    	String ActualValidationMsgforPostpondDropdown = ValidationMsgForPostpondDropdown.getText();
    	Assert.assertEquals(ExpectedValidationMsg, ActualValidationMsgforPostpondDropdown);
    	
    	String ActualValidationMsgforAnyLifeInsuranceDropdown = ValidationMsgForAnyLifeInsuranceddropdown.getText();
    	Assert.assertEquals(ActualValidationMsgforAnyLifeInsuranceDropdown, ExpectedValidationMsg);
    }
    
    
    //negative test case of Finacial Specific Info Page for corebridge journey
    @FindBy(xpath="//div[@class='me-auto']")
    private WebElement ValidationMsgOfEarnedIncomeField;
    
    @FindBy(xpath="(//div[@class='me-auto'])[2]")
    private WebElement ValidationMsgOfHouseHoldIncomeField;
    
    @FindBy(xpath="(//div[@class='me-auto'])[3]")
    private WebElement ValidationMsgOfNetWorthField;
    
    @FindBy(xpath="(//div[@class='me-auto'])[4]")
    private WebElement ValidationMsgOfDropdown;
    
    public void validationMsgOnFinacialSpeInfoPage() {
    	String ExpectedValidationMsg = "This field is required.";
    	String ActualValidationMsgOfEarnedincomeField = ValidationMsgOfEarnedIncomeField.getText();
    	Assert.assertEquals(ActualValidationMsgOfEarnedincomeField, ExpectedValidationMsg);
    	
    	String ActualValidationMsgOfHouseHoldIncomeField = ValidationMsgOfHouseHoldIncomeField.getText();
    	Assert.assertEquals(ActualValidationMsgOfHouseHoldIncomeField, ExpectedValidationMsg);
    	
    	String ActualValidationMsgOfNetworkField = ValidationMsgOfNetWorthField.getText();
    	Assert.assertEquals(ExpectedValidationMsg, ActualValidationMsgOfNetworkField);
    	
    	String ActualValidationMsgOfDropdown = ValidationMsgOfDropdown.getText();
    	Assert.assertEquals(ExpectedValidationMsg, ActualValidationMsgOfDropdown);
    }
    
    //negative test case of Additional Policy Info page for corebridge journey
    @FindBy(xpath="//div[@class='me-auto']")
    private WebElement ValidationPersonallyMetDropdownField;
    
    @FindBy(xpath="(//div[@class='me-auto'])[2]")
    private WebElement ValidationMsgOfPurposeOfInsuField;
    
    @FindBy(xpath="(//div[@class='me-auto'])[3]")
    private WebElement ValidationMsgOfPleaseSpecifyField;
    
    @FindBy(xpath="(//div[@class='me-auto'])[4]")
    private WebElement ValidationMsgOfPremiumPayerField;
    
    @FindBy(xpath="(//div[@class='me-auto'])[5]")
    private WebElement ValidationMsgOfPremiumPayerSourceField;
    
    @FindBy(xpath="(//div[@class='me-auto'])[6]")
    private WebElement ValidationMsgOfTIAgreementField;
    
   public void validationMsgOfAdditionalPolicyInfoPage() {
	   String ExpectedValidationMsg = "This field is required.";
	   String ActualPersonallyMetDropdownField = ValidationPersonallyMetDropdownField.getText();
	   Assert.assertEquals(ExpectedValidationMsg, ActualPersonallyMetDropdownField);

	   String ExpecteddropdownValidationMsg = "You must select one.";
	   String ActualValidationMsgOfPurposeOfInsuField = ValidationMsgOfPurposeOfInsuField.getText();
	   Assert.assertEquals(ExpecteddropdownValidationMsg, ActualValidationMsgOfPurposeOfInsuField);
	   
	   String ActualValidationMsgOfPleaseSpecifyField = ValidationMsgOfPleaseSpecifyField.getText();
	   Assert.assertEquals(ExpecteddropdownValidationMsg, ActualValidationMsgOfPleaseSpecifyField);
	   
	   String ActualValidationMsgOfPremiumPayerField = ValidationMsgOfPremiumPayerField.getText();
	   Assert.assertEquals(ActualValidationMsgOfPremiumPayerField, ExpecteddropdownValidationMsg);
	   
	   String ActualValidationMsgOfPremiumSourceField = ValidationMsgOfPremiumPayerSourceField.getText();
	   Assert.assertEquals(ActualValidationMsgOfPremiumSourceField, ExpecteddropdownValidationMsg);
	   
	   String ActualTIAgreementValidationMsg = ValidationMsgOfTIAgreementField.getText();
	   Assert.assertEquals(ExpectedValidationMsg, ActualTIAgreementValidationMsg);
   }
   
   @FindBy(xpath="//div[@class='mud-error-text py-2']")
   private WebElement TotalEqualValidationMsg;
   
   @FindBy(xpath="//div[@class='me-auto']")
   private WebElement FnameValidationMsg;
   
   @FindBy(xpath="(//div[@class='me-auto'])[2]")
   private WebElement LnameValidationMsg;
   
   @FindBy(xpath="(//div[@class='me-auto'])[3]")
   private WebElement PercentageValidationMsg;
   
   @FindBy(xpath="(//div[@class='me-auto'])[4]")
   private WebElement SSNumberValidationMsg;
   
   public void validationMsg() {
	   String ActualValidation = TotalEqualValidationMsg.getText();
	   String ExpectedValidationMsg = "Total must equal 100.";
	   Assert.assertEquals(ActualValidation, ExpectedValidationMsg);
	   
	   String ExpectedTextFieldValidation = "This field is required.";
	   String ActualFnameFieldValidationMsg = FnameValidationMsg.getText();
	   Assert.assertEquals(ExpectedTextFieldValidation,ActualFnameFieldValidationMsg);
	   
	   String ActualLnameFieldValidationMsg = LnameValidationMsg.getText();
	   Assert.assertEquals(ActualLnameFieldValidationMsg,ExpectedTextFieldValidation);
	   
	   String ActualPerValidation = PercentageValidationMsg.getText();
	   Assert.assertEquals(ActualPerValidation, ExpectedTextFieldValidation);
	   
	   String ActualSSNumberValidation = SSNumberValidationMsg.getText();
	   Assert.assertEquals(ActualSSNumberValidation, ExpectedTextFieldValidation);
	   
   }
   
   //negative test cases for Existing Policy Information Page for Pacific Life Journey
   @FindBy(xpath="//div[@class='me-auto']")
   private WebElement RadioBtn1;
   
   @FindBy(xpath="(//div[@class='me-auto'])[2]")
   private WebElement RadioBtn2;
   
   @FindBy(xpath="(//div[@class='me-auto'])[3]")
   private WebElement RadioBtn3;
   
   public void validationMsgEPForPacificLife() {
	   String ExpectedValidationMsgForRadioBtnField = "This field is required.";
	  String ActualValidationForRadioBtn1 = RadioBtn1.getText();
	   Assert.assertEquals(ExpectedValidationMsgForRadioBtnField, ActualValidationForRadioBtn1);
	   
	   String ActualValidationForRadioBtn2 = RadioBtn1.getText();
	   Assert.assertEquals(ExpectedValidationMsgForRadioBtnField, ActualValidationForRadioBtn2);
	   
	   String ActualValidationForRadioBtn3 = RadioBtn1.getText();
	   Assert.assertEquals(ExpectedValidationMsgForRadioBtnField, ActualValidationForRadioBtn3);
   }
   
   
   
   
    
    
    
    
    
}
