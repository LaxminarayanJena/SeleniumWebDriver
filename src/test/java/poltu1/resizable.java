package poltu1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resizable {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/resizable/default.html");
WebElement rs= driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
Actions action = new Actions(driver);
action.dragAndDropBy(rs, 400, 800).perform();;

		
	}

}
