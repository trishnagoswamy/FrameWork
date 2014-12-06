package com.selenium.testcases;

import java.awt.Component;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import com.selenium.actions.Signin;
import com.selenium.pageobject.Accounts;
import com.selenium.pageobject.Buttons;
import com.selenium.pageobject.LoginPage;

public class Payments_entry {
	public WebDriver driver;
	
	 @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  driver= new FirefoxDriver();  
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		 Signin.Execute(driver, "afzalpurapmc", "vsspl");
		 }
	
  @Test
  public void f() throws InterruptedException {
		
	  Accounts.Acc_Module(driver).click();
	  Accounts.Payments_ScreenName(driver).click();
	  driver.switchTo().frame("3032_IFrame");
	  Buttons.btn_NewRecord(driver);
	  driver.findElement(By.xpath("//img[@id='ext-gen299']")).click();
	
	
	ArrayList<String> list = new ArrayList<String>();
	ArrayList<String> sorted_List = new ArrayList<String>();
	java.util.List<WebElement> dropdown= driver.findElements(By.xpath("//div[@class='x-combo-list-inner']"));
	/*WebElement ele = driver.findElement(By.xpath("//div[@class='x-combo-list-inner']"));
	String str= ele.getText();
	System.out.println(str);*/
	
	for(WebElement element:dropdown){
		  list.add(element.getText());
		  
	  }
	
	 System.out.println("ArrayList Elements in Sorted order: ");
	 Collections.sort(list);
	for(int i=0;i<list.size();i++){
		
		System.out.println(list.get(i));
		sorted_List.add(list.get(i));
	}
	
	System.out.println("Not Sorted List:   "+list);
	
	//System.out.println("Sorted List   "+sorted_List);
//if(list.equals(o)(Collections.sort(list))){}

}}
