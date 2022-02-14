package testcases;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class TestCaseRunner 
{

	public static void main(String[] args)
	{
		TestNG testng = new TestNG();
		
		XmlSuite mysuite = new XmlSuite();
		mysuite.setName("LoginSuite");
		
		List<XmlSuite> allsuites = new ArrayList<XmlSuite>();
		allsuites.add(mysuite);
		testng.setXmlSuites(allsuites);
		
		XmlTest test = new XmlTest(mysuite);
		test.setName("LoginTest");
		
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("testcases.LoginTest"));
		
		test.setXmlClasses(classes);
		
		testng.run();
		
	}

}
