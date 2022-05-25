package BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static ChromeDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://computer-database.gatling.io/computers");
		System.out.println("Logged/landed into applications home page is : succesfull");
		//driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		//driver.findElement(By.className("decorativeSubmit")).click();
		
				
		String titlepage = driver.getTitle();
		if (titlepage.contains("Computers database")) {
			System.out.println("Page title validation is : " + "Pass");	
			}
			else {
				System.out.println("Page title validation is : " + "Fail");	
			}
		
		
		String headertext = driver.findElement(By.xpath("//h1[text()='574 computers found']")).getText();
		if (headertext.contains("computers found")) {
			System.out.println("Home Page header validation is : " + "Pass");	
			}
			else {
				System.out.println("Home Page header validation is : " + "Fail");	
			}
		Thread.sleep(5000);
			//Add a comp button selection and text verification	
		String addANewTextVerify = driver.findElement(By.linkText("Add a new computer")).getText();
		if (addANewTextVerify.contains("Add a new computer")) {
			System.out.println("Add button text validation is : " + "Pass");	
			}
			else {
				System.out.println("Add button text validation is : " + "Fail");	
			}
		
		driver.findElement(By.linkText("Add a new computer")).click();	
		System.out.println("Add computed button selection : " + "Pass");	
		
		String addAComputerPageHeadertext = driver.findElement(By.xpath("//h1[text()='Add a computer']")).getText();
		if (addAComputerPageHeadertext.contains("Add a computer")) {
			System.out.println("Add Computer Page header text validation is : " + "Pass");	
			}
			else {
				System.out.println("Add Computer header text validation is : " + "Fail");	
			}
		
		Thread.sleep(5000);
		//add Comp Form fill 
		
		//driver.findElement(By.xpath("//label[text()='Computer name']/following::input")).sendKeys("MacBook Air Retina 13-inch 2020");
		//driver.findElement(By.xpath("//label[text()='Introduced']/following::input")).sendKeys("2020-03-18");
		//driver.findElement(By.xpath("//label[text()='Discontinued']/following::input")).sendKeys("2020-11-10");
		driver.findElement(By.xpath("//label[text()='Computer name']/following::input")).sendKeys("Macintosh 512K");
		driver.findElement(By.xpath("//label[text()='Introduced']/following::input")).sendKeys("1984-09-10");
		driver.findElement(By.xpath("//label[text()='Discontinued']/following::input")).sendKeys("1986-04-14");
		System.out.println("Add computer form fill discontinued field selection: " + "pass");	
		WebElement company = driver.findElement(By.id("company")); 
		Select dropdownn1 = new Select (company);
		dropdownn1.selectByIndex(1);
		System.out.println("Add computer form fill company field selection : " + "pass");	
		String Text = company.getText();
		if (Text.contains("Apple")) {
			System.out.println("Company Selection as Apple is : Pass");
		} else {
			System.out.println("Company Selection as Apple is : Fail");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Create this computer']")).click();
		System.out.println("Create computer button selection: " + "pass");	
		
		//Done - alert message verification
		
		String DoneAlertText = driver.findElement(By.xpath("//div[@class='alert-message warning']")).getText();
		if (DoneAlertText.contains("Macintosh 512K")) {
			System.out.println("Done Alert Text matched : Pass");
		} else {
			System.out.println("Done Alert Text not matched : Fail");
		}
		
		//Filter by name verification
		
		Thread.sleep(5000);
		
		WebElement searchTextBox= driver.findElement(By.xpath("//input[@placeholder='Filter by computer name...']"));
		searchTextBox.sendKeys("MacBook");
		
		String typeValue=searchTextBox.getAttribute("value");
		if (typeValue.equals("MacBook")) {
			System.out.println("Search Text attribute value is matched : Pass");
		} else {
			System.out.println("Search Text attribute value is not matched : Fail");
		}
		
			
		//String filterByComputer = driver.findElement(By.xpath("//input[@placeholder='Filter by computer name...']")).getAttribute("attribute_value");
		//System.out.println("Computer name is : " + filterByComputer);
		
		
		WebElement FilterNameButton = driver.findElement(By.xpath("//input[@value='Filter by name']"));
		FilterNameButton.click();
		System.out.println("Filter by Name button is selected: " + "Pass" );
		
		
		// Edit Computer verification
		
		
		//selected table  -	//table[contains(@class,'computers zebra-striped')]
		
		//selected element - //table[contains(@class,'computers zebra-striped')]/tbody[1]/tr[1]/td[1]
		//(//a[contains(text(),'Macintosh 512K')])[1]
		
			
		WebElement ComputerNameSearchList = driver.findElement(By.xpath("//a[@href='/computers/517']"));
		ComputerNameSearchList.click();
		System.out.println("ComputerNameSearchList is selected: " + "Pass" );
		/*boolean EditElement = ComputerNameSearchList.isSelected();
		if (EditElement==true) {
			System.out.println("Edit Element is Selected: " + "Pass" );
		}
		else 
			{System.out.println("Edit Element is not Selected: " + "Fail" );
			}
		*/
		Thread.sleep(5000);
		WebElement EditTextComputerName= driver.findElement(By.xpath("(//label[text()='Computer name']/following::input)[1]"));
		EditTextComputerName.clear();
		EditTextComputerName.sendKeys("MacBook NewVersion 2022");
		String EditComputerNametypeValue=EditTextComputerName.getAttribute("value");
		if (EditComputerNametypeValue.contains("MacBook NewVersion 2022")) {
			System.out.println("Edit Computer Name Text attribute value is matched : Pass");
		} else {
			System.out.println("Edit Computer Name attribute value is not matched : Fail");
		}
		
		WebElement SavethisComputerButton = driver.findElement(By.xpath("//input[@value='Save this computer']"));
		SavethisComputerButton.click();
		System.out.println("Save this computer Button selection: Pass");
		
		//Verify updated alert message
		
		String UpdatedAlertMessage = driver.findElement(By.xpath("//div[@class='alert-message warning']")).getText();
		if (UpdatedAlertMessage.contains("MacBook NewVersion 2022 has been updated")) {
			System.out.println("Updated Computer Name Alert Text matched : Pass");
		} else {
			System.out.println("Updated Computer Name Alert is not matched : Fail");
		}
		
		driver.close();

	}

}
