package BC_TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bootcamp_Testcase_4_Copy extends bootCamp_Baseclass {

	@Test
	public void bootcamp_Testcase_4() throws InterruptedException {
			//Thread.sleep(5000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"slds-icon-waffle\"]")));
	driver.findElement(By.className("slds-icon-waffle")).click();
		//Thread.sleep(5000);
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
       // driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("BC_TC_1");
        driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("11/14/2021");
       // driver.findElement(By.xpath("//input[@id='input-493']")).click();
        //driver.findElement(By.xpath("//span[text()='Needs Analysis']")).click();
		WebElement btnSave = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		 driver.executeScript("arguments[0].click();", btnSave);
		 
		 WebElement msg = driver.findElement(By.xpath("(//input[@name='Name']/following::div[contains(text(),'Complete this field')])[1]"));	
		 String errMsg = msg.getText();
		 if(errMsg.contentEquals("Complete this field")) 
			 System.out.println("Verification Passed for Oppurtunity Name");
			 else
				 System.out.println("Verification Failed"); 
		 System.out.println("TestCase_4 Run Successfully"); 

		 }
	
	         
	}
          

	


