package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseClass.Base;
import WebElementPages.EditComputerPage;
import WebElementPages.FilterComputerPage;
import WebElementPages.LandingPage;

public class VerifyEditComputer extends Base {
	
	@Test
	public void runVerifyHomePage() throws InterruptedException, IOException {
		FilterComputerPage FP = new FilterComputerPage (driver);
		EditComputerPage EP = new EditComputerPage (driver);
		FP.searchTextBoxVerify();
		FP.filterButtonVerify();
		FP.filterButtonClick();
		EP.editElementSelect();
		EP.editComputerNameVerify();
		EP.saveButtonClick();
		EP.updatedAlertMessageVerify();
 
	}

}
