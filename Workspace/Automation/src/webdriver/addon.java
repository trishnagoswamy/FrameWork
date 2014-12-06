package webdriver;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class addon {
	public WebDriver driver;
	@BeforeTest
	  public void beforeTest() throws IOException {
		
		driver = new FirefoxDriver();
	driver.get("http://192.168.1.124:85/"); 
	 driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	  //Login to 'Afzalpur APMC'
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("gangavathiapmc");
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("vsspl");
	  driver.findElement(By.xpath("//button[text()='Login']")).click(); 
	 //driver.switchTo().alert().accept();
	 driver.findElement(By.xpath("//button[text()='Login']")).click(); 
	 
	 List<WebElement>list = driver.findElements(By.tagName("caption"));
	 int count=list.size();
	 System.out.println(count);
	}
  @Test
  public void f() {
  }
 

}
