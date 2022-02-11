package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class CustomerCommunication 
{
  @Test
  public void checkMail(ITestContext context) 
  {
	  System.out.println("checkMail");
	  String bookingID = (String)context.getAttribute("BID");
	  System.out.println(bookingID);
  }
  
  @Test
  public void checkMobile() 
  {
	  System.out.println("checkMobile");
  }
}
