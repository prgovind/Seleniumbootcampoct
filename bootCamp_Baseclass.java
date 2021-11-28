package BC_TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bootCamp_Baseclass {

	public  ChromeDriver driver;
	
	@BeforeMethod
	public void  baseSetup() {
	System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("makaia@testleaf.com");
		WebElement txtpPwd = driver.findElement(By.id("password"));
		txtpPwd.sendKeys("SelBootcamp$1234");
		driver.findElement(By.id("Login")).click();
		
	}
	@AfterMethod
	public  void close() {
		driver.quit();
	}
	
}


