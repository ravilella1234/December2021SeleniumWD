package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PaymentManager 
{
  @Parameters({"action"})
  @Test
  public void makePayment(String paymentType,ITestContext context) 
  {
	  if(paymentType.equals("Pay@Hotel"))
		  System.out.println("make Payment @Hotel");
	  else
		  System.out.println("make payment @electronic pay");
	  
	  //Booking Number
	  String bookingID = "ravi1234";
	  System.out.println(bookingID);
	  context.setAttribute("BID", bookingID);
  }
  
  
  @Test
  public void applyDiscount() 
  {
	  System.out.println("applyDiscount");
  }
}
