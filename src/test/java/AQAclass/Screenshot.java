package AQAclass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Screenshot {
	public WebDriver driver;
	
  @Test
  public void alertscreen()throws Exception {
	  
	  driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(3000);

		String str = driver.switchTo().alert().getText();

		System.out.println(str);

		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
 
		
String ATM = "APJ kalam";
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(scrFile, new File("C:\\Users\\NAGA MOUNIKA\\Desktop\\arm"+ATM+".png"));
			}
	  
	
  @BeforeTest
  public void beforeTest() throws Exception {
	 WebDriverManager.firefoxdriver().setup();
	 driver=new FirefoxDriver();
	 driver.get("https://demoqa.com/alerts");
	 driver.manage().window().maximize();
	 
	  String ATM ="RRR";
		
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			org.openqa.selenium.io.FileHandler.copy(scrFile, new File("C:\\Users\\NAGA MOUNIKA\\Desktop\\arm"+ATM+".png"));
			
			}

  

  @AfterTest
  public void afterTest() {
  }

}
