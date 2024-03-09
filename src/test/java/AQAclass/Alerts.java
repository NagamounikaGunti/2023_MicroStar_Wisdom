package AQAclass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Alerts {
	
	public WebDriver driver;

  @Test
  public void handlingalerts() throws Exception {
	  
	//click on click me button
			driver.findElement(By.id("alertButton")).click();

			String str = driver.switchTo().alert().getText();
			
			System.out.println(str);
			
			Thread.sleep(10000);

		     //handling alert
			 driver.switchTo().alert().accept();
		
			//On button click, alert will appear after 5 seconds
				driver.findElement(By.id("timerAlertButton")).click();
				Thread.sleep(10000);

				String str1 = driver.switchTo().alert().getText();
				
				System.out.println(str1);
				
				Thread.sleep(10000);

			     //handling alert
				 driver.switchTo().alert().accept();
				 
			//on button click,confirm box will appear
				 driver.findElement(By.id("confirmButton")).click();
				String str2= driver.switchTo().alert().getText();
				System.out.println(str2);
				Thread.sleep(10000);
				driver.switchTo().alert().accept();
				//on button click ,prompt box will appear
				driver.findElement(By.id("promtButton")).click();
				String str3=driver.switchTo().alert().getText();
				System.out.println(str3);
				Thread.sleep(10000);
				driver.switchTo().alert().accept();
				
  }
  @BeforeTest
  
  public void openurl() throws Exception {
	  
	  WebDriverManager.firefoxdriver().setup();
	  driver=new FirefoxDriver();
	  driver.get("https://demoqa.com/alerts");
	 Thread.sleep(10000);
	  driver.manage().window().maximize();
	  
  }

  
  @AfterTest
  
  public void afterTest() {
  }

}
