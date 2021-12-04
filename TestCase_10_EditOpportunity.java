package BC_TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_10_EditOpportunity  //extends bootCamp_Baseclass 
{

	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		
		//WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        //ChromeDriver driver = new ChromeDriver(options);
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
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"slds-icon-waffle\"]")));
	driver.executeScript("arguments[0].click()", driver.findElement(By.className("slds-r5")));
	Thread.sleep(5000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-97")));
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		//Thread.sleep(5000);
		WebElement opportuinity = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
		driver.executeScript("arguments[0].click();", opportuinity);
		System.out.println("Opportunity clicked successfully");
		WebElement searchinput = driver.findElement(By.xpath("//input[@name='Opportunity-search-input']"));
		searchinput.sendKeys("BC_Govind_Create_Opp");
		searchinput.sendKeys(Keys.ENTER);
		System.out.println("Search input clicked successfully");
		driver.findElement(By.xpath("(//div[@class='forceVirtualActionMarker forceVirtualAction'])[1]")).click();
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		System.out.println("Edit button clicked successfully");
		   driver.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[@class='slds-media__body']//span[text()='Perception Analysis']")));
		   driver.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[@class='slds-media__body']//span[text()='In progress']")));

		 driver.quit();
	
	
	}
}
