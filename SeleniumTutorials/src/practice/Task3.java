package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task3 {

	 private WebDriver driver = null;
	    
	    // Before class methods execute before each class
	    @BeforeClass
	    public void beforeClass() {
	    	
	        System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
	         driver = new ChromeDriver();
	         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	     
	         
	        driver.navigate().to("http://facebook.com");
	    }
	    
	    // After class method executes after each class 
	    @AfterClass
	    public void afterClass() {
	    	
	        driver.quit();
	    }
	    
	    //Test executes between before and after class
	      @Test
	   public void  invalidregistration() {
	    	  driver.findElement(By.id("u_0_1")).sendKeys("kpr");
	    	  driver.findElement(By.id("u_0_3")).sendKeys("reddy");
	    	  driver.findElement(By.id("u_0_5")).sendKeys("23456789987654321");
	    	  driver.findElement(By.id("u_0_8")).sendKeys("23456789987654321");
	    	  driver.findElement(By.id("u_0_a")).sendKeys("technosoft");
	    	  
	    	
	    	  
	    	  Select dropdown = new Select(driver.findElement(By.id("month")));
	    	  dropdown.selectByVisibleText("Jan");
	          
	          Select dropdown1 = new Select(driver.findElement(By.id("day")));
	          dropdown1.selectByValue("10");
	          
	          Select dropdown2 = new Select(driver.findElement(By.id("year")));
	          dropdown2.selectByValue("1994");
	    	  
	          driver.findElement(By.id("u_0_i")).click();
	          driver.findElement(By.id("u_0_e")).click();
	    	   
	      }
	      
	      @Test
	      public void verify(){
	    	  String actualresult = driver.findElement(By.xpath(".//*[starts-with(@id,'js_')][contains(text(),'Please enter a valid mobile number or email address')]")).getText();
	    	  String expectedresult = ("Please enter a valid mobile number or email address.");
	    	  Assert.assertEquals(actualresult, expectedresult);
	      }
	    
}
