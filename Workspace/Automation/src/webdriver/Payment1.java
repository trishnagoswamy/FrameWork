package webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class Payment1 {
	public WebDriver driver;
	private static StringBuffer SB;
	@BeforeTest
	  public void beforeTest() {
		driver = new FirefoxDriver();
		  driver.get("http://192.168.1.124:85/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		  //Login to 'Afzalpur APMC'
		  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("gangavathiapmc");
		  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("vsspl");
		  driver.findElement(By.xpath("//button[text()='Login']")).click(); 
		  driver.findElement(By.xpath("//div[@class='x-panel-header x-unselectable x-accordion-hd']/span[contains(text(),'Accounts')]")).click();
	
	  }
	
  @Test(enabled=false)
  public void entry() {
	  try{
		  driver.findElement(By.xpath("//a/span[contains(text(),'Payments')]")).click();
			driver.switchTo().frame("3032_IFrame");
		  driver.findElement(By.xpath("//button[contains(text(),'New Record')]")).click();
			driver.findElement(By.xpath("//img[@id='ext-gen276']")).click();
			driver.findElement(By.xpath("//div[contains(text(),'Andra Bank Pledge Loan Gangavathi')]")).click();
			driver.findElement(By.xpath("//img[@id='ext-gen299']")).click();
			driver.findElement(By.xpath("//div[contains(text(),'A.Basavaraj And Brothers')]")).click();
		driver.findElement(By.id("PaymentEntryWindow_txtChqueNumber")).sendKeys("1111");
		driver.findElement(By.id("PaymentEntryWindow_txtGrossAmount")).sendKeys("1000");
		driver.findElement(By.id("PaymentEntryWindow_txtTdsAmount")).sendKeys("50");
		driver.findElement(By.id("PaymentEntryWindow_txtNarration")).sendKeys("Payment rec 1");
		driver.findElement(By.xpath("//button[contains(text(),'Insert')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
			}
			catch(Exception e){
				SB.append("Payment Entry Failed Reason Is....."+e.toString());
				SB.append("\n");
			}
			}
  
@Test
  private void cashBook(){
	  String content_data=null;
	  driver.findElement(By.xpath("//a/span[contains(text(),'Cash Book')]")).click();
	  driver.switchTo().frame("3038_IFrame");
	  driver.findElement(By.xpath("//button[contains(text(),'Show Data')]")).click();
	  List<WebElement> c=driver.findElements((By.xpath("//div[@class='x-grid3-body']/div")));
	  int cashbook_count=c.size();
	  System.out.println("Number of Records in CaskBook Are -- "+cashbook_count);
	  
	  //String s = driver.findElements(By.xpath("//div[@class='x-grid3-body']/div")).
	  for(int i=1;i<cashbook_count;i++){
	  content_data = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div")).getText();
System.out.println(content_data);
  }  }
}
  


