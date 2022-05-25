package WebElementPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.Base;

public class EditComputerPage extends Base {

	public EditComputerPage(ChromeDriver driver) {
		this.driver = driver;

	}
	
	public EditComputerPage editElementSelect() {
		WebElement ComputerNameSearchList = driver.findElement(By.xpath("//a[@href='/computers/517']"));
		ComputerNameSearchList.click();
		System.out.println("ComputerName for Edit from SearchList is selected: " + "Pass");
		return this;
	}

	
	public void editComputerNameVerify() {
		WebElement EditTextComputerName = driver
				.findElement(By.xpath("(//label[text()='Computer name']/following::input)[1]"));
		EditTextComputerName.clear();
		EditTextComputerName.sendKeys("MacBook NewVersion 2022");
		String EditComputerNametypeValue = EditTextComputerName.getAttribute("value");
		if (EditComputerNametypeValue.contains("MacBook NewVersion 2022")) {
			System.out.println("Edit Computer Name Text attribute value is matched : Pass");
		} else {
			System.out.println("Edit Computer Name attribute value is not matched : Fail");
		}
	}

	public void saveButtonClick() {
		WebElement SavethisComputerButton = driver.findElement(By.xpath("//input[@value='Save this computer']"));
		SavethisComputerButton.click();
		System.out.println("Save this computer Button selection: Pass");
	}

	public void updatedAlertMessageVerify()

	{
		String UpdatedAlertMessage = driver.findElement(By.xpath("//div[@class='alert-message warning']")).getText();
		if (UpdatedAlertMessage.contains("MacBook NewVersion 2022 has been updated")) {
			System.out.println("Updated Computer Name Alert Text matched : Pass");
		} else {
			System.out.println("Updated Computer Name Alert is not matched : Fail");
		}
	}

}
