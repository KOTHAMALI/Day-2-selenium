package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task5 {
	
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
	    public void malebutton(){
	    	boolean isSelected;
	    	driver.findElement(By.id("u_0_i")).click();
	    	isSelected = driver.findElement(By.id("u_0_i")).isSelected();
	    	if(isSelected==true)
	    	{
	    		System.out.println("male radio button is selected");
	    	}
	    	else
	    	{
	    		Assert.fail("Button should not be selected by default");
	    	}
	    }
	    
	    @Test
	    public void femalebutton(){
	    	boolean Selected;
	    	driver.findElement(By.id("u_0_h")).click();
	    	Selected = driver.findElement(By.id("u_0_h")).isSelected();
	    	if(Selected==true){
	    		System.out.println("female radio button is selected");
	    	}
	    	else
	    	{
	    		Assert.fail("Button should not be selected by default"); 
	    	}
	    }

}
