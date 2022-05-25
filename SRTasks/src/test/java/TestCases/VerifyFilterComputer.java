package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseClass.Base;
import WebElementPages.FilterComputerPage;
import WebElementPages.LandingPage;

public class VerifyFilterComputer extends Base {
	
	@Test
	public void VerifyFilterComputer() throws InterruptedException, IOException {
		FilterComputerPage FP = new FilterComputerPage (driver);
		FP.filterpageHeaderTextVerify();
		
	}

}
