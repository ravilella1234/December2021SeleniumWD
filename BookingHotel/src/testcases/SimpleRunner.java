package testcases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class SimpleRunner 
{

	public static void main(String[] args)
	{
		TestNG testng = new TestNG();
		
		XmlSuite mysuite = new XmlSuite();
		mysuite.setName("BookingSuite");
		ArrayList<XmlSuite> allsuites = new ArrayList<XmlSuite>();
		allsuites.add(mysuite);
		testng.setXmlSuites(allsuites);

		//1st testcase
		XmlTest createBooking = new XmlTest(mysuite);
		createBooking.setName("Create booking Test - Apply Discount -- Pay@Hotel");
		
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("action", "Pay@Hotel");
		createBooking.setParameters(parameters);
		
		List<XmlClass> testClasses = new ArrayList<XmlClass>();
		
		XmlClass testClass = new XmlClass("testcases.BookingSearch");
		List<XmlInclude> methods = new ArrayList<XmlInclude>();
		methods.add(new XmlInclude("searchHotel", 1));
		methods.add(new XmlInclude("selectHotel", 2));
		methods.add(new XmlInclude("enterGuestInfo", 3));
		testClass.setIncludedMethods(methods);
		testClasses.add(testClass);
		
		testClass = new XmlClass("testcases.PaymentManager");
		methods.add(new XmlInclude("applyDiscount", 1));
		methods.add(new XmlInclude("makePayment", 2));
		testClass.setIncludedMethods(methods);
		testClasses.add(testClass);
		
		testClass = new XmlClass("testcases.CustomerCommunication");
		methods.add(new XmlInclude("checkMail", 1));
		methods.add(new XmlInclude("checkMobile", 2));
		testClass.setIncludedMethods(methods);
		testClasses.add(testClass);
		
		createBooking.setXmlClasses(testClasses);
		testng.run();
		
	}

}
