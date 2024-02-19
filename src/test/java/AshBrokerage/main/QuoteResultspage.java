package AshBrokerage.main;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuoteResultspage {
	public WebDriver driver;
	public QuoteResultspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='btn btn-primary rounded-md uppercase btn-sm lg:btn-sm']")
	private WebElement showMoreProduct_btn;
	
//	@FindBy(xpath="(//button[text()=\"Apply\"])[2]")
	@FindBy(xpath="(//button[contains(text(),'Apply')])[2]")
	private WebElement protective_journey;
	
	@FindBy(xpath="//p[text()='Protective']")
	private WebElement actText;
	
	@FindBy(xpath="//*[@id=\"page-content\"]/div/div[2]/div/div[1]/div/div/div[2]/div/div[1]/div/label")
	private WebElement editBtn;
	
	@FindBy(xpath="(//div[@class=\"indicator svelte-17l1npl\"])[1]")
	private WebElement healthClassDropdown;
	
	@FindBy(xpath="//div[@class='listItem']/div[@class='item active hover svelte-3e0qet']")
	private WebElement standardNonTobacco;
	
	@FindBy(xpath="//button[@class=\"rounded-md btn btn-primary uppercase btn-sm ml-7 mb-4\"]")
	private WebElement applyBtn;  //protective journey
	
	@FindBy(xpath="//input[@class=\"input w-full input-sm pl-3 leading-6 text-answer outline outline-1 outline-primary pl-5 focus:outline-none focus:border-primary\"]")
	private WebElement fa;
	
	@FindBy(xpath="(//div/button[@class='btn w-[5rem] btn-primary rounded-md uppercase btn-sm lg:btn-sm'])[2]")
	private WebElement applybtn;  //for corebridge journey
	
	@FindBy(xpath="(//button[@class='btn w-[5rem] btn-primary rounded-md uppercase btn-sm lg:btn-sm'])[3]")
	private WebElement applyButton;  //symetra journey
	
	@FindBy(xpath="(//button[contains(text(),'Apply')])[4]")
	private WebElement PacificLifeApplyBtn;
	
	@FindBy(xpath="(//div/div[@class='mr-3 pt-2'])[4]")
	private WebElement pecificLifeText;
	
	public void ClickedOnShowmoreProductBtn() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", showMoreProduct_btn);
		showMoreProduct_btn.click();
	}
	
	@FindBy(xpath="//p[contains(text(),'Principal')]")
	private WebElement principal;
	
	@FindBy(xpath="(//button[@class='btn w-[5rem] btn-primary rounded-md uppercase btn-sm lg:btn-sm'])[2]")
	//@FindBy(xpath="//p[contains(text(),'Protective')]")
	private WebElement applybtnProtective;
	
	
	public void selecteProtectiveJourney() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", principal);
		Thread.sleep(8000);
		applybtnProtective.click();
		
	}
	
	public void textcom() throws InterruptedException {
		String title = actText.getText();
		System.out.println(title);
		if(title.equalsIgnoreCase("Protective")) {
			Thread.sleep(5000);
			protective_journey.click();
		}
		else {
			System.out.println("wrong xpath");
		}
	}
	
	public void clickOnEditBtn() {
		editBtn.click();
	}
	
	public void healthClassDropdown() {
		healthClassDropdown.click();
	}
	
	public void healthClassSelected() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", standardNonTobacco);
	//	driver.switchTo().frame(1);
		standardNonTobacco.click();
	}
	
	public void clickOnApplyBtn() {
		applyBtn.click();
	}

	//@FindBy(xpath="(//button[@class='btn w-[5rem] btn-primary rounded-md uppercase btn-sm lg:btn-sm'])[4]")
	@FindBy(xpath="(//button[contains(text(),'Apply')])[3]")
	private WebElement corebridgeFinacial;
	
	@FindBy(xpath="//p[contains(text(),'Protective')]")
	private WebElement Protective;
	
	public void applybtnCoreBridgeJourney() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Protective);
		Thread.sleep(10000);
		corebridgeFinacial.click();
		
	}
	
	@FindBy(xpath="//input[@class='input w-full input-sm pl-3 leading-6 text-answer outline outline-1 outline-primary pl-5 focus:outline-none focus:border-primary']")
	private WebElement faceamount;
	
	@FindBy(xpath="//p[contains(text(),'Ameritas')]")
	private WebElement ameritasscroll;
	
	public void applyBtnSymetraJourney() throws InterruptedException {
		faceamount.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ameritasscroll);
		applyButton.click();
	}
	
	public void applyBtnPacificLifeJourney() {
     //  String text =pecificLifeText.getText();
     //   System.out.println(text);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Protective);
		showMoreProduct_btn.click();
		
		PacificLifeApplyBtn.click();
	}
	
	@FindBy(xpath="//button[@class='btn w-[5rem] btn-primary rounded-md uppercase btn-sm lg:btn-sm']")
    private WebElement LGAFlashTerm;

public void applyBtnLGAFlashTerm() throws InterruptedException {
	faceamount.sendKeys(Keys.BACK_SPACE);
	Thread.sleep(10000);
	LGAFlashTerm.click();
}

}



