package excelOperations;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class DataManagementDynamicDemo 
{
	
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> s)
  {
	  System.out.println(s.get("UserName"));
	  System.out.println(s.get("UserPassword"));
  }

  @DataProvider
  public Object[][] getData() throws Exception 
  {
	    ExcelAPI e = new ExcelAPI("C:\\Users\\ravi\\Desktop\\suitex.xlsx");
		String sheetName = "data";
		String testcaseName = "LoginTest";
		return DataUtils.getTestData(e, sheetName, testcaseName);
  }
}
