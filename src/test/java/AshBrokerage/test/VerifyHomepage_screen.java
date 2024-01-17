package AshBrokerage.test;

import org.testng.annotations.Test;

import AshBrokerage.core.Base;
import AshBrokerage.main.Dashboard_page;
public class VerifyHomepage_screen extends Base {
	@Test(dependsOnGroups= {"A"})
	public void verifyDashBoardPage() {
		test = extent.createTest("DashBoard:Verify the following field are present on dashboard page or not");
		Dashboard_page dash = new Dashboard_page(driver);
		dash.Dashboard_btn();
		//dash.clickonClient_btn();
		
	}
	
	
	
	
	

}
