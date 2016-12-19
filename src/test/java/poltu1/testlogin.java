package poltu1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testlogin {

	public static void main(String[] args) {
		
WebDriver driver = new FirefoxDriver();

driver.get("http://gmail.com");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
WebDriverWait wait= new WebDriverWait(driver,10);
 //WebElement email= driver.findElement(By.xpath(".//*[@id='Email']"));
 //email.sendKeys("abc@gmail.com");
 //System.out.println(email);
driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("defe4rdx.33dfef@gmail.com");
driver.findElement(By.id("next")).click();
System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='errormsg_0_Email']"))).getText());
//driver.findElement(By.name("Passwd")).sendKeys("abdbdbd");
driver.close();
driver.quit();
	}

}
