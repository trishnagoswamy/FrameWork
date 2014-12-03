package testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.oro.text.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;


public class Exp {
	public WebDriver driver;

	//	public Screen s;
	
  @Test
  public void f() throws FindFailed {
	  driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.zamzar.com/");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	 /*driver.findElement(By.id("inputFile")).sendKeys("\\home\\vidya\\Desktop\\count.ods");
	  new Select(driver.findElement(By.tagName("select"))).selectByVisibleText("pdf");*/
	  Screen s=new Screen();     
	//org.sikuli.script.Pattern image = new org.sikuli.script.Pattern("/home/vidya/Desktop.sikuli/1416303594236.png");			
	s.click("/home/vidya/Desktop.sikuli/1416311656905.png");		
  }
	
  }
  


