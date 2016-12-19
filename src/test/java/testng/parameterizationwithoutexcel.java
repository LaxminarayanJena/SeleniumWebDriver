package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelReader;

public class parameterizationwithoutexcel {
	

	
	@Test(dataProvider ="getData")
	public void doLogin(String username, String Password)
	{
		System.out.println(username + "----" + Password);
		
	}
	@DataProvider
	public static Object[][] getData()
	{
		Object [][] data= new Object[2][2];
		
		data[0][0]="username1";
		data[0][1]="password1";
		data[1][0]="username2";
		data[1][1]="password2";
		return data;
		
	}
}
