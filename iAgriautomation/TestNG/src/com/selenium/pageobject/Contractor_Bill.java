package com.selenium.pageobject;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contractor_Bill {
private static WebElement element=null;


public static WebElement combo_Work_Name(WebDriver driver){
	element=driver.findElement(By.xpath("//table[@class='tablewidth']/tbody/tr/td/div[@id='contractorBillPreparationuserWindow_cmbWorkName_Container']/div/img"));
element.click();
return element;
}

public static WebElement dis_text_ContractorName(WebDriver driver){
((JavascriptExecutor) driver).executeScript("document.getElementsByName('contractorBillPreparationuserWindow_txtContractorName')[0].removeAttribute('disabled');");
return element;
}

public static WebElement dis_text_Area(WebDriver driver){
	((JavascriptExecutor) driver).executeScript("document.getElementsByName('contractorBillPreparationuserWindow_txtArea')[0].removeAttribute('disabled');");
return element;
}

public static WebElement dis_txt_WorkValue(WebDriver driver){
	((JavascriptExecutor) driver).executeScript("document.getElementsByName('contractorBillPreparationuserWindow_txtWorkValue')[0].removeAttribute('disabled');");
	return element;
}

public static WebElement dis_txt_MBNO(WebDriver driver){
	
	((JavascriptExecutor) driver).executeScript("document.getElementsByName('contractorBillPreparationuserWindow_txtWorkValue')[0].removeAttribute('disabled');");

	//((JavascriptExecutor) driver).executeScript("document.getElementsByName('contractorBillPreparationuserWindow_txtWorkValue')[0].removeAttribute('disabled');");
return element;
}

public static WebElement dis_txt_ContractorFirmName(WebDriver driver){
	((JavascriptExecutor) driver).executeScript("document.getElementsByName('contractorBillPreparationuserWindow_txtFirmName')[0].removeAttribute('disabled');");
return element;
}

public static WebElement dis_txt_WorkStatus(WebDriver driver){
	((JavascriptExecutor) driver).executeScript("document.getElementsByName('contractorBillPreparationuserWindow_txtWorkStatus')[0].removeAttribute('disabled');");
	return element;
}

public static WebElement dis_txt_WorkType(WebDriver driver){
	((JavascriptExecutor) driver).executeScript("document.getElementsByName('contractorBillPreparationuserWindow_txtWorkType')[0].removeAttribute('disabled');");
	return element;
	
}

public static WebElement txt_WorkStatus(WebDriver driver){
	element = driver.findElement(By.id("contractorBillPreparationuserWindow_txtWorkStatus"));
	return element;
}

public static WebElement txt_MBNO(WebDriver driver){
	element=driver.findElement(By.id("contractorBillPreparationuserWindow_txtMBNumber"));
	return element;
}
}
