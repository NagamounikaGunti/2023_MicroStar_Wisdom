package BQA_Class;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Workbook;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Text_XLSX {
	public WebDriver driver;
	
  @Test
  public void f()throws Exception {
	  File src=new File("C:\\Users\\NAGA MOUNIKA\\Desktop\\BQB.xlsx");
	  FileInputStream fi=new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fi);
	  XSSFSheet s=wb.getSheetAt(0);
	  String username = s.getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(username);
		
		driver.findElement(By.id("login_field")).sendKeys(username);
		
		Thread.sleep(3000);

		String password = s.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(password);
		
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
		
		driver.findElement(By.name("commit")).click();
		Thread.sleep(10000);

	  
	  
	  
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
