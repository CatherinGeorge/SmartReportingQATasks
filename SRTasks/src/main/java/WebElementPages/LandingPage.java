package WebElementPages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.Base;


public class LandingPage extends Base {

	public LandingPage (ChromeDriver driver) {
		this.driver = driver;
		
	}
		
	public LandingPage getTitlePage() throws InterruptedException, IOException {
		String titlepage = driver.getTitle();
		if (titlepage.contains("Computers database")) {
			System.out.println("Page title verification is correct : " + "Pass");	
			}
			else {
				System.out.println("Page title verification is not correct : " + "Fail");	
			}
		return this;
	}

	
	public LandingPage getHeaderText() throws InterruptedException, IOException {
		String headertext = driver.findElement(By.xpath("//h1[text()='574 computers found']")).getText();
		if (headertext.contains("computers found")) {
			System.out.println("Home Page header verification is correct : " + "Pass");	
			}
			else {
				System.out.println("Home Page header verification is not correct : " + "Fail");	
			}
		return this;
	}

}
