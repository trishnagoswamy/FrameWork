package com.selenium.pageobject;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Work_Prog_ele {
	private static WebElement element=null;
	
	public static WebElement combo_WorkName(WebDriver driver){
element=driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]/div[@id='workInProgressuserWindow_cmbWorkName_Container']/div/img"));
element.click();
return element;

	}
	
	public static WebElement MBNo(WebDriver driver){
		element=driver.findElement(By.id("workInProgressuserWindow_txtMBNumber"));
		return element;
	}
	
public static WebElement combo_VerifiedBy(WebDriver driver){
	element=driver.findElement(By.xpath("//table/tbody/tr[4]/td[4]/div/div/img"));
	element.click();
	return element;
}

public static WebElement txt_WorkStatus(WebDriver driver){
	element=driver.findElement(By.xpath("//textarea[@id='workInProgressuserWindow_txtRemarks']"));
	return element;
}

public static WebElement txt_WorkType(WebDriver driver ){
	element=driver.findElement(By.id("workInProgressuserWindow_txtContractorName"));
	return element;
}

public static WebElement Dis_txt_worktype(WebDriver driver){
	((JavascriptExecutor) driver).executeScript("document.getElementsByName('workInProgressuserWindow_txtContractorName')[0].removeAttribute('disabled');");
	return element;
	
}


public static WebElement btn_Save(WebDriver driver){
	element = driver.findElement(By.xpath("//button[contains(text(),'Save')]")); 
	element.click();
	return element;
}

public static WebElement btn_Close(WebDriver driver){
	element = driver.findElement(By.xpath("//button[contains(text(),'Close')]")); 
	element.click();
	return element;
}


}
