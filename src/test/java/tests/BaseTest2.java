package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.LoginPage;
import utils.Utl;

public class BaseTest2 {
	
	WebDriver driver;
	@BeforeClass
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Utl.readProperty("url"));
        //driver.get("https://www.saucedemo.com/");
    	LoginPage lP=new LoginPage(driver);
		lP.login("standard_user", "secret_sauce");
        //Thread.sleep(2000);

	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
  