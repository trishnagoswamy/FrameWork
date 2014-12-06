package com.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Marketing {
private static WebElement element = null;

public static WebElement Mkting_ModuleName(WebDriver driver){
	element=driver.findElement(By.xpath("//div[@class='x-panel-header x-unselectable x-accordion-hd']/span[contains(text(),'Marketing')]"));
	element.click();
	return element;
}

public static WebElement KP_screenname(WebDriver driver){
	element=driver.findElement(By.xpath("//a/span[contains(text(),'Kharidi Patti')]"));
	element.click();
	return element;
}
}
