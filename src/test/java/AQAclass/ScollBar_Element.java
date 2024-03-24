package AQAclass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ScollBar_Element {
	public WebDriver driver;
  @Test
  public void scollflow()throws Exception {
	
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  
	  //Find element by link text and store in variable "Element" WebElement
	  WebElement Element = driver.findElement(By.linkText("Linux"));
	  
	  //This will scroll the page till the element is found
	  js.executeScript("arguments[0].scrollIntoView();", Element);

  }
  
  @BeforeTest
  public void openURL() throws Exception{
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	 driver.get("http://demo.guru99.com/test/guru99home/");
	 Thread.sleep(10000);
	 driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
