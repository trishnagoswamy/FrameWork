package testcases;

import objectRepo.Homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class homepage {
	WebDriver driver;
  
	@BeforeTest
	  public void Signin() {
		driver=new FirefoxDriver();
		driver.get("http://192.168.1.124:85");
		driver.manage().window().maximize();
		Homepage.txt_LoginName(driver).sendKeys("bidarapmc");
	  }
	
	@Test
  public void f() {
  }
  

}
