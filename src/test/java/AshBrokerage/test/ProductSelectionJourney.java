package AshBrokerage.test;

import org.testng.annotations.Test;
import AshBrokerage.main.Clientpage;
import AshBrokerage.core.Base;

public class ProductSelectionJourney extends Base {
	
	@Test(dependsOnGroups= {"A"})
	public void productselection() {
		test = extent.createTest("Client:Creat client");
		Clientpage client = new Clientpage(driver);
		client.firstName();
		client.lastName();
		client.DOB();
		client.genderSelection();
		client.savebtn();
	}

}
