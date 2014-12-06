package com.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Kp_elements {
	private static WebElement element=null;
	
public static WebElement combo_OriginName(WebDriver driver){
	element=driver.findElement(By.xpath("//img[@id='ext-gen394']"));
	return element;
}

public static WebElement combo_PurchaseType(WebDriver driver){
	element=driver.findElement(By.xpath("//img[@id='ext-gen382']"));
	
	return element;
}
}
