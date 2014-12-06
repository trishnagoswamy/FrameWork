package allprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;







//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class dropdown {
	WebDriver driver; 
  @Test
  public void f() throws InterruptedException {
	
	  //(dynamic dropdown)No need to click on dropdown and then select option from dropdown,directly select value from dropdown
	 new Select(driver.findElement(By.xpath("//td/select"))).selectByVisibleText("India");
	 
	
	//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("trishnagoswamy@gmail.com");
	  
	}
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://newtours.demoaut.com/mercuryregister.php");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
  }

}
