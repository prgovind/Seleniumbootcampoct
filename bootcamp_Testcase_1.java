package BC_TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bootcamp_Testcase_1 extends bootCamp_Baseclass{

	public  void  createopp() throws InterruptedException {
		driver.findElement(By.className("slds-icon-waffle")).click();
		Thread.sleep(5000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-97")));
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		//Thread.sleep(5000);
		WebElement opportuinity = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        driver.executeScript("arguments[0].click();", opportuinity);
        driver.findElement(By.xpath("//div[@title='New']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("BC_Govind_Create_Opp");
        driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("11/14/2021");
        driver.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//div[@class='slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click'])[3]")));
        
       // .click();
        // Thread.sleep(5000);
        //driver.findElement(By.xpath("//span[@class='slds-media__body']//span[text()='Needs Analysis']")).click();
       //driver.findElement(By.xpath("//span[@class='slds-media__body']//span[text()='Needs Analysis']")).click();
       driver.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[@class='slds-media__body']//span[text()='Needs Analysis']")));
       WebElement btnSave = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		 driver.executeScript("arguments[0].click();", btnSave);
		 System.out.println("Created Successfully");
			 
		 }
	}
          

	


