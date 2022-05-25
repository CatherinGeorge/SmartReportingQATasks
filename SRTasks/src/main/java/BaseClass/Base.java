package BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public ChromeDriver driver;
	
	@BeforeMethod
	public void preCondition() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://computer-database.gatling.io/computers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

	}
	@AfterMethod
	public void postCondition() {
		driver.close();
}

}
