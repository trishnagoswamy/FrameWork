package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.selenium.actions.Signin;
import com.selenium.pageobject.Work_Prog_ele;

public class sample {
 WebDriver driver;
	@BeforeTest
	  public void login() {
		driver=new FirefoxDriver();
		driver.get("http://192.168.1.124:85/");
		driver.manage().window().maximize();
		Signin.Execute(driver, "gangavathiapmc", "vsspl");
	  }

	
	@Test
  public void reg() {
	Work_Prog_ele.	
  }
  
  @AfterTest
  public void signout() {
	  
  }

}
