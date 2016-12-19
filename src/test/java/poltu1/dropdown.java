package poltu1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
driver.get("http://wikipedia.org");
WebElement dropdown=driver.findElement(By.xpath(".//*[@id='searchLanguage']"));
Select select =new Select(dropdown);
select.selectByValue("fa");
 /*List<WebElement> values= driver.findElements(By.tagName("option"));
 System.out.println(values.size());
 for (int i=0; i<values.size();i++)
 {
	System.out.println(values.get(i).getAttribute("lang")); 
	System.out.println(values.get(i).getText()); 
 }
//Printing all links in website
 
 //List<WebElement>links = driver.findElements(By.tagName("a"));
 //for (WebElement link:links)
 {
//	 System.out.println(link.getText()+ "url is:" + link.getAttribute("href"));
 }*/
 
 
 //Printing names of a specific block
 
 WebElement block= driver.findElement(By.xpath(".//*[@id='www-wikipedia-org']/div[6]/div[2]"));
 List<WebElement>link1 = block.findElements(By.tagName("a"));
 for (WebElement link:link1)
 {
	 //System.out.println(link.getText()+ "url is:" + link.getAttribute("href"));
	 System.out.println(link.getText());
 }
	}
	
	
	

}
