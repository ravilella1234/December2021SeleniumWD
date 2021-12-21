package icici.loans.exceptions;

import java.util.Scanner;

public class UserDefinedException extends Exception
{

	public UserDefinedException(String string) 
	{
		super(string);
	}

	public static void main(String[] args) 
	{
		String str;
		Scanner sc  = new Scanner(System.in);
				
		while(true) 
		{
			System.out.println("Enter the 10-digit String :");
			str = sc.nextLine();
			try 
			{
				if (str.length() != 10) 
				{
					throw new UserDefinedException("Should be a 10 Character String");
				}
				else
				{
					System.out.println(str);
					break;
				}
			}
			catch (UserDefinedException e) 
			{
				e.printStackTrace();
			} 
		}
	}

}
