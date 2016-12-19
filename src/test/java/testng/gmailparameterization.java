package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelReader;

public class gmailparameterization {
	
	public static ExcelReader excel;
	public static WebDriver driver;

	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void teardown()
	{
	 driver.quit();	
	}
	
	
	@Test(dataProvider ="getData")
	public void doLogin(String username, String Password)
	{
		driver.get("http://gmail.com");
	driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys(username);
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys(Password);
	   
		
	}
	@DataProvider
	public static Object[][] getData()
	{
		
		if (excel==null){
			excel= new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\testdata.xlsx");
		}
		String sheetName="LoginTest";
		int rows= excel.getRowCount(sheetName);
		int cols= excel.getColumnCount(sheetName);
		
		//excel.setCellData(sheetName, "results", 2, "PASS");
		
		Object [][] data= new Object[rows-1][cols];
		
		for(int rowNum =2 ; rowNum<=rows; rowNum++)
		{
			for(int colNum = 0; colNum< cols; colNum++)	
			{
				data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
			}
		}
		
		return data;
		 
	}
}
