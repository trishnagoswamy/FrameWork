package com.selenium.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Common_Fun {
private static WebElement element=null;

public static WebElement confirm_Box(WebDriver driver){
	String conf=driver.findElement(By.xpath("//div/span[@class='ext-mb-text']")).getText();
	System.out.println("Confirmation Message is : "+conf);	
	return element;
}

public static WebElement btn_OK_conf_box(WebDriver driver){
	element=driver.findElement(By.xpath("//tbody/tr/td[@class='x-btn-center']/em/button[@class='x-btn-text']"));
	element.click();
	return element;
}
}
