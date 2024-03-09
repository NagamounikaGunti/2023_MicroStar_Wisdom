package AQAclass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class MouseOverAction {
	public WebDriver driver;
	public Actions action;
	
  @Test
  public void mouseover()throws Exception {
	  action=new Actions(driver);
	WebElement ele1 = driver.findElement(By.linkText("SwitchTo"));
	//action command
	action.moveToElement(ele1).build().perform();
	Thread.sleep(10000);
	driver.findElement(By.linkText("Windows")).click();
	Thread.sleep(10000);
	  
  }
  
  @BeforeTest
  
  public void openurl() throws Exception {
	  WebDriverManager.firefoxdriver().setup();
	  driver=new FirefoxDriver();
	  driver.get("http://demo.automationtesting.in/Register.html");
	  Thread.sleep(10000);
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
