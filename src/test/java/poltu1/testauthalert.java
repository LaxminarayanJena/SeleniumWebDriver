package poltu1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testauthalert {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://grcdev:nearlythere@getproactiv-ca.stg01.grdev.com/");
		driver.manage().window().maximize();
		

	}

}
