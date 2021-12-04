package BC_TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_05_CreateIndividual extends bootCamp_Baseclass {

	@Test
	public void CreateIndividual() throws InterruptedException {
		
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
		Thread.sleep(5000);
		
		driver.executeScript("arguments[0].click()", driver.findElement(By.className("slds-r5")));
		Thread.sleep(5000);
		//driver.executeScript("arguments[0].click()", driver.findElement(By.className("slds-r5")));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);
		driver.executeScript("arguments[0].click()", driver.findElement(By.xpath("//p[text()='Individuals']")));
		Thread.sleep(5000);
			//driver.executeScript("arguments[0].click()",driver.findElement(By.xpath("//span[text()='Work Type Groups Menu']")));
		driver.executeScript("arguments[0].click()",driver.findElement(By.xpath("//span[contains(text(),'Individuals Menu')]")));
		Thread.sleep(5000);
			driver.executeScript("arguments[0].click()",driver.findElement(By.xpath("//span[text()='New Individual']")));
		Thread.sleep(3000);
		driver.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[text()='--None--']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Mr.']")).click();
				driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Govind_Indv");

		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
