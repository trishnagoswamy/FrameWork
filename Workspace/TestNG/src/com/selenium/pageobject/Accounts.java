package com.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Accounts {
private static WebElement element = null;

public static WebElement Acc_Module(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//div[@class='x-panel-header x-unselectable x-accordion-hd']/span[contains(text(),'Accounts')]"));
	element.click();
	return element;
}
public static WebElement Bank_ScreenName(WebDriver driver){
	element = driver.findElement(By.xpath("//a[@class='x-tree-node-anchor']/span[contains(text(),'Bank Details')]"));
	element.click();
	return element;
}

public static WebElement Payments_ScreenName(WebDriver driver){
	element = driver.findElement(By.xpath("//a/span[contains(text(),'Payments')]"));
	return element;
}
public static WebElement GeneralLedger_ScreenName(WebDriver driver){
	element=driver.findElement(By.xpath("//a/span[contains(text(),'General Ledger')]"));
	element.click();
	return element;
}
}
