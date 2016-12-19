package poltu1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testalert {

	public static void main(String[] args) throws InterruptedException {
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);
	
		//WebDriver driver = new ChromeDriver();
	driver.get("http://www.rediffmail.com/cgi-bin/login.cgi");
	//driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[1]/input")).click();
	//driver.switchTo().alert().accept();
	
	
	

	}

}
