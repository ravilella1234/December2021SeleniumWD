package pack1;

import java.util.Arrays;

import org.testng.TestNG;

public class RunSuitesParallel 
{

	public static void main(String[] args) 
	{
		/*
		 * String[] s1 = {"r1","r2"};
		 * 
		 * String[] s2 = new String[3]; s2[0]="r1"; s2[1]="r2";
		 * 
		 * String[] s3 = new String[] {"R1","R2"};
		 */
		
		
		TestNG obj = new TestNG();
		obj.setTestSuites(Arrays.asList(new String[] {System.getProperty("user.dir")+"//megasuite.xml"}));
		obj.setSuiteThreadPoolSize(2);
		obj.run();
	}

}
