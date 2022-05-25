package TestCases;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import BaseClass.Base;
import WebElementPages.LandingPage;

public class VerifyLandingPage extends Base {
	
	@Test
	public void runVerifyHomePage() throws InterruptedException, IOException {
		LandingPage LP = new LandingPage (driver);
		LP.getTitlePage();
		LP.getHeaderText();

	}
	
	

}
