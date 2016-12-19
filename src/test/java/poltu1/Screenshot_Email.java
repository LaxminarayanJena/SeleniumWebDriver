package poltu1;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.TestConfig;
import utility.monitoringMail;

public class Screenshot_Email {
public static WebDriver driver;
public static String mailscreenshotpath;
public static void captureScreenshot() throws IOException
{
	Calendar cal = new GregorianCalendar();
	int year=cal.get(Calendar.YEAR);
	int month=cal.get(Calendar.MONTH);
	int day=cal.get(Calendar.HOUR_OF_DAY);
	int date=cal.get(Calendar.DATE);
	int min=cal.get(Calendar.MINUTE);
	int sec=cal.get(Calendar.SECOND);
	mailscreenshotpath = System.getProperty("user.dir")+"\\src\\test\\resources\\screenshot\\"+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec+".jpeg"; 
	
	File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(scr, new File("C:\\poltu\\java\\poltu1\\src\\test\\resources\\screenshot\\error.jpg"));
	FileUtils.copyFile(scr, new File(mailscreenshotpath));
}
	public static void main(String[] args) throws IOException, AddressException, MessagingException {
		 driver= new ChromeDriver();
		driver.get("http://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.manage().window().maximize();
		
		List<WebElement> frames= driver.findElements(By.tagName("iframe"));
		System.out.println("total frame size is " + frames.size());
		for(WebElement frame : frames)
		{
			System.out.println(frame.getAttribute("id"));
		}
		//driver.manage().timeouts().implicitlyWait(5L,TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		
		
		driver.findElement(By.xpath("html/body/form/input[3]")).click();
		captureScreenshot();
		monitoringMail mail= new monitoringMail();
		mail.sendMail(TestConfig.server, TestConfig.from,TestConfig.to, TestConfig.subject, TestConfig.messageBody, mailscreenshotpath, TestConfig.attachmentName);
		driver.switchTo().defaultContent();
	}

}
