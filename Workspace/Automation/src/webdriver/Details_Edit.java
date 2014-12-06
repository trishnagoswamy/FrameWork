package webdriver;

//import java.awt.List;

//import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
//import com.thoughtworks.selenium.webdriven.commands.SeleniumSelect;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//import com.thoughtworks.selenium.Selenium;

import webdriver.Login;
public class Details_Edit {
	public static WebDriver driver;
	 
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Login t = new Login();
		driver=t.signin("afzalpurapmc", "vsspl");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div/div/div/span[contains(text(), 'Administration')]")).click();
		driver.findElement(By.xpath("//a/span[contains(text(), 'Details Of Committee')]")).click();
		driver.switchTo().frame("4042_IFrame");
		driver.findElement(By.xpath("//tbody/tr/td[@class='x-grid3-col x-grid3-cell x-grid3-td-lblMemberName ']/div[text()='Radhika']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//em[@unselectable='on']/button[@class='x-btn-text icon-applicationedit']")).click();
		driver.findElement(By.xpath("//img[@id='ext-gen209']")).click();
		driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[text()= 'ViceChairman']")).click();
		driver.findElement(By.xpath("//table[@id='MemberCreationWindow_btnSave']")).click();
		WebElement e = driver.findElement(By.xpath("//div[@class='ext-mb-content']/span[contains(text(),'Your record has been saved successfully')]"));
		String str = e.getText();
		System.out.println(str);
		Assert.assertEquals("Your record has been saved successfully", str);
		Assert.assertEquals("Your record has been saved successfully", str);
		driver.findElement(By.xpath("//tbody/tr/td[@class='x-btn-center']/em/button[@class='x-btn-text']")).click();//click on ok button in confirmation box
	//to close creation child window
		Thread.sleep(1000);
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='MemberCreationWindow_windowMemberCreation']/div/div[@class='x-window-tr']/div/div/div[@class='x-tool x-tool-close']"))).click();
		
			}

}