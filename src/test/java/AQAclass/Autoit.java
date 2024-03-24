package AQAclass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Autoit {
	public WebDriver driver;
  @Test
  public void f() throws IOException,Exception {
	 //WebElement ele=driver.findElement(By.id("uploadPicture"));
	  //ele.sendKeys("C:\\Users\\NAGA MOUNIKA\\Downloads\\pexels-pixabay-60597.jpg");
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  WebElement ele=driver.findElement(By.id("uploadPicture"));
	  js.executeScript("arguments[0].click();",ele);
	  Thread.sleep(10000);
	  Runtime.getRuntime().exec("C:\\Users\\NAGA MOUNIKA\\Desktop\\USANA.exe");
	  
  }
  @BeforeTest
  public void openurl()throws Exception {
	  WebDriverManager.firefoxdriver().setup();
	  driver=new FirefoxDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();


  }

  @AfterTest
  public void afterTest() {
  }

}
