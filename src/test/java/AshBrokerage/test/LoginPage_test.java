package AshBrokerage.test;
import AshBrokerage.main.CorebridgeSpecificInformation;
import AshBrokerage.main.QuotesPage;
import AshBrokerage.main.OrganizationPage;
import AshBrokerage.main.PreUnderWritingPage3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import AshBrokerage.main.PreUnderWritingPage;
import com.aventstack.extentreports.Status;
import AshBrokerage.main.PreUnderWritingPage2;
import AshBrokerage.main.ProposedInsuredInformationPage;
import AshBrokerage.core.Base;
import AshBrokerage.main.Clientpage;
import AshBrokerage.main.Dashboard_page;
import AshBrokerage.main.ProtectiveImpInformation;
import AshBrokerage.main.LoginPage_main;
import AshBrokerage.main.QuoteResultspage;
import AshBrokerage.main.ExistingPolicyInformationPage;
public class LoginPage_test extends Base {
	
	@Test(groups= {"A"},priority=1)
	public void login() throws InterruptedException {
		test = extent.createTest("Login:Verify the user");
		logger.info("Organization page opened");
		OrganizationPage org = new OrganizationPage(driver);
		org.enteroriganzationName();
		test.log(Status.PASS,"Organization name passed as a acme");
		org.clickonContinuebtn(); 
		test.log(Status.PASS,"Clicked on Continue button");
		LoginPage_main login = new LoginPage_main(driver);
		logger.info("Login page opened");
		login.emailIdPass();   
		test.log(Status.PASS,"Email id send as a user@acme.com");
		login.passSend();
		test.log(Status.PASS,"password send as a Test1234$");
		login.clickOnContinueBtn();
		test.log(Status.PASS,"Clicked on Continue button on login page");
		Thread.sleep(8000);
	}
		@Test(priority=1,groups= {"N"},enabled=false)
		public void invalidCredentialPass() throws InterruptedException {  //Invalid data pass on login page
			test = extent.createTest("Login:Verify the login functionality when user pass Invalid email id and password ");
			logger.info("Organization page opened");
			LoginPage_main login = new LoginPage_main(driver);
			OrganizationPage org = new OrganizationPage(driver);
			org.enteroriganzationName();
			test.log(Status.PASS,"Organization name passed as a acme");
			org.clickonContinuebtn(); 
			test.log(Status.PASS,"Clicked on Continue button");
			login.invalidEmailid();
			test.log(Status.PASS, "Invalid email id send");
			login.invalidPass();
			test.log(Status.PASS, "Invalid password send");
			login.clickOnContinueBtn();
			test.log(Status.PASS,"Clicked on Continue button on login page");
			login.errormsg();
			test.log(Status.PASS, "Got the error message");
		}
		@Test(priority=1,enabled=false)
		public void verifyHeadline() {  //Verify headline on login page
			test = extent.createTest("Login:Verify the text on login functionality");
			logger.info("Organization page opened");
			OrganizationPage org = new OrganizationPage(driver);
			org.enteroriganzationName();
			test.log(Status.PASS,"Organization name passed as a acme");
			org.clickonContinuebtn(); 
			test.log(Status.PASS,"Clicked on Continue button");
			logger.info("Login page opened");
			LoginPage_main login = new LoginPage_main(driver);
			login.verifiedHeadline();     //Verify headline on login page
			
		}
		@Test(priority=2,dependsOnMethods={"verifyloginPage"},enabled=false)
		public void verifyLogoOnLoginPage() {      //Verified logo on login page
			test = extent.createTest("Login page:Verify logo is display or not on Login page");
			logger.info("Login page opened");
			LoginPage_main login = new LoginPage_main(driver);
			login.checkLogoOnLoginPage();
		}
		
		@Test(groups= {"A"},priority=3, dependsOnMethods="verifyDashBoardPage",enabled=false)
		public void verifiedLogo() {
			test = extent.createTest("DashBoard:Verify logo is display or not on dashboard page");
			Dashboard_page dash = new Dashboard_page(driver);
			dash.logoIsDisplay();     //Verified logo is display on dashboard page or not
			test.log(Status.PASS, "ACME logo is displayed on dashboard page");
		}
	
