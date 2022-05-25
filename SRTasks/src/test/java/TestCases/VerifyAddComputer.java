package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseClass.Base;
import WebElementPages.AddComputerPage;
import WebElementPages.LandingPage;

public class VerifyAddComputer extends Base {
	
	@Test
	public void runVerifyHomePage() throws InterruptedException, IOException {
		AddComputerPage CP = new AddComputerPage (driver);
		CP.getCompButtomTextVerify();
		CP.addCompButtonClick();
		CP.computerPageHeaderTextVerify();
		CP.addCompFormFill();
		CP.companyNameFieldVerify();
		CP.createthisComputerButtonClick();
		CP.doneAlertMessageVerify();		

	}

}
