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

public class frame {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
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
		driver.switchTo().defaultContent();
	}

}
