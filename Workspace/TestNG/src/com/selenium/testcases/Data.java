package com.selenium.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;
//import jxl.read.biff.BiffException;









import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
//import org.testng.annotations.BeforeTest;










import com.selenium.pageobject.LoginPage;

public class Data {
 public  WebDriver driver;
	
	@Test
  public  void Login() throws InterruptedException, BiffException, IOException{
		driver = new FirefoxDriver();
		driver.get("http://192.168.1.124:85");
		FileInputStream Fi = new FileInputStream("/home/vidya/eclipse/Workspace/TestNG/src/All_xlsxSheets/sample.xls");
		Workbook wb = Workbook.getWorkbook(Fi);
		Sheet sh = wb.getSheet(0);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	LoginPage.txt_LoginName(driver).sendKeys(sh.getCell(0, 1).getContents());
	WebElement ele=LoginPage.txt_LoginName(driver);
			String t=	ele.getAttribute("value");
		System.out.println("Text is:"+t);
		LoginPage.txt_Password(driver).sendKeys(sh.getCell(1, 1).getContents());		 
		
		
	
	}
  

}
