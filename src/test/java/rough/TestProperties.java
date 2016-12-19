package rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestProperties {
    public static WebDriver driver;
    public static Logger log= Logger.getLogger("devpinoyLogger");
    
	public static void main(String[] args) throws IOException {

Properties OR = new Properties();
FileInputStream fis = new FileInputStream("C:\\poltu\\java\\poltu1\\src\\test\\resources\\properties\\OR.properties");
OR.load(fis);
log.debug("OR Property file loaded");

Properties config = new Properties();
fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
config.load(fis);
log.debug("config Property file loaded");

//driver.findElement(By.xpath(OR.getProperty("username"))).click();
System.out.println(OR.getProperty("username"));
System.out.println(config.getProperty("testsiteurl"));

if(config.getProperty("browser").equals("firefox"))
	
{
	driver= new FirefoxDriver();
	log.debug("firefox launched");
}

else if(config.getProperty("browser").equals("ie"))
	
{
	driver= new InternetExplorerDriver();
}
else if(config.getProperty("browser").equals("chrome"))
	
{
	driver= new ChromeDriver();
	log.debug("chrome loaded");
}

driver.get(config.getProperty("testsiteurl"));
log.debug("navigated to the url" + config.getProperty("testsiteurl"));
//driver.findElement(By.xpath(Locators.username)).sendKeys("abcdef@gmail.com");
driver.findElement(By.xpath(OR.getProperty("username"))).sendKeys("abcdef@gmail.com");
driver.findElement(By.cssSelector(OR.getProperty("nextBtn"))).click();
	}

}
