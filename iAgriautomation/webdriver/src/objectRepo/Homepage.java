package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
private WebDriver driver;
private static WebElement element;

public static WebElement txt_LoginName(WebDriver driver){
	element=driver.findElement(By.id("txtUsername"));
	return element;
}



}
