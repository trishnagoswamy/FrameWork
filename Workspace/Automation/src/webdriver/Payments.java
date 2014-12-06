package webdriver;

import org.testng.annotations.Test;

import org.testng.Reporter;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.thread.TestNGThread;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import org.openqa.selenium.WebDriverBackedSelenium;

public class Payments extends SeleneseTestBase{
	public static DefaultSelenium selenium;
	private static StringBuffer;
	
	public Payments()
	{
		verificationErrors = new StringBuffer();
	}
	
  @Test
  public void Payments_Fun() throws InterruptedException {
	  
	  paymentsEntry();
	  
	  System.out.println("***************Capturing Elements from Payments screen*********************");
	  String Act_Name = null;
	  String Voucher_No = null;
	  String Amount = null;
	  String TDS_Amount = null;
	  String Payment_type=null;
	  String Narration = null;
	  
	  try
	  {
		  
		  
	  
	  Act_Name=selenium.getText("Xpath=html/body/form/div[1]/div[2]/div[1]/div/div/div/div/div[1]/div/div[2]/div/div/div[1]/div[2]/div/div/table/tbody/tr/td[2]/div");//Acount Name Text
	  Voucher_No=selenium.getText("Xpath=html/body/form/div[1]/div[2]/div[1]/div/div/div/div/div[1]/div/div[2]/div/div/div[1]/div[2]/div/div/table/tbody/tr/td[4]/div");//Voucher No
	  Amount=selenium.getText("Xpath=html/body/form/div[1]/div[2]/div[1]/div/div/div/div/div[1]/div/div[2]/div/div/div[1]/div[2]/div/div/table/tbody/tr/td[6]/div");//Amount
	  TDS_Amount=selenium.getText("//*[@id='ext-gen141']/div/table/tbody/tr/td[7]/div");//TDS Amount
	  Payment_type=selenium.getText("Xpath=html/body/form/div[2]/div[2]/div[1]/div/div/div/div/div[2]/div[1]/div/div[1]/div[2]/div/div/table/tbody/tr/td[3]/div");//Payment Type
	  Narration=selenium.getText("//*[@id='ext-gen141']/div/table/tbody/tr/td[8]/div");
	  
	  }
	  catch (Exception e) {
		  verificationErrors.append(e);
		  verificationErrors.append("\n");
	}
	  
	   daybook(Voucher_No, Amount, TDS_Amount);
 	 
	   cashBook(Act_Name, Amount, TDS_Amount, Narration);
	  	 	  
       ledgerAccount(Act_Name, Voucher_No, Amount, TDS_Amount);

	   finalAccounts(Act_Name,Amount,TDS_Amount,Payment_type);
	  
	   viewEntries();
	  
	   income_Expenditure(Act_Name,Amount);
	  
	   payments_Receipts(Act_Name,Amount,TDS_Amount);
 

	   secretary_Reports();
	   
	  //Reporter
	  Reporter.log(verificationErrors.toString());

	  
	  System.out.println("*************************Reporter****************************************************");
	  System.out.println(verificationErrors.toString());
	  if(!verificationErrors.toString().equalsIgnoreCase(""))
	  {
		  fail(verificationErrors.toString());
		  verificationErrors = new StringBuffer();
	  }
	  
	  
  }
  
  


	         	  


private void paymentsEntry() throws InterruptedException {
	
	try
	{
		
	
	  selenium.click("Xpath=html/body/form/div[2]/div/div/div/div/div/div/div/div[2]/div[1]/div");//click on Accounts
	  selenium.click("//*[@id='ext-gen171']/div/li[2]/ul/li[2]/div");//Payments
	  TestNGThread.sleep(3000);
	  selenium.click("Xpath=html/body/form/div[1]/div[2]/div[1]/div/div/div/div/div[2]/div/table/tbody/tr/td[11]/table/tbody/tr/td[2]/em/button");//New Record
	  TestNGThread.sleep(2000);
	  selenium.selectFrame("3032_IFrame");
	  TestNGThread.sleep(2000);
	  selenium.click("Xpath=html/body/form/div[13]/div[2]/div[1]/div/div/div/div/div[3]/div/div[2]/div[1]/div/div/div/div/table/tbody/tr/td[4]/div/div/img");//Payment Arrow Mark
	  TestNGThread.sleep(2000);
	  selenium.click("Xpath=html/body/div[12]/div/div[4]");//Record selection
	  TestNGThread.sleep(2000);
	  selenium.click("Xpath=html/body/form/div[13]/div[2]/div[1]/div/div/div/div/div[4]/div/div[2]/div[1]/div/div/div/div/table[1]/tbody/tr[2]/td[1]/div/div/img");//Acc Name Arrow Mark
	  TestNGThread.sleep(2000);
	  selenium.click("Xpath=html/body/div[13]/div/div[3]");//REcord selection in Act Name
	  TestNGThread.sleep(2000);

	  selenium.type("Xpath=html/body/form/div[13]/div[2]/div[1]/div/div/div/div/div[4]/div/div[2]/div[1]/div/div/div/div/table[1]/tbody/tr[2]/td[5]/div/input", "400");//Enter Amount
	  TestNGThread.sleep(2000);
	  selenium.type("//*[@id='PaymentEntryWindow_txtTdsAmount']", "300");//Tds Amount
	  selenium.type("//*[@id='PaymentEntryWindow_txtNarration']", "Payment");
	  TestNGThread.sleep(2000);
	  selenium.click("Xpath=html/body/form/div[13]/div[2]/div[1]/div/div/div/div/div[4]/div/div[2]/div[1]/div/div/div/div/table[1]/tbody/tr[2]/td[8]/div/table/tbody/tr/td[2]/em/button");//Insert Button
	  TestNGThread.sleep(2000);
	  selenium.click("Xpath=html/body/form/div[13]/div[2]/div[1]/div/div/div/div/div[5]/div/table/tbody/tr/td[3]/table/tbody/tr/td[2]/em/button");//Save button
	  TestNGThread.sleep(5000);
	  selenium.click("Xpath=html/body/div[16]/div[2]/div[2]/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/em/button");//Ok Confirmation
	  TestNGThread.sleep(4000);
	  selenium.click("Xpath=html/body/form/div[13]/div[2]/div[1]/div/div/div/div/div[5]/div/table/tbody/tr/td[6]/table/tbody/tr/td[2]/em/button");//Close button
	  selenium.selectWindow(null);
	  TestNGThread.sleep(3000);
	  System.out.println("****************End of Payments Entry*************************");
	}
	catch (Exception e) {
		verificationErrors.append("Payment Entry Failed Reason Is....."+e.toString());
		verificationErrors.append("\n");
	}
}

private void daybook(String Voucher_No,String Amount,String TDS_Amount)
{
	try
	{
		
	  TestNGThread.sleep(2000);
	  
	  
	  selenium.click("//*[@id='ext-gen171']/div/li[3]/ul/li[1]/div");//Daybook
	  TestNGThread.sleep(3000);
	  selenium.click("Xpath=html/body/form/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr/td[5]/div/table/tbody/tr/td[2]/em/button");//show data
	  TestNGThread.sleep(2000);


 
	  //For Loop
	  selenium.selectFrame("3037_IFrame");
	  TestNGThread.sleep(2000);



	  int Count_of_Daybook=(Integer) selenium.getXpathCount(".//*[@id='ext-gen96']/div");
	  System.out.println("Number of Rows in Daybook:"+Count_of_Daybook);
	  
	  for(int i=1;i<=Count_of_Daybook;i++){
	  
	  String particulars=selenium.getText("Xpath=html/body/form/div[3]/div[2]/div[1]/div/div/div/div/div[2]/div[1]/div/div[1]/div[2]/div/div["+i+"]/table/tbody/tr/td[6]/div");
	  String debit=selenium.getText("Xpath=html/body/form/div[3]/div[2]/div[1]/div/div/div/div/div[2]/div[1]/div/div[1]/div[2]/div/div["+i+"]/table/tbody/tr/td[7]/div");
	  String credit=selenium.getText("Xpath=html/body/form/div[3]/div[2]/div[1]/div/div/div/div/div[2]/div[1]/div/div[1]/div[2]/div/div["+i+"]/table/tbody/tr/td[8]/div");
	  
	  System.out.println(particulars +"-----"+debit+"----"+credit);
	  
	  if(particulars.contains(Voucher_No) && debit.equalsIgnoreCase(Amount) && "0".equalsIgnoreCase(credit))
	  {
		  System.out.println("This is Debit Record");
	  }
	  
	  
	  
	  if(particulars.contains(Voucher_No) && "0".equalsIgnoreCase(debit) && Amount.equalsIgnoreCase(credit))
	  {
		  System.out.println("This is Credit Record");
	  }
	  
	  
	  if((particulars.contains(Voucher_No)) && TDS_Amount.equalsIgnoreCase(debit) && "0".equalsIgnoreCase(credit))
	  {
		  System.out.println("This is TDS debit record");
	  }
	  
	  if((particulars.contains(Voucher_No) && "0".equalsIgnoreCase(debit) && TDS_Amount.equalsIgnoreCase(credit)))
	  {
		  System.out.println("This is TDS credit record");
	  }
	  
	  }
	  
	 TestNGThread.sleep(2000);
     selenium.selectWindow(null);
     System.out.println("*********End of DayBook*****************************");
}
	catch (Exception e) {
		verificationErrors.append("DayBook Failed, Reason Is......"+e);
		verificationErrors.append("\n");
	}
}
	  
private void cashBook(String Act_Name, String Amount, String TDS_Amount,
		String Narration) throws InterruptedException {
	try{
		
	
	selenium.click("//*[@id='ext-gen171']/div/li[3]/ul/li[2]/div");//Cash Book
	  
	  TestNGThread.sleep(4000);
	  selenium.selectFrame("3038_IFrame");
	  TestNGThread.sleep(3000);
	  selenium.click("//*[@id='btnShowdata']/tbody/tr/td[2]");//Show Data
	  TestNGThread.sleep(4000);
	  
	  	    
	  int count_of_Cashbook=(Integer) selenium.getXpathCount(".//*[@id='ext-gen147']/div");
	  System.out.println("Number of Records in Cash Book:"+count_of_Cashbook);
	  
	  if(selenium.isElementPresent("Xpath=html/body/div[8]/div[1]/div/div/div/span"))
	  {
		  verificationErrors.append("CashBook Failed, Reason Is:No records");
		  verificationErrors.append("\n");
	  }
/*	  if(count_of_Cashbook==0)
	  {
		  verificationErrors.append("CashBook Failed, Reason Is:No records");
	  }
*/	  else
	  {
	  
	  for(int i=1;i<=count_of_Cashbook;i++)
	  {
		  String Particulars_Payments=selenium.getText("//*[@id='ext-gen147']/div["+i+"]/table/tbody/tr/td[9]/div");
		  String Amount_Payments=selenium.getText("//*[@id='ext-gen147']/div["+i+"]/table/tbody/tr/td[10]/div");
		  
		  
		  System.out.println(Particulars_Payments+"----------"+Amount_Payments);
		  
		  if(Particulars_Payments.contains(Act_Name) && Amount_Payments.contains(Amount) && Particulars_Payments.contains(Narration))
		  {
			  System.out.println("THis is Amount record");
		  }
		  
		  if(Particulars_Payments.contains(Act_Name)&& Amount_Payments.contains(TDS_Amount)&& Particulars_Payments.contains(Narration))
		  {
			  System.out.println("This is Tds record");
		  }
		  
		  String Receipts_particulars=selenium.getText("//*[@id='ext-gen147']/div["+i+"]/table/tbody/tr/td[5]/div");
		  String Amount_Receipts=selenium.getText("//*[@id='ext-gen147']/div["+i+"]/table/tbody/tr/td[6]/div");
		  
		  System.out.println(Receipts_particulars+"------------"+Amount_Receipts);
		  
		  if(Receipts_particulars.contains(Act_Name) && Amount_Receipts.contains(TDS_Amount))
		  {
			  System.out.println("This is Tax record");
		  }
		  
	  }
	  }
	  selenium.selectWindow(null);
	  System.out.println("*****************End of Cash Book*****************************");
	}
	catch (Exception e) {
		verificationErrors.append("CashBook Failed, Reason Is"+e);
		verificationErrors.append("\n");
	}
	  
	  
}


private void ledgerAccount(String Act_Name, String Voucher_No, String Amount,
		String TDS_Amount) throws InterruptedException {
	try{
		
	
	  selenium.click("//*[@id='ext-gen171']/div/li[3]/ul/li[3]/div");//Ledger Account
	  TestNGThread.sleep(2000);
	  selenium.selectFrame("3039_IFrame");
	  //TestNGThread.sleep(2000);
	  
	  selenium.click("Xpath=html/body/form/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr/td[2]/div/div/img");//Arrow Mark
	  
	 // selenium.click("//*[@id='ext-gen126']");//Arrow Mark
	  TestNGThread.sleep(4000);
	  //selenium.click("//*[@id='ext-gen332']/div[19]");//
	  //System.out.println(selenium.getText("Xpath=html/body/div[7]/div/div[19]"));
	  selenium.click("Xpath=html/body/div[7]/div/div[19]");//select 'cash'
	  
	  
	  TestNGThread.sleep(2000);
	  selenium.click("//*[@id='ext-gen138']");//Arrow
	  TestNGThread.sleep(2000);
	  selenium.click("//*[@id='ext-gen317']/div");//select
	  TestNGThread.sleep(2000);
	  selenium.click("//*[@id='btnshowdata']/tbody/tr/td[2]");//show Data
	  TestNGThread.sleep(2000);
	  
	  int count_Ledger_Act=(Integer) selenium.getXpathCount(".//*[@id='ext-gen99']/div");
	  System.out.println("Number of Rows for first entry:"+count_Ledger_Act);
	  
	  for(int i=1;i<=count_Ledger_Act;i++){
		  String Ledger_Particulars=selenium.getText("//*[@id='ext-gen99']/div["+i+"]/table/tbody/tr/td[6]/div");
		  String Ledger_Credit=selenium.getText("//*[@id='ext-gen99']/div["+i+"]/table/tbody/tr/td[8]/div");
		  
		  if(Ledger_Particulars.contains(Act_Name) && Ledger_Particulars.contains(Voucher_No)&& Ledger_Credit.contains(Amount))
		  {
			  System.out.println("This is Credit record of Ledger");
		  }
	  }
	  
	  selenium.click("//*[@id='ext-gen126']");//Arrow Mark
	  TestNGThread.sleep(2000);
	  selenium.click("Xpath=html/body/div[7]/div/div[43]");//selecting Income
	  TestNGThread.sleep(2000);
	  selenium.click("//*[@id='ext-gen138']");//Arrow
	  TestNGThread.sleep(2000);
	  selenium.click("Xpath=html/body/div[6]/div/div[1]");//select act name
	  TestNGThread.sleep(2000);
	  selenium.click("//*[@id='btnshowdata']/tbody/tr/td[2]");//show Data
	  TestNGThread.sleep(2000);

	  int count_Ledger_Act_Income=(Integer) selenium.getXpathCount(".//*[@id='ext-gen99']/div");
	  System.out.println("Number of rows in second entry:"+count_Ledger_Act_Income);
	  
	  for(int i=1;i<=count_Ledger_Act_Income;i++){
		  String Ledger_Particulars=selenium.getText("//*[@id='ext-gen99']/div["+i+"]/table/tbody/tr/td[6]/div");
		  String Ledger_Debit=selenium.getText("//*[@id='ext-gen99']/div["+i+"]/table/tbody/tr/td[7]/div");
		  String Ledger_Credit=selenium.getText("//*[@id='ext-gen99']/div["+i+"]/table/tbody/tr/td[8]/div");
		  
		  System.out.println(Ledger_Particulars+"---------"+Ledger_Debit+"---------"+Ledger_Credit);
		  if(Ledger_Particulars.contains(Voucher_No) && Ledger_Debit.contains(Amount))
		  {
			  System.out.println("INcome Debit Record");
		  }
		  if(Ledger_Particulars.contains(Voucher_No) && Ledger_Credit.contains(TDS_Amount))
		  {
			  System.out.println("Income Credit Tds Record");
		  }

	 }
	  
	  
	  selenium.click("//*[@id='ext-gen126']");//Arrow Mark
	  TestNGThread.sleep(2000);
	  selenium.click("Xpath=html/body/div[7]/div/div[37]");//selecting Expense
	  TestNGThread.sleep(2000);
	  selenium.click("//*[@id='ext-gen138']");//Arrow
	  TestNGThread.sleep(2000);
	  selenium.click("Xpath=html/body/div[6]/div/div[94]");//select act name Tds ACt
	  TestNGThread.sleep(2000);
	  selenium.click("//*[@id='btnshowdata']/tbody/tr/td[2]");//show Data
	  TestNGThread.sleep(2000);

	  int count_Ledger_Act_Expense=(Integer) selenium.getXpathCount(".//*[@id='ext-gen99']/div");
	  System.out.println("Number of rows in third entry:"+count_Ledger_Act_Expense);
	  
	  for(int i=1;i<=count_Ledger_Act_Expense;i++){
		  String Ledger_Particulars=selenium.getText("//*[@id='ext-gen99']/div["+i+"]/table/tbody/tr/td[6]/div");
		  String Ledger_Debit=selenium.getText("//*[@id='ext-gen99']/div["+i+"]/table/tbody/tr/td[7]/div");
		  System.out.println(Ledger_Particulars+"------"+Ledger_Debit);
		 
		  if(Ledger_Particulars.contains(Voucher_No) && Ledger_Debit.contains(TDS_Amount))
		  {
			  System.out.println("Expense Debit Record");
		  }

	 }
	  selenium.selectWindow(null);
	  System.out.println("*****************End of Ledger Account***************************");
	}
	catch (Exception e) {
		verificationErrors.append("Ledger Account Failed,Reason is"+e);
		verificationErrors.append("\n");
	}
}

private void finalAccounts(String act_Name, String amount, String tDS_Amount,String paymnt_type)
{
	try{
		
		TestNGThread.sleep(2000);
		selenium.click("Xpath=html/body/form/div[2]/div/div/div/div/div/div/div/div[2]/div[2]/div/ul/div/li[3]/ul/li[4]/div");//Final Accounts
		TestNGThread.sleep(2000);
		selenium.selectFrame("3040_IFrame");
		TestNGThread.sleep(2000);
		selenium.click("//*[@id='btnshowdata']/tbody/tr/td[2]");//show data
		TestNGThread.sleep(2000);
		int count_of_Final=(Integer) selenium.getXpathCount(".//*[@id='ext-gen91']/div");
		System.out.println("NUmber of rows in Final Accounts:"+count_of_Final);
		for(int i=1;i<=count_of_Final;i++){
			String AcountName=selenium.getText("Xpath=html/body/form/div[3]/div[2]/div[1]/div/div/div/div/div[2]/div[1]/div/div[1]/div[2]/div/div["+i+"]/table/tbody/tr/td[2]/div");
			String Debit=selenium.getText("Xpath=html/body/form/div[3]/div[2]/div[1]/div/div/div/div/div[2]/div[1]/div/div[1]/div[2]/div/div["+i+"]/table/tbody/tr/td[4]/div");
			String Credit=selenium.getText("Xpath=html/body/form/div[3]/div[2]/div[1]/div/div/div/div/div[2]/div[1]/div/div[1]/div[2]/div/div["+i+"]/table/tbody/tr/td[5]/div");
			
			System.out.println(AcountName+"----"+Debit+"--------"+Credit);
			if(AcountName.contains(act_Name)&& Debit.contains(amount)&& Credit.contains(tDS_Amount))
			{
				System.out.println("This is income record");
			}
			if(AcountName.contains(paymnt_type) && Credit.contains(amount))
			{
				System.out.println("This is Cash record");
			}
			if(AcountName.contains("TDS Account") && Debit.contains(tDS_Amount))
			{
				System.out.println("This is expense record");
			}
			
		}
		selenium.selectWindow(null);
		System.out.println("*********End of Final Accounts*********************");
		
	}
	catch (Exception e) {
		System.out.println("\n");
		verificationErrors.append("Final Accounts Failed,Reason is....."+e);
				
	}
}
	  

private void viewEntries()

{
	try{
		
		selenium.click("//*[@id='ext-gen171']/div/li[3]/ul/li[5]/div/a/span");//view Entries
		TestNGThread.sleep(2000);
		selenium.selectFrame("3069_IFrame");
		TestNGThread.sleep(2000);
		selenium.click("Xpath=html/body/form/div[6]/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[1]/div/div/div/div/table[1]/tbody/tr[1]/td[2]/div/div/img");
		TestNGThread.sleep(2000);
		selenium.click("Xpath=html/body/div[3]/div/div[1]");//Payments
		TestNGThread.sleep(2000);
		selenium.click("//*[@id='btnprint']/tbody/tr/td[2]");//Print
		TestNGThread.sleep(3000);
				
		
		selenium.isElementPresent("//*[@id='Concatinate1']/table/tbody/tr/td/table/tbody/tr/td/span");
		TestNGThread.sleep(3000);
		
/*		selenium.selectFrame("1377239379351_iframe");
		TestNGThread.sleep(2000);
		String txt=selenium.getText("Xpath=html/body/div[1]/div/div[49]/table/tbody/tr/td/table/tbody/tr/td/span");
		System.out.println("txt:"+txt);
		
*/		
		selenium.selectWindow(null);
		System.out.println("*************End of  View Entries******************");
		
	}
	catch(Exception e){
		verificationErrors.append("View Entries Failed Reason Is....."+e.toString());
		verificationErrors.append("\n");
	}
}
  

private void income_Expenditure(String act_Name, String amount) throws InterruptedException
{
	try{
		
	
	selenium.click("//*[@id='ext-gen171']/div/li[4]/ul/li[1]/div/a/span");//Income and expenditure
	TestNGThread.sleep(2000);
	selenium.selectFrame("3041_IFrame");
	TestNGThread.sleep(2000);
	selenium.click("//*[@id='btnshowdata']/tbody/tr/td[2]");//show data
	TestNGThread.sleep(2000);
	int count_of_Income_Expen=(Integer) selenium.getXpathCount(".//*[@id='ext-gen135']/div");
	System.out.println("Number of rows in Income And expenditure is:"+count_of_Income_Expen);
	
	for(int i=1;i<=count_of_Income_Expen;i++){
		String Parti_Expenditure=selenium.getText("//*[@id='ext-gen135']/div["+i+"]/table/tbody/tr/td[4]/div");
		String Amt_Expenditure=selenium.getText("//*[@id='ext-gen135']/div["+i+"]/table/tbody/tr/td[5]/div");
		
		System.out.println(Parti_Expenditure+"-----------------"+Amt_Expenditure);
		if(Parti_Expenditure.contains(act_Name) && Amt_Expenditure.contains(amount))
		{
			System.out.println("This is Expenditure Record");
		}
	}
	selenium.selectWindow(null);	
	System.out.println("******************End of Income and Expenditure*********************");
	}
	catch(Exception e){
		verificationErrors.append("Income and expenditure failed,Reason is........"+e);
	}
	
}

private void payments_Receipts(String act_Name, String amount, String tDS_Amount)
{
	try{
		selenium.click("//*[@id='ext-gen171']/div/li[4]/ul/li[2]/div/a/span");//Payments and Receipts
		TestNGThread.sleep(2000);
		selenium.selectFrame("3042_IFrame");
		TestNGThread.sleep(2000);
		selenium.click("//*[@id='btnShowdata']/tbody/tr/td[2]");//show data
		TestNGThread.sleep(4000);
		int count_Pay_Recp=(Integer) selenium.getXpathCount(".//*[@id='ext-gen133']/div");
		System.out.println("Number of rows in Payments and Receipts:"+count_Pay_Recp);
		
		for(int i=1;i<=count_Pay_Recp;i++){
			String particulars_Payments=selenium.getText("//*[@id='ext-gen133']/div["+i+"]/table/tbody/tr/td[4]/div");
			String amount_Payments=selenium.getText("//*[@id='ext-gen133']/div["+i+"]/table/tbody/tr/td[5]/div");
			String Particulars_Receipts=selenium.getText("//*[@id='ext-gen133']/div["+i+"]/table/tbody/tr/td[2]/div");
			String amount_Receipts=selenium.getText("//*[@id='ext-gen133']/div["+i+"]/table/tbody/tr/td[3]/div");
			
			System.out.println(Particulars_Receipts+"-----"+amount_Receipts+"---------"+particulars_Payments+"------"+amount_Payments);
			
			if(particulars_Payments.contains(act_Name) && amount_Payments.contains(amount))
			{
				System.out.println("This is Payments(Amount) record ");
			}
			if(particulars_Payments.contains(act_Name)&& amount_Payments.contains(tDS_Amount))
			{
				System.out.println("This is Payments(TDS) record");
			}
			if(Particulars_Receipts.contains("TDS Amount") && amount_Receipts.contains(tDS_Amount))
			{
				System.out.println("TDS Record");
			}
		}
		selenium.selectWindow(null);
		System.out.println("***************End of Payments and REceipts*************");
	}
	catch(Exception e){
		verificationErrors.append("Payments receipts failed,Reason is....."+e);
	}
}


private void secretary_Reports() throws InterruptedException
{
	try{
		
	
	selenium.click("//*[@id='ext-gen235']");//Reports
	selenium.click("//*[@id='ext-gen239']/div/li/ul/li[2]/div");//Financial
	selenium.selectFrame("3081_IFrame");
	TestNGThread.sleep(2000);
	selenium.click("//*[@id='btnMore']/tbody/tr/td[3]");//More button
	selenium.selectWindow(null);
	TestNGThread.sleep(8000);
	selenium.selectFrame("103_IFrame");
	TestNGThread.sleep(2000);
	selenium.click("//*[@id='ext-gen69']");//Income and Expenditure
	selenium.click("Xpath=html/body/form/div[6]/div[2]/div[1]/div/div/div/div/table[1]/tbody/tr/td[2]/div/div/div[2]/div[1]/div/div/div/div/table/tbody/tr[1]/td[2]/div/div/img");//arrow mark
	TestNGThread.sleep(2000);
	selenium.click("Xpath=html/body/div[3]/div/div[2]");//selecting yard
	selenium.click("//*[@id='btnPrint']/tbody/tr/td[2]");//View Report
	TestNGThread.sleep(5000);
	
	
	selenium.click("//*[@id='ext-gen86']");//Payments and Receipts
	selenium.click("Xpath=html/body/form/div[6]/div[2]/div[1]/div/div/div/div/table[1]/tbody/tr/td[2]/div/div/div[2]/div[1]/div/div/div/div/table/tbody/tr[1]/td[2]/div/div/img");//arrow mark
	TestNGThread.sleep(2000);
	selenium.click("Xpath=html/body/div[3]/div/div[2]");//selecting yard
	selenium.click("//*[@id='btnPrint']/tbody/tr/td[2]");//View Report
	TestNGThread.sleep(2000);
	
	selenium.click("//*[@id='ext-gen137']");//Group wise
	selenium.click("Xpath=html/body/form/div[6]/div[2]/div[1]/div/div/div/div/table[1]/tbody/tr/td[2]/div/div/div[2]/div[1]/div/div/div/div/table/tbody/tr[1]/td[2]/div/div/img");//arrow mark
	TestNGThread.sleep(2000);
	selenium.click("Xpath=html/body/div[3]/div/div[2]");//selecting yard
    TestNGThread.sleep(2000);
    selenium.click("Xpath=html/body/form/div[6]/div[2]/div[1]/div/div/div/div/table[1]/tbody/tr/td[2]/div/div/div[2]/div[1]/div/div/div/div/table/tbody/tr[2]/td[2]/div/div/img");
    TestNGThread.sleep(2000);
    selenium.click("Xpath=html/body/div[4]/div/div[18]");//selecting Cash
	selenium.click("//*[@id='btnPrint']/tbody/tr/td[2]");//View Report
	TestNGThread.sleep(2000);
	selenium.click("Xpath=html/body/div[4]/div/div[42]");//Selecting Income
	TestNGThread.sleep(2000);
	selenium.click("//*[@id='btnPrint']/tbody/tr/td[2]");//View Report
	TestNGThread.sleep(5000);

	selenium.selectWindow(null);
	System.out.println("*******End of secretary reports**************");
	}
	catch(Exception e){
		verificationErrors.append("Secretary Reports Failed..Reason is........"+e);
	}
	
	
	
}



@BeforeTest //precondition that the application should display login home page
  public void trader_login() throws InterruptedException  {
	  selenium=new DefaultSelenium("localhost",4444,"*firefox","http://");
	  selenium.start();
	  selenium.windowMaximize();
	  selenium.open("http://202.65.158.109:202/");
	  selenium.type("//*[@id='txtUsername']", "gvtdat");
	  selenium.type("//*[@id='txtPassword']", "vsspl");
	  selenium.click("//*[@id='ext-gen16']"); 

	  
	  TestNGThread.sleep(7000);
  }
}
