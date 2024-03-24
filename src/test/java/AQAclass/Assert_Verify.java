package AQAclass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assert_Verify {
	public WebDriver driver;
	
  @Test
  public void funoperation() throws Exception {
	  String Actualvalue="$3"; 
	  String Expectedvalue=driver.findElement(By.xpath("//b[normalize-space()='$398']")).getText();
	  System.out.println(Expectedvalue);
	  Thread.sleep(10000);
	 /* try {
		  System.out.println("welcome to selenium");
		  Assert.assertEquals(Actualvalue, Expectedvalue);
		
	} finally {
		// TODO: handle finally clause
		  System.out.println("apple");
		  System.out.println("mapple");
		
	}*/
	  /*try {
		  System.out.println("welcome to selenium");
		  Assert.assertEquals(Actualvalue, Expectedvalue);
		  //System.out.println("apple");
		  //System.out.println("mango");
		  
		  
		
	} 
	  catch (Exception e) {
		// TODO: handle exception
		  System.out.println("apple");
		  System.out.println("mapple");
		  
		  
		  
	}*/
	  try {
			

			// 1st statement 
			System.out.println("Assertion starts here...");
						    
			//22222222 
			Assert.assertEquals(Actualvalue, Expectedvalue);
			
			
			
		} finally {
			
			// 3rd statement 
						System.out.println("Apple");
						  
						// 4t statement 
						System.out.println("A blog for Software Testers");
		}
	

	  
  }
  @BeforeTest
  public void beforeTest()throws Exception {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/newtours/");
	  Thread.sleep(10000);
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
