package AshBrokerage.main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
    
    
   // @FindBy(xpath="(//span[@class='mud-typography mud-typography-button'])[2]")
  //  private WebElement nextBtnOnBIP;
    
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
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[16]")
    private WebElement AgentSSN;
    
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
    
    public void agentDetail() {
    	AgentFirstName.sendKeys("fir");
    	AgentLastName.sendKeys("last");
    	AgentSSN.sendKeys("987641234");
    	AgentPer.sendKeys("90");
    }
    
    public void clickOnSubmitBtn() {
    	submitBtn.click();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
}
