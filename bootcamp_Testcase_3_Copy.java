package BC_TestCase;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bootcamp_Testcase_3_Copy extends bootCamp_Baseclass {

	@Test
	public  void bootcamp_Testcase_3() throws InterruptedException {
		
	//Thread.sleep(5000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"slds-icon-waffle\"]")));
	driver.findElement(By.className("slds-icon-waffle")).click();
		Thread.sleep(1000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-97")));
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		//Thread.sleep(5000);
		WebElement opportuinity = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        driver.executeScript("arguments[0].click();", opportuinity);
        driver.findElement(By.xpath("//button[@title='Display as Table']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@title='Table']/a/span")).click();
        System.out.println("Table option is clicked successfully");
        Thread.sleep(3000);
        
      //  driver.executeScript("window.scrollTo(0, document.body.scrollHeight)");
      //  driver.executeScript("arguments[0].scrollIntoView();", driver.findElements(By.xpath("//table[@data-aura-class='uiVirtualDataTable']/tbody/tr/td[6]")));
        List<WebElement> collectionsClosedate = driver.findElements(By.xpath("//table[@data-aura-class='uiVirtualDataTable']/tbody/tr/td[6]"));
        List<String> beforesort = new ArrayList<String>();
            for(WebElement ele : collectionsClosedate) {
     	  
     	   if(ele!=null) {
     		   String closeDate = ele.getText();
     		   beforesort.add(closeDate);
            	 }
     	 
     	   
        }
           // System.out.println("Before sort:"+beforesort.size());
           // System.out.println("Before sort:"+beforesort);
            
        WebElement closedate = driver.findElement(By.xpath("//th[@title='Close Date']/div/a")); 
       driver.executeScript("arguments[0].click();", closedate);
        
        System.out.println("Closed date option is clicked successfully");
   	 
       List<WebElement> colAfterSortClosedate = driver.findElements(By.xpath("//table[@data-aura-class='uiVirtualDataTable']/tbody/tr/td[6]"));
       List<String> aftersort = new ArrayList<String>();
           for(WebElement ele : colAfterSortClosedate) {
    	  
    	   if(ele!=null) {
    		   String aftercloseDate = ele.getText();
    		   aftersort.add(aftercloseDate);
           	 }
    	 
    	  
       }
           System.out.println("after sort:"+aftersort.size());
           System.out.println("after sort:"+aftersort);
           System.out.println("TestCase_3 Run Successfully");
           driver.quit();
        
        /*// driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("BC_TC_1");
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
				 System.out.println("Verification Failed"); */
			 
		 }
	}
          

	


