package AQAclass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.bouncycastle.its.ITSPublicEncryptionKey.symmAlgorithm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Optionsselected {
	public WebDriver driver;
	
  @Test
  public void options() {
	List<WebElement>allvalues= new Select(driver.findElement(By.id("day"))).getOptions();
	System.out.println(allvalues.get(15).getText());
	for(int i = 0;i<allvalues.size();i++)
	{
		System.out.println(allvalues.get(i).getText());
		if (allvalues.get(i).getText().contains("18")){
			System.out.println(" is matched");
			
		} else {
			System.out.println("not matched");

		}
		}
	}
	
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.firefoxdriver().setup();
	  driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/reg/?app_id=1140740696088074&logger_id");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
