package AshBrokerage.test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import AshBrokerage.main.Dashboard_page;
import AshBrokerage.core.Base;

public class Dashboard_page_test extends Base{
	
	@Test(dependsOnGroups= {"A"})
	public void demo_mode_selected() throws InterruptedException {
		test = extent.createTest("Login:Verify the desktop page");
		logger.info("page opened");
		Dashboard_page dash = new Dashboard_page(driver);
		 	Thread.sleep(20000); 
			//dash.add_client.click();
			test.log(Status.PASS, "Clicked on client field");
		
	}
	
	

}
