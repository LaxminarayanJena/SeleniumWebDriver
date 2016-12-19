package poltu1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {

WebDriver driver= new ChromeDriver();
driver.get("http://jqueryui.com/resources/demos/slider/default.html");
WebElement slider= driver.findElement(By.xpath(".//*[@id='slider']/span"));
Actions action =new Actions(driver);
action.dragAndDropBy(slider, 900, 0).perform();


	}

}