	//	@Test(groups= {"A"},priority=2, dependsOnMethods="login")
		public void verifyDashBoardPage() throws InterruptedException {     //dashboard page
			test = extent.createTest("DashBoard:Verify the following field are present on dashboard page or not");
			Dashboard_page dash = new Dashboard_page(driver);
			dash.pageName();        
			test.log(Status.PASS, "Land on dashboard page");
			dash.Dashboard_btn(); 
		  test.log(Status.PASS, "Dashboard button is displayed on dashBoard page");
			dash.Client_btn();
			test.log(Status.PASS, "Clients button is displayed on dashBoard page");      //clients button display
			test.log(Status.PASS, "Clicked on Clients button dashBoard page");
			dash.Quotes_btn();
			test.log(Status.PASS, "Quotes button is displayed on dashBoard page");
			test.log(Status.PASS, "Clicked on Quotes button on dashBoard page");
			dash.cases_btn();
			test.log(Status.PASS, "Cases button is displayed on dashBoard page");
			test.log(Status.PASS, "Clicked on Cases button on dashBoard page");
			dash.inForcePolicy_btn();
			test.log(Status.PASS, "In-Force Policies button is displayed on dashBoard page");
			test.log(Status.PASS, "Clicked on In-Force Policies button on dashBoard page");
			dash.callSupport_btn();
			test.log(Status.PASS, "Call support button is displayed on dashBoard page");
			dash.emailSupportbtn();
			test.log(Status.PASS, "email support button is displayed on dashBoard page");
			dash.mode_dropdown();
			test.log(Status.PASS, "Verified both Regular and Demo Mode is present");
	
					
	}
	
		
		@Test(priority=4, dependsOnMethods="login",enabled=false)
		public void verifiedUrl() {
			test = extent.createTest("DashBoard:Verify url of a current page");
			Dashboard_page dash = new Dashboard_page(driver);
			String actual_url = driver.getCurrentUrl();
			test.log(Status.PASS, "Get url of current page and compared into expected url");
			String expected_url = "https://dynamic-advisor-qa.techf.com/dashboard";
			System.out.println(actual_url);
			Assert.assertEquals(actual_url, expected_url);	
		}
		
		
		@Test(priority=2, dependsOnMethods="login")
		public void clickOnClientButton() throws InterruptedException {
			test = extent.createTest("DashBoard:Verify url of a current page");
			Dashboard_page dash = new Dashboard_page(driver);
			Thread.sleep(12000);
			dash.mode_dropdown();
			Thread.sleep(3000);
			dash.selectedRegularMode();     //regular mode selected
			dash.clickonClientsbtn();
			test.log(Status.PASS, "Clicked on client button");
			Thread.sleep(8000);
		}
			
