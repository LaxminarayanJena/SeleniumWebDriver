package poltu1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragandropable {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		WebElement draggable= driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement droppable= driver.findElement(By.xpath(".//*[@id='droppable']"));
		Actions action =new Actions(driver);
		action.dragAndDrop(draggable, droppable).perform();
		

	}

}
