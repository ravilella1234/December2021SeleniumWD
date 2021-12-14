package icici.loans.eduloans;

import java.util.Scanner;

public class MathOperations 
{

	public static void main(String[] args) 
	{
		int a,b, result;
		char choice;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.println("Enter the choice : ");
			choice = sc.next().charAt(0);
			
			switch (choice) 
			{
				case '1':System.out.println("Enter values for Addition :");	
						a = sc.nextInt();
						b = sc.nextInt();
						result = a+b;
						System.out.println("Addition Result is : " + result);
					break;
					
				case '2':System.out.println("Enter values for Substraction :");	
					a = sc.nextInt();
					b = sc.nextInt();
					result = a-b;
					System.out.println("Substraction Result is : " + result);
					
					break;
					
				case '3':System.out.println("Enter values for Multiplication :");	
					a = sc.nextInt();
					b = sc.nextInt();
					result = a*b;
					System.out.println("Multiplication Result is : " + result);
					
					break;
					
				case '4':System.out.println("Enter values for Division :");	
					a = sc.nextInt();
					b = sc.nextInt();
					result = a/b;
					System.out.println("Division Result is : " + result);
		
					break;
					
				case '5':
					System.exit(0);
					break;
	
				default:System.out.println("Wrong Choice Entered!!!!! . Please enter choice (1-5)");
					break;
			}
			
		}while(choice!=5);

	}

}
