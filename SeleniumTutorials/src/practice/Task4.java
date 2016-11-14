package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task4 {
	
	 private WebDriver driver = null;
	    
	    // Before class methods execute before each class
	    @BeforeClass
	    public void beforeClass() {
	    	
	        System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
	        driver = new ChromeDriver();
	        
	        
	        driver.navigate().to("http://facebook.com");
	    }
	    
	    // After class method executes after each class 
	    @AfterClass
	    public void afterClass() {
	        driver.quit();
	    }
	    
	    //Test executes between before and after class
	      @Test
public void month(){
	    	  
	    	  Select dropdown = new Select(driver.findElement(By.id("month")));	   
	    	  List<WebElement> list=  dropdown.getOptions();
	    
	    	  boolean duplicate =false;
	    	  for(int i=0;i<list.size()-1;i++){
	    		  for(int j=1;j<list.size();j++){
	    			  if(list.get(i).getText()==list.get(j).getText()){
	    				  System.out.println("duplicate values are:" + " " + list.get(i).getText() + list.get(j).getText());
	    				  duplicate=true;
	    				  break;
	    			  }
	    		  }
	    	  }
	    	  if(duplicate==false)
	    	  {
	    		  System.out.println("no duplicate values found for month");
	    	  }
	    	  }
	      @Test
	      public void day(){
	    	  
	    	  Select dropdown1 = new Select(driver.findElement(By.id("day")));	   
	    	  List<WebElement> list1=  dropdown1.getOptions();
	    	  boolean duplicate = false;
	    	  for(int i=0;i<list1.size()-1;i++){
	    		  for(int j=1;j<list1.size();j++){
	    			  if(list1.get(i).getText()==list1.get(j).getText()){
	    				  System.out.println("duplicate values are:" + " " + list1.get(i).getText() + list1.get(j).getText());
	    				  duplicate = true;
	    				  break;
	    			  }
	      }}
	    	  if(duplicate==false)
	    	  {
	    		  System.out.println("no duplicate values found for day");
	    	  }
	    	  }
	      @Test
	      public void year(){
	    	  
	    	  Select dropdown2 = new Select(driver.findElement(By.id("year")));	   
	    	  List<WebElement> list2=  dropdown2.getOptions();
	    	  boolean duplicate = false;
	    	  for(int i=0;i<list2.size()-1;i++){
	    		  for(int j=1;j<list2.size();j++){
	    			  if(list2.get(i).getText()==list2.get(j).getText()){
	    				  System.out.println("duplicate values are:" + " " + list2.get(i).getText() + list2.get(j).getText());
	    				  duplicate = true;
	    				  break;
	    			  }
	    	  }

	      }
	    	  if(duplicate==false)
	    	  {
	    		  System.out.println("no duplicate values found for year");
	    	  }
	    	  }
	      }
