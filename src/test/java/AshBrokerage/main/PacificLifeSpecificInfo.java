package AshBrokerage.main;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PacificLifeSpecificInfo {
	public WebDriver driver;
	public PacificLifeSpecificInfo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input']")
	private WebElement MethodOfCommunication;
	
	@FindBy(xpath="//p[contains(text(),'Telephone')]")
    private WebElement Telephone;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[2]")
	private WebElement LangSpokenDropdown;
    
    @FindBy(xpath="//p[contains(text(),'English')]")
    private WebElement English;
    
    @FindBy(xpath="//input[@class='mud-radio-input']")
    private WebElement YesHaveComApp;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[2]")
	private WebElement DescriptionCompApp;
    
    @FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement nextBtnPLSInfoPage;
    
    public void methodOfCommunication() {
    	MethodOfCommunication.click();
    	Telephone.click();
    }
    
    public void langSelection() {
    	LangSpokenDropdown.click();
    	English.click();
    }
    
    public void yesHaveCompanionApp() {
    	YesHaveComApp.click();
    	DescriptionCompApp.sendKeys("ewet");
    }
    
    public void nextBtnOnPacificLifeSpecificImfPage() {
    	nextBtnPLSInfoPage.click();
    }
    
    //Pacific Life Specific Information page
    
    @FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-start']")
    private WebElement GrossIncome;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-start'])[2]")
    private WebElement TotalLiabilities;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-start'])[3]")
    private WebElement TotalAsserts;
    
    @FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input']")
    private WebElement StateDeliveryDropdown;
    
    @FindBy(xpath="//p[contains(text(),'Alabama')]")
    private WebElement AlabamaState;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[2]")
    private WebElement PaymentMethod;
    
    @FindBy(xpath="//p[contains(text(),'EFT')]")
    private WebElement EFT;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[3]")
    private WebElement lastTimeTobaccoUsed;
    
    @FindBy(xpath="//p[contains(text(),'Never')]")
    private WebElement duration;
    
    @FindBy(xpath="//input[@class='mud-radio-input']")
    private WebElement eDeliverypolicy;
    
    @FindBy(xpath="//span[contains(text(),'Next')]")
    private WebElement NextBtnPacificLifeSpecificImfPage;
    
    public void grossIncome() {
    	GrossIncome.sendKeys("100000");
    }
    
    public void totalLiability() {
    	TotalLiabilities.sendKeys("20000");
    }
    
    public void totalAsserts() {
    	TotalAsserts.sendKeys("200000");
    }
    
    public void stateDelivery() {
    	StateDeliveryDropdown.click();
    	AlabamaState.click();
    }
    
    public void paymentMethod() {
    	PaymentMethod.click();
    	EFT.click();
    }
    
    public void lastTimeTobaccoUsed() {
    	lastTimeTobaccoUsed.click();
    	duration.click();
    }
    
    public void policyDelivery() {
    	eDeliverypolicy.click();
    }
    
    public void nextBtnPacificLifeSpecificImfPage() {
    	NextBtnPacificLifeSpecificImfPage.click();
    }
    
 //Beneficiary Information Page
    @FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input']")
    private WebElement RelationshipDropdown;
    
    @FindBy(xpath="//p[contains(text(),'Brother')]")
    private WebElement Brother;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[1]")
    private WebElement FN;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[2]")
    private WebElement LN;
    
    @FindBy(xpath="//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end']")
    private WebElement percent;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[3]")
    private WebElement SSNumber;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[4]")
    private WebElement DOB;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[5]")
    private WebElement PhoneNumber;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[6]")
    private WebElement Address;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[7]")
    private WebElement City;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[2]")
    private WebElement SateteDropdown;
    
    @FindBy(xpath="//p[contains(text(),'Alabama')]")
    private WebElement AlabamaS;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[8]")
    private WebElement Zip;
    
    //add p
    @FindBy(xpath="//button[@class='mud-button-root mud-icon-button mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
    private WebElement AddPrimaryBenefiary;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[3]")
    private WebElement RelationshipDropdownAddPB;
    
    @FindBy(xpath="//p[contains(text(),'Business Associate')]")
    private WebElement BussinessAsso;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[9]")
    private WebElement FirstNaddPrimaryB;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[10]")
    private WebElement LastNaddPrimaryB;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end'])[2]")
    private WebElement PercaddPrimaryB;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[11]")
    private WebElement SSNPrimaryB;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[12]")
    private WebElement DOBaddPrimaryB;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[13]")
    private WebElement PhoneNaddPrimaryB;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[14]")
    private WebElement AddressaddPrimaryB;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[15]")
    private WebElement CityaddPrimaryB;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[4]")
    private WebElement stateDrop;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[16]")
    private WebElement ZipaddPrimaryB;
    
    public void relationSelection() {
    	RelationshipDropdown.click();
    	Brother.click();
    }
    
    public void beneficiariesDetail() {
    	FN.sendKeys("trew");
    	LN.sendKeys("asdf");
    	percent.sendKeys("50");
    	SSNumber.sendKeys("876567890");
    	DOB.sendKeys("09091980");
    	PhoneNumber.sendKeys("9099012345");
    	Address.sendKeys("asdfg");
    	City.sendKeys("lkjj");
    	SateteDropdown.click();
    	AlabamaS.click();
    	Zip.sendKeys("42420");
    }
    
    public void addPrimaryBeneficiaries() {
    	AddPrimaryBenefiary.click();
    	RelationshipDropdownAddPB.click();
    	BussinessAsso.click();
    	FirstNaddPrimaryB.sendKeys("qwer");
    	LastNaddPrimaryB.sendKeys("asdf");
    	PercaddPrimaryB.sendKeys("50");
    	SSNPrimaryB.sendKeys("768789123");
    	DOBaddPrimaryB.sendKeys("09091980");
    	PhoneNaddPrimaryB.sendKeys("9090786767");
    	AddressaddPrimaryB.sendKeys("jamgh");
    	CityaddPrimaryB.sendKeys("ghjk");
    	stateDrop.click();
    	AlabamaS.click();
    	ZipaddPrimaryB.sendKeys("23456");
    }
    
    //contingent Beneficiaries
    @FindBy(xpath="(//button[@class='mud-button-root mud-icon-button mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple'])[2]")
    private WebElement AddContingentBenefiary;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[5]")
    private WebElement RelationDropdown;
    
    @FindBy(xpath="//p[contains(text(),'Family Member')]")
    private WebElement FamilyMem;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[17]")
    private WebElement FNContingentBene;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[18]")
    private WebElement LNContingentBene;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end'])[3]")
    private WebElement percentContingentBene;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[19]")
    private WebElement SSNContingentBene;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[20]")
    private WebElement DOBContingentBene;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[21]")
    private WebElement PhoneNumContingentBene;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[22]")
    private WebElement AddressContingentBene;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[23]")
    private WebElement CityContingentBene;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text mud-input-root-adorned-end mud-select-input'])[6]")
    private WebElement stateDropDown;
    
    @FindBy(xpath="(//input[@class='mud-input-slot mud-input-root mud-input-root-text'])[24]")
    private WebElement ZipsContingentBene;
    
    @FindBy(xpath="//button[@class='mud-button-root mud-button mud-button-filled mud-button-filled-primary mud-button-filled-size-medium mud-ripple']")
    private WebElement NextBtn;
    
    public void ContingentDetail() {
    	AddContingentBenefiary.click();
    	RelationDropdown.click();
    	FamilyMem.click();
    	FNContingentBene.sendKeys("ytuuytr");
    	LNContingentBene.sendKeys("mnbc");
    	percentContingentBene.sendKeys("100");
    	SSNContingentBene.sendKeys("890890890");
    	DOBContingentBene.sendKeys("12021989");
    	PhoneNumContingentBene.sendKeys("6345671212");
    	AddressContingentBene.sendKeys("rtreyr");
    	CityContingentBene.sendKeys("trtrt");
    	stateDropDown.click();
    	AlabamaS.click();
    	ZipsContingentBene.sendKeys("67890");
    }
    
    public void nextBtn() {
    	NextBtn.click();
    }
    
}
