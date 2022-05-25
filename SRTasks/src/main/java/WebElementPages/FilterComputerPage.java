package WebElementPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import BaseClass.Base;

public class FilterComputerPage extends Base {

	public FilterComputerPage(ChromeDriver driver) {
		this.driver = driver;

	}

	public void filterpageHeaderTextVerify() {
		String filterPageHeadertext = driver.findElement(By.xpath("//h1[text()='574 computers found']")).getText();
		if (filterPageHeadertext.contains("computers found")) {
			System.out.println("Filter page header text is displayed correctly: " + "Pass");
		} else {
			System.out.println("Filter page header text is not displayed correctly: " + "Fail");
		}

	}

	
	public void searchTextBoxVerify() {
		WebElement searchTextBox = driver.findElement(By.xpath("//input[@placeholder='Filter by computer name...']"));
		searchTextBox.sendKeys("MacBook");

		String typeValue = searchTextBox.getAttribute("value");
		if (typeValue.equals("MacBook")) {
			System.out.println("Search Text attribute value is matched : Pass");
		} else {
			System.out.println("Search Text attribute value is not matched : Fail");
		}
	}
	

	public void filterButtonVerify() {
		boolean displayed = driver.findElement(By.xpath("//input[@value='Filter by name']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	
	public EditComputerPage filterButtonClick()

	{
		WebElement FilterNameButton = driver.findElement(By.xpath("//input[@value='Filter by name']"));
		FilterNameButton.click();
		System.out.println("Filter by Name button is selected: " + "Pass");
        return new EditComputerPage (driver);
	}
	

}