			@Test(dependsOnMethods= {"clickOnClientButton"})
			public void journeySelection() throws InterruptedException {
				test = extent.createTest("Client:Creat client");
				Clientpage client = new Clientpage(driver);
				Thread.sleep(5000);
			    client.clickOnAddClientBtn();
			    test.log(Status.PASS, "Clicked on Add Client Button");
			    client.firstName();
			    test.log(Status.PASS, "Passed the first name");
				client.lastName();
				test.log(Status.PASS, "Passed the last name");
				client.DOB();
				test.log(Status.PASS, "Passed the Date of Birth");
				client.genderSelection();
				test.log(Status.PASS, "Selected gender as a Male");
				client.savebtn();
				test.log(Status.PASS, "Clicked on save button");
				Thread.sleep(8000);
				client.applyBtn();
				test.log(Status.PASS, "Selected quotes as a term");
				Thread.sleep(5000);
				QuotesPage quote = new QuotesPage(driver);
				quote.fNisEnabled();
				test.log(Status.PASS, "First name is not ediable on Get Quotes page");
				quote.lNisEnabled();
				test.log(Status.PASS, "Last name is not ediable on Get Quotes page");
				Thread.sleep(5000);
				quote.dob();
				test.log(Status.PASS, "Passed Date of Birth");
				quote.genderSelection();
				test.log(Status.PASS, "Selected the gender");
				quote.tobaccoConsume();
				test.log(Status.PASS, "Clicked on Tobaco or Nicotine button");
				quote.statusOfTobaccoConsumption();
				test.log(Status.PASS, "Selected never in dropdown");
				quote.stateSelection();
				test.log(Status.PASS, "Clicked on Solicitation State dropdown");
				quote.arizonaStateSelection();
				test.log(Status.PASS, "Selected state as a Arizona");
			//	quote.productType();    //selected as term
				test.log(Status.PASS, "Selected product type as a term");
				quote.faceAmount();
				Thread.sleep(5000);
				test.log(Status.PASS, "FaceAmount passed");
				quote.selectedTermLength();
				test.log(Status.PASS, "Selected 20 Years as a Term length");
                quote.riders();
                test.log(Status.PASS, "No Riders selected");
				quote.clickedOnNextBtn();
				test.log(Status.PASS,"Clicked on next button");
				PreUnderWritingPage preunderwriting = new PreUnderWritingPage(driver);
				Thread.sleep(9000);
				preunderwriting.heightSelection();
				Thread.sleep(4000);
				preunderwriting.weightSelection();
				Thread.sleep(4000);
				preunderwriting.yesUSCitizen();
				Thread.sleep(4000);
				preunderwriting.marijuanaConsuming();
				Thread.sleep(4000);
				preunderwriting.selectedHealthCondition();
				Thread.sleep(5000);
				preunderwriting.clickOnNextBtn();	
				PreUnderWritingPage2 puw2 = new PreUnderWritingPage2(driver);
				Thread.sleep(8000);
				puw2.noDUI();
				puw2.noViolations();
				puw2.noLicensesuspended();
				puw2.noCriminalHistory();
				Thread.sleep(5000);
				puw2.clickOnNextBtn();
				PreUnderWritingPage3 puw3 = new PreUnderWritingPage3(driver);
				Thread.sleep(9000);
				puw3.insuredMedication();
				puw3.familyHealthCondition();
				puw3.siblingHealthCondition();
				puw3.clickedOngetQuotebtn();
			   Thread.sleep(15000);                                    
				 }
			
