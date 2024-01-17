package AshBrokerage.main;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
public class QuotesPage {
	public WebDriver driver;
	
	public QuotesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement FirstNameQuote;
	
	@FindBy(xpath="//input[@name='lastName']")
    private WebElement LastNameQuote;
	
	@FindBy(xpath="//input[@class=\"input input-bordered w-full leading-6 input-sm border-0 text-answer border-b-2 focus:outline-none pl-0 focus:border-primary\"]")
	private WebElement DOB;
	
	@FindBy(xpath="//input[@aria-autocomplete='list']")
	private WebElement gender;

	@FindBy(xpath="(//div[text()=\"Male\"])[2]")
	private WebElement male_gender;
	
	@FindBy(xpath="(//input[@class=\"svelte-17l1npl\"])[3]")
	private WebElement tobaccoBtn;  
	
	@FindBy(xpath="//div[@class=\"listItem\"]//div[text()=\"Never\"]")
    private WebElement decisionOnTobaccoConsumption;
	
	@FindBy(xpath="(//div[@class=\"col-span-12\"])[2]")
	private WebElement Solicitation_state;
	
	@FindBy(xpath="//div[contains(text(),'Arizona')]")
	private WebElement stateSelection;
	
	@FindBy(xpath="//button[@class=\"absolute tooltip tooltip-primary tooltip-left pl-1 lg:tooltip-bottom\"]")
	private WebElement mousehouseOnTobaccobtn;
	
	@FindBy(xpath="(//input[@class=\"svelte-17l1npl\"])[7]")
	private WebElement productType;
	
	@FindBy(xpath="//div/div[contains(text(),'Term')]")
	private WebElement TermProductType;
	
	@FindBy(xpath="//input[@placeholder='Face Amount']")
	private WebElement faceAmount;
	
	@FindBy(xpath="(//input[@class=\"svelte-17l1npl\"])[11]")
	private WebElement termLength;
	
	@FindBy(xpath="//div[text()='20-Year Term']")
	private WebElement years_term;
	
	@FindBy(xpath="(//input[@class=\"svelte-17l1npl\"])[13]")
	private WebElement Riders;
	
	@FindBy(xpath="//div[@class=\"listItem\"]//div[text()='No Riders']")
	private WebElement noRiders;
	
	@FindBy(xpath="//div[@class=\"card-actions my-4 ml-1 mt-5\"]//button[@class=\"rounded-md shadow-lg btn uppercase btn-sm btn-next btn-primary\"]")
	private WebElement nextbtn;
	
	public void fNisEnabled() {
		if(FirstNameQuote.isEnabled()) {    //testbox is not display
			System.out.println("First name is enabled");   
		}
		else {
			System.out.println("First name is not enabled");    //disabled
		}
		   
	}
	public void lNisEnabled() {
		if(LastNameQuote.isEnabled()){
			System.out.println("Last name is enabled");
		}
		else {
			System.out.println("Last name is not enabled");    //disabled
		}
	}
	
	public void dob() {
		DOB.sendKeys("09091985");   //09091990
	}
	
	public void genderSelection() {
		gender.click();
		male_gender.click(); 
	}
	
	public void tobaccoConsume() {
		tobaccoBtn.click();
	}
	
	public void statusOfTobaccoConsumption() {
		decisionOnTobaccoConsumption.click();
	}
	
   public void mouseHoverOnTobacco() throws InterruptedException {
	   Actions action = new Actions(driver);
	   action.moveToElement( mousehouseOnTobaccobtn).perform();
	   Thread.sleep(4000);
	   String text = mousehouseOnTobaccobtn.getText();
	   System.out.println(text);
   }
   
   @FindBy(xpath="//div[@class=\"listContainer svelte-1uyqfml\"]")
   public List<WebElement> all_state;
   
   public void listState() {
	   String state = "California";
	   for(int i=0;i<all_state.size();i++) {
		   System.out.println(all_state);
		   if(all_state.get(i).getText().contains(state)) {
			   all_state.get(i).click();
			   System.out.println(all_state.get(i).getText());
		   }
		
	   }
   }
	//mjjasond8 jf 
	public void stateSelection() {
		Solicitation_state.click();
	}
	
	public void californiaSelected() {
		stateSelection.click();
	}
	
	public void arizonaStateSelection() {
		stateSelection.click();
	}
	public void productType() {
		productType.click();
		TermProductType.click();
	}
	
	public void faceAmount() {
		faceAmount.sendKeys("5000000");    
	}
	
	public void selectedTermLength() {
		termLength.click();
		years_term.click();
	}
	
	public void riders() {
		Riders.click();
		noRiders.click();
		//p 
	}
	
	public void clickedOnNextBtn() throws InterruptedException {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", nextbtn);
		nextbtn.click();
	}
	
}
   
