package com.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Buttons {
private static WebElement element=null;



public static WebElement btn_NewRecord(WebDriver driver){
element = driver.findElement(By.xpath("//button[contains(text(),'New Record')]"));
element.click();
return element;
}

public static WebElement btn_EditRecord(WebDriver driver){
	element = driver.findElement(By.xpath("//button[contains(text(),'Edit Record')]")); 
	element.click();
	return element;
}

public static WebElement btn_DeleteRecord(WebDriver driver){
	element = driver.findElement(By.xpath("//button[contains(text(),'Delete Record')]")); 
	element.click();
	return element;
}


}