			@Test(dependsOnMethods= {"journeySelection"},enabled=false)
			public void protectiveJourney() throws InterruptedException {
				test = extent.createTest("Create protective journey");
				QuoteResultspage quoteresult = new QuoteResultspage(driver);
				Thread.sleep(9000);
				quoteresult.selecteProtectiveJourney();
				Thread.sleep(9000);
				ProtectiveImpInformation protectiveimpinf = new ProtectiveImpInformation(driver);
				protectiveimpinf.switchWindow();
				Thread.sleep(13000);
				CorebridgeSpecificInformation cbsi = new CorebridgeSpecificInformation(driver);
				cbsi.developerTooldropDown();
				protectiveimpinf.noConditionApply();
				protectiveimpinf.nextBtn();
		//Start App-Proposed Insured Information page
				protectiveimpinf.suffixSelection();
				protectiveimpinf.addressSend();
				protectiveimpinf.address2Send();
				protectiveimpinf.city();
				protectiveimpinf.zipCode();
				protectiveimpinf.stateSelection();
				protectiveimpinf.emailSend();
				protectiveimpinf.phoneNumberSend();
				protectiveimpinf.SocialSecurityNumber();
				protectiveimpinf.maritalStatus();
				protectiveimpinf.issuedInState();
				protectiveimpinf.driverLicenseNum();
				protectiveimpinf.yesOwnerOfPolicy();
				protectiveimpinf.nextBtnPIIpage();
		//Policy Owner Information Page
			    ProposedInsuredInformationPage piip = new ProposedInsuredInformationPage(driver);	
			    Thread.sleep(7000);
				piip.ownerSelection();
				piip.fn();
				piip.ln();
				piip.relaDropProtective();
				piip.genderSelection();
				piip.dateOfBirth();
				piip.SSNumber();
				piip.mobileNumber();
				piip.email();
				piip.address();
				piip.city();
				piip.stateDropDownProtective();
				piip.zipcode();
				piip.nextBtnOnPolicyOwnerInfo();
		//Proposed Insured Information page
				  Thread.sleep(7000);
				piip.birthplaceSelection();
				piip.stateofBirthSelection();
				piip.houseHoldIncome();
				piip.estimatedNetWorth();
				piip.UsCitizen();
				piip.noUSArmyForced();
				piip.nextBtn();
	  //Existing Policy Information Page
				ExistingPolicyInformationPage epi = new ExistingPolicyInformationPage(driver);
				  Thread.sleep(7000);
				epi.noPendingApplication();
				epi.yesAnyLifeInsuredProtective();
				epi.existingPolicyDetailProtective();
				epi.nextBtnOnExistingPolicyInfoPage();
	//			pii.policyInfo();
	//Suitability Page
				Thread.sleep(12000);
				protectiveimpinf.yesMetProposedInsurance();
				protectiveimpinf.purposeOfInsurance();
				protectiveimpinf.specify();
				protectiveimpinf.premiumPayer();
				protectiveimpinf.paymentSource();
				protectiveimpinf.temporyCoverage();
				protectiveimpinf.accountHolderFirstName();
				protectiveimpinf.accountHolderLastName();
				protectiveimpinf.accountHolderAddress();
				protectiveimpinf.accountHolderCity();
				protectiveimpinf.accountHolderStateSelection();
				protectiveimpinf.accountHolderZIP();
				protectiveimpinf.finacialInstiName();
				protectiveimpinf.accountTypeSelection();
				protectiveimpinf.routingNum();
				protectiveimpinf.accountNum();
				protectiveimpinf.nextBtnOnSuitabilitypage();
	//Additional Policy Information Page
				Thread.sleep(9000);
				protectiveimpinf.noInterestPolicy();
				protectiveimpinf.futurePremium();
				protectiveimpinf.ageisGreaterThan65();
				protectiveimpinf.policyElectronicallyDelivered();
				protectiveimpinf.nextBtnOnAPI();
   //Beneficiary Information page
				Thread.sleep(9000);
				epi.relationship();
				epi.information();
				epi.dateOfBirth();
				epi.addPrimaryBeneficiaries();
				epi.selectedRelationship();
				epi.benefiariesDetailProtective();
				epi.dateOfBirthBrother();
				Thread.sleep(8000);
				epi.addContingentBeneficiaries();
				Thread.sleep(3000);
				epi.relationSelection();
				epi.bussinessEntityNameProtective();
				epi.bussinessEntityTINProtective();
				epi.nextBtn();
				Thread.sleep(8000);
				protectiveimpinf.clickOnNextBtn();
				Thread.sleep(8000);
	//Agent Information Page
				epi.yesAgentSplit();
				epi.addAgent();
				epi.agentDetail();
				epi.clickOnSubmitBtn();
				Thread.sleep(13000);
	//status page
				epi.refreshBtn();
			
				
				
			}
			
