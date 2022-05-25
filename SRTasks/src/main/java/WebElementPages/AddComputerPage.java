package WebElementPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import BaseClass.Base;

public class AddComputerPage extends Base {

	public AddComputerPage(ChromeDriver driver) {
		this.driver = driver;

	}

	public AddComputerPage getCompButtomTextVerify() throws InterruptedException, IOException {
		String addANewTextVerify = driver.findElement(By.linkText("Add a new computer")).getText();
		if (addANewTextVerify.contains("Add a new computer")) {
			System.out.println("Add button text validation is : " + "Pass");
		} else {
			System.out.println("Add button text validation is : " + "Fail");
		}
		return this;
	}

	public void addCompButtonClick() {
		driver.findElement(By.linkText("Add a new computer")).click();
	}

	public void computerPageHeaderTextVerify() {
		String addAComputerPageHeadertext = driver.findElement(By.xpath("//h1[text()='Add a computer']")).getText();
		if (addAComputerPageHeadertext.contains("Add a computer")) {
			System.out.println("Add Computer Page header text validation is : " + "Pass");
		} else {
			System.out.println("Add Computer header text validation is : " + "Fail");
		}
	}

	public void addCompFormFill() {
		driver.findElement(By.xpath("//label[text()='Computer name']/following::input")).sendKeys("Macintosh 512K");
		driver.findElement(By.xpath("//label[text()='Introduced']/following::input")).sendKeys("1984-09-10");
		driver.findElement(By.xpath("//label[text()='Discontinued']/following::input")).sendKeys("1986-04-14");
		WebElement company = driver.findElement(By.id("company"));
		Select dropdownn1 = new Select(company);
		dropdownn1.selectByIndex(1);
	}

	public void companyNameFieldVerify() {
		WebElement company = driver.findElement(By.id("company"));
		String Text = company.getText();
		if (Text.contains("Apple")) {
			System.out.println("Company Selection as Apple is selected correctly: Pass");
		} else {
			System.out.println("Company Selection as Apple is selected wrongly: Fail");
		}
	}

	public void createthisComputerButtonClick() {
		driver.findElement(By.xpath("//input[@value='Create this computer']")).click();
	}

	public void doneAlertMessageVerify() {
		String DoneAlertText = driver.findElement(By.xpath("//div[@class='alert-message warning']")).getText();
		if (DoneAlertText.contains("Macintosh 512K")) {
			System.out.println("Done Alert Text matched : Pass");
		} else {
			System.out.println("Done Alert Text not matched : Fail");
		}
	}

}
