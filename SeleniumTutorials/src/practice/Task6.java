package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task6 {
	
	
	private WebDriver driver = null;
    
	   //the before class method executes before each class
	    @BeforeClass
	    public void beforeClass() {
	 
	        System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.navigate().to("https://www.facebook.com/");
	        
	    }
	    
	   //the after class method executes after each class
	    @AfterClass
	    public void afterClass() {
	        driver.close();
	    }
	    
	    //Test executes between before and after class
	    
	    @Test
	    public void buttonenabled(){
	    	
	    	 boolean isEnabled = driver.findElement(By.id("u_0_i")).isEnabled();
	        if(isEnabled == true) {
	        	
	        	System.out.println("can't click both button");
	        }
	        else
	        {
	        	System.out.println("click on male button");	
	        }
	    }

}
