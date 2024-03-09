package AQAclass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Asserts {
	public WebDriver driver;
	
  @Test
  public void funoperation() {
	  String actualouptut="mercuryTours";
	  String expectedoutput=driver.getTitle();
	  System.out.println(expectedoutput);
	  //1st statement
	  System.out.println("welcome to selenium");
	  //2nd statement
	  Assert.assertEquals(actualouptut,expectedoutput);
	  //3rd statement
	  System.out.println("apple");
	  //4th statement
	  System.out.println("mango");
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.firefoxdriver().setup();
	  driver=new FirefoxDriver();
	  driver.get("http://demo.guru99.com/test/newtours");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