			@Test(dependsOnMethods= {"journeySelection"},enabled=false)
			public void corebridgeJourney() throws InterruptedException {
				test = extent.createTest("Create corebridge journey");
				QuoteResultspage quoteresult = new QuoteResultspage(driver);
				Thread.sleep(9000);
				quoteresult.applybtnCoreBridgeJourney();
				Thread.sleep(9000);
				CorebridgeSpecificInformation core = new CorebridgeSpecificInformation(driver);
				core.switchWindow();
				Thread.sleep(10000);
				core.developerTooldropDown();
				Thread.sleep(5000);
				core.criteriaMet();
				core.clickOnNextBtn();
				Thread.sleep(5000);
				ProposedInsuredInformationPage piipage = new ProposedInsuredInformationPage(driver);
				piipage.SSN();
				piipage.addressSend();
				piipage.address2Send();
				piipage.citypass();
				piipage.stateSelection();
				piipage.sendZipCode();
				piipage.emailPass();
				piipage.phoneNumberPass();
				piipage.yesValidDriverLic();
				piipage.IssuedState();
				piipage.driverLicenseNumber();
				piipage.noOwnerofThisPolicy();
				piipage.clickOnnextBtn();
			//	core.nextBtnPip();
				Thread.sleep(15000);
			//	core.getStatus();
		//Policy Owner Information Page
				piipage.ownerSelection();
				piipage.fn();
				piipage.ln();
				piipage.relationship();
				piipage.dateOfBirth();
				piipage.SSNumber();
				piipage.mobileNumber();
				piipage.email();
				piipage.address();
				piipage.city();
				piipage.stateSelected();
				piipage.zipcode();
				piipage.haveDriversLicense();
				piipage.DLissued();
				piipage.driverLicenseNum();
				piipage.nextBtnOnPolicyOwnerInfo();
		//Proposed Insured Information Page
				Thread.sleep(12000);
				piipage.birthplaceSelection();
				piipage.stateofBirthSelection();
				piipage.UsCitizen();
				piipage.noUSArmyForced();
				piipage.nextBtn();
				Thread.sleep(8000);
			ExistingPolicyInformationPage epipage = new ExistingPolicyInformationPage(driver);
			epipage.noPendingApplication();
			epipage.noProposedInsuredDeclined();
			epipage.proposedHasAnyLifeInsurance();
			epipage.existingPolicyDetail();
			epipage.nextBtnOnExistingPolicyInfoPage();
		//Finacial Specific Information page
			Thread.sleep(4000);
			epipage.earnedIncome();
			epipage.sendHouseHoldIncome();
			epipage.sendNetWorthIncome();
			epipage.insuredReplace();
			epipage.noAwareAboutOtherInsured();
			epipage.nextBtnOnFinacialInformationPage();
		//Additional Policy Information Page
			Thread.sleep(8000);
			epipage.YesmetProposedInsured();
			epipage.selectedInsuredType();
			epipage.specifyInsuredPurpose();
			epipage.premiumPayerSelection();
			epipage.paymentSourceSelected();
			epipage.noTemporyInsuranceAgreement();
			epipage.nextBtnOnAdditionalPolicyInformationPage();
			Thread.sleep(8000);
		//Beneficiary Information page
			epipage.relationshipSelection();
			epipage.information();
			epipage.addPrimaryBeneficiaries();
			epipage.selectedRelationship();
			epipage.benefiariesDetail();
			Thread.sleep(8000);
			epipage.addContingentBeneficiaries();
			Thread.sleep(3000);
			epipage.relationSelection();
			epipage.contigentDetail();
			epipage.corporateOfficeFN();
			epipage.corporateOfficeLN();
			epipage.corporateOfficerTitle();
			epipage.bussinessEntityTIN();
			epipage.nextBtn();
			Thread.sleep(8000);
		//Agent Information page
			epipage.yesAgentSplit();
			epipage.addAgent();
			epipage.agentDetail();
			epipage.clickOnSubmitBtn();
			Thread.sleep(13000);
		//status page
			epipage.refreshBtn();
			
			}
			
			//
	//		@Test(dependsOnMethods= {"journeySelection"})
			public void symetraJourney() throws InterruptedException {
				test = extent.createTest("Create symetra journey");
				QuoteResultspage quoteresult = new QuoteResultspage(driver);
				Thread.sleep(9000);
				quoteresult.applyBtnSymetraJourney();
				Thread.sleep(9000);
				
			}
			
	//Pacific Life journey
			@Test(dependsOnMethods= {"journeySelection"},enabled=true)
			public void pacificLifeJourney() throws InterruptedException {
				test = extent.createTest("Create pacific life journey");
	//Quote Results Page
				QuoteResultspage quoteresult = new QuoteResultspage(driver);
				Thread.sleep(9000);
				quoteresult.ClickedOnShowmoreProductBtn();
				quoteresult.applyBtnPacificLifeJourney();
				
				
			}
			
			
}
