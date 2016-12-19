package poltu1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class tabsandpopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.hdfcbank.com/");
		
		System.out.println("------------printing first window id----------");
		Set<String> winids =driver.getWindowHandles();
		Iterator<String> iterate=winids.iterator();
		String first_window= iterate.next();
		System.out.println(first_window);
		driver.findElement(By.xpath(".//*[@id='loginsubmit']")).click();  //clciking on login button
		
	
		System.out.println("------------printing second window id----------");
		
		 winids =driver.getWindowHandles();
	     iterate=winids.iterator();
	     System.out.println(iterate.next()); // first window id
	     String second_window=iterate.next(); // second window id
	     System.out.println(second_window);
	     driver.switchTo().window(second_window);
		driver.findElement(By.xpath(".//div[1]/ul/li[2]/a")).click();  //clicking on apply now
		
		
		System.out.println("------------printing third window id----------");
		
		 winids =driver.getWindowHandles();
	     iterate=winids.iterator();
	     System.out.println(iterate.next()); // first window id
	     System.out.println(iterate.next()); // second window id
	   String third_window= (iterate.next());
	   System.out.println(third_window);//third window id
	   
	     driver.switchTo().window(third_window);
		WebElement dropdown=driver.findElement(By.xpath(".//*[@id='eForm_form_propertyCity_value']"));
		Select select =new Select(dropdown);
		select.selectByVisibleText("Ghaziabad");
		
driver.close();
driver.switchTo().window(second_window);
driver.close();
driver.switchTo().window(first_window);
driver.close();
	}

}
