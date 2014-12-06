package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import com.selenium.actions.Signin;
import com.selenium.pageobject.Buttons;
import com.selenium.pageobject.Devmodule;

public class Work_Progress_Edit {
	public WebDriver driver; 
	 @BeforeTest
	  public void login() {
		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 Signin.Execute(driver, "bidarapmc", "vsspl");
		 driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	 }
	
	@Test
  public void f() {
		Devmodule.Development_module(driver);
		Devmodule.Work_progress(driver);
		driver.switchTo().frame("4009_IFrame");
		driver.findElement(By.xpath("//table/tbody/tr/td[3]/div/img")).click();
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[7]/a/em/span")).click();
		driver.findElement(By.xpath("//tbody/tr/td[@class='x-btn-center']/em/button")).click();
		driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[3]/table/tbody/tr/td[2]/div")).click();
	Buttons.btn_DeleteRecord(driver);
	driver.switchTo().alert().accept();
	String str=driver.findElement(By.xpath("//div/span[@class='ext-mb-text']")).getText();
	System.out.println(str);
	}
 

}
