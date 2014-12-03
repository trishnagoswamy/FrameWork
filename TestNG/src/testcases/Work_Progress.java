package testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.jetty.html.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;







import org.testng.reporters.jq.TimesPanel;













//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.selenium.actions.Signin;
import com.selenium.common.Buttons;
import com.selenium.common.Common_Fun;
import com.selenium.pageobject.Contractor_Bill;
import com.selenium.pageobject.Devmodule;
import com.selenium.pageobject.Work_Prog_ele;

public class Work_Progress {
	public WebDriver driver;
	String MBNO="7777";
	String Status="Inprogress";
	boolean flag;
	
	@BeforeTest
	  public void beforeTest() {
		  driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  Signin.Execute(driver, "bidarapmc", "vsspl");
		 driver.manage().window().maximize();
		 Devmodule.Development_module(driver);
		
	}
	
	@Test(enabled=false)//(description="Verify Work Progress Creation")
  public void entry_creation() throws InterruptedException {
		Devmodule.Work_progress(driver); 
		driver.switchTo().frame("4009_IFrame");
		/*Buttons.btn_NewRecord(driver);
		Work_Prog_ele.combo_WorkName(driver);
		driver.findElement(By.xpath("//div[@class='x-layer x-combo-list ']/div[@class='x-combo-list-inner']/div[contains(text(),'APMC Works')]")).click();

		Work_Prog_ele.MBNo(driver).sendKeys(MBNO);
		Work_Prog_ele.combo_VerifiedBy(driver);
		driver.findElement(By.xpath("//div[@class='x-layer x-combo-list ']/div/div[contains(text(),'AEE')]")).click();

		Work_Prog_ele.Dis_txt_worktype(driver);

		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		Thread.sleep(2000);

		String str=Work_Prog_ele.txt_WorkType(driver).getAttribute("value");
		System.out.println("text is : "+str);

		Work_Prog_ele.txt_WorkStatus(driver).sendKeys(Status);
		Work_Prog_ele.btn_Save(driver);
		
		
		Common_Fun.confirm_Box(driver);
		Common_Fun.btn_OK_conf_box(driver);
		Buttons.btn_Close_Creation_ChildWindow(driver);*/
		/*java.util.List<WebElement> rec_count=driver.findElements(By.xpath("//div[@class='x-grid3-body']/div/table/tbody/tr/td[2]/div"));
int Count =rec_count.size();
//System.out.println(Count);
		
		for(int i=1;i<=Count;i++){
	String workname=driver.findElement(By.xpath("//div[@class='x-grid3-body']/div["+i+"]/table/tbody/tr/td[3]/div")).getText();	
String MBNO1=driver.findElement(By.xpath("//div[@class='x-grid3-body']/div["+i+"]/table/tbody/tr/td[8]/div")).getText();
String wprogress=driver.findElement(By.xpath("//div[@class='x-grid3-body']/div["+i+"]/table/tbody/tr/td[10]/div")).getText();


if(MBNO1.equals(MBNO)&&wprogress.equals(Status)){
driver.findElement(By.xpath("//div[@class='x-grid3-body']/div["+i+"]/table/tbody/tr/td[8]/div")).click();

flag=true;
break;
}
		
		if(flag){
			System.out.println("Record Found in grid with given details ");	
			break;
		}
else{
	driver.findElement(By.xpath("//tbody/tr/td[@class='x-btn-center']/em/button[@class='x-btn-text x-tbar-page-next']")).click();

}

}	
		if(!flag){
			System.out.println("Record Not Found In Grid");
			}
		
		*/
		
		
	

	  
     
     
                        
     
	}
	
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void contractor_Bill() throws InterruptedException{
		
	Devmodule.Contractor_bill(driver);
	driver.switchTo().frame("4011_IFrame");
	Buttons.btn_NewRecord(driver);
	Contractor_Bill.combo_Work_Name(driver);
	driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[2]")).click();
	
	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	
	Contractor_Bill.dis_txt_MBNO(driver);
	Contractor_Bill.dis_txt_WorkStatus(driver);
	
	
	
	
	
	String txt_mbno=Contractor_Bill.dis_txt_MBNO(driver).getAttribute("value");
	
	String txt_ststus=Contractor_Bill.dis_txt_WorkStatus(driver).getAttribute("value");
	
	/*WebDriverWait wait=new WebDriverWait(driver, 50);
	wait.until(ExpectedConditions.textToBePresentInElement(By.id("contractorBillPreparationuserWindow_txtMBNumber"), "7777"));*/
	
	System.out.println(txt_mbno);
	
System.out.println("The Status Is "+txt_ststus);
	System.out.println(Contractor_Bill.dis_txt_MBNO(driver).isEnabled());
	//driver.findElement(By.xpath("//td/table[@id='btnContractorBillPrint']/tbody/tr/td[2]")).click();
	
	}
	}
	
	
 


