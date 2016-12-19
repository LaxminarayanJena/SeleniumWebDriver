package poltu1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class lucy {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("http://demos.telerik.com/kendo-ui/dropdownlist/index");
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		WebElement dropdown = driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div/span[1]/span/span[1]"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Grey");

	}
}
