package BC_TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_06_EditIndividual extends bootCamp_Baseclass {

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
		
		driver.findElement(By.className("slds-r5")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);

		
		driver.executeScript("arguments[0].click()", driver.findElement(By.xpath("//p[text()='Individuals']")));
		Thread.sleep(5000);
		
		driver.executeScript("arguments[0].click()", driver.findElement(By.xpath("//span[text()='Individuals']")));
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys("Govind_Indv"+Keys.ENTER);
		Thread.sleep(4000);

		driver.findElement(By.xpath("//span[@class='slds-icon_container slds-icon-utility-down']//span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@class='firstName compoundBorderBottom form-element__row input']")).clear();
		driver.findElement(By.xpath("//input[@class='firstName compoundBorderBottom form-element__row input']")).sendKeys("TestLeafBC");

		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		Thread.sleep(4000);
		
		String fName = driver.findElement(By.xpath("(//a[contains(@class,'slds-truncate outputLookupLink')])[1]")).getText();
		System.out.println(fName);
		
		driver.close();
	}
}
