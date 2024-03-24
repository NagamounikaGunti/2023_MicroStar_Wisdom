package BQA_Class;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Datadriven {
	public WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  FileInputStream fi=new FileInputStream("C:\\Users\\NAGA MOUNIKA\\Desktop\\Book1.xls");
	  Workbook wb=Workbook.getWorkbook(fi);
	  Thread.sleep(10000);
	  Sheet s= wb.getSheet(0);
	  driver.findElement(By.id("login_field")).sendKeys(s.getCell(0, 1).getContents());
	  Thread.sleep(10000);
	  driver.findElement(By.id("password")).sendKeys(s.getCell(1, 1).getContents());
	  Thread.sleep(10000);
	  driver.findElement(By.name("commit")).click();
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://github.com/login?return_to=%2Flogins");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
