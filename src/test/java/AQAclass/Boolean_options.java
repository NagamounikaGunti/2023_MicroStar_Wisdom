package AQAclass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Boolean_options {
	public WebDriver driver;
	
  @Test
  public void options() {
	  driver.findElement(By.xpath("//button[normalize-space()='Round Trip']")).click();
	 boolean printelement= driver.findElement(By.xpath("//button[normalize-space()='Round Trip']")).isDisplayed();
	 System.out.println(printelement);
	WebElement ele1= driver.findElement(By.xpath("//button[normalize-space()='Round Trip']"));
	 
	 if (ele1.isDisplayed()) {
		 System.out.println("round button is there");
		 
		
	} else {
		System.out.println("round button is not there");

	}
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.firefoxdriver().setup();
	  driver=new FirefoxDriver();
	  driver.get("https://savaari.com/");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
