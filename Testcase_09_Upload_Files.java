package BC_TestCase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_09_Upload_Files {

	
	public void uploadfiles() throws InterruptedException, AWTException {
		
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
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(5000);
		
		//Click on Campaigns tab
		driver.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[text()='Campaigns']")));
		Thread.sleep(5000);
		
		//Click Bootcamp link
		driver.findElement(By.xpath("//a[@title='Bootcamp']")).click();
		Thread.sleep(5000);
		
		//Click on Upload button
		driver.findElement(By.xpath("//div[@title='Upload Files']")).click();
		Thread.sleep(10000);
		
		StringSelection ss = new StringSelection("H:\\TestLeaf_BootCamp\\Testleaf_Bootcamp.txt"); 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
			
		Robot robot = new Robot(); 
		
		// Enter to confirm it is uploaded 
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);	
		robot.keyPress(KeyEvent.VK_V); 

		robot.keyRelease(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(2000);
		Thread.sleep(5000);
		
		//robot.keyPress(KeyEvent.VK_ENTER); 
		robot.keyRelease(KeyEvent.VK_ENTER); 
		
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		Thread.sleep(5000);
		
		String verifyLink = driver.findElement(By.xpath("(//span[text()='Questions'])[2]")).getText();
		System.out.println(verifyLink);
		driver.quit();
	}
}
