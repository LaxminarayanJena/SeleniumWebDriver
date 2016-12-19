package poltu1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class testsample {

	public static void main(String[] args) {
		//DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		//caps.setCapability("EnableNativeEvents", false);
		//caps.setCapability("ignoreZoomSetting", true);
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new InternetExplorerDriver(caps);
		driver.get("http://google.com");
		String actual_title= driver.getTitle();
		String expected_title= "Google";
		if (actual_title.equals(expected_title))
				{
			System.out.println("testcase pass");
				}
		else
		{
			System.out.println("testcase fail" );
		}
//driver.close();
//driver.quit();
	}

}
