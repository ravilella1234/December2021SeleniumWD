package icici.loans.eduloans;

import java.util.Scanner;

public class StudentGradeCalculation 
{

	public static void main(String[] args) 
	{
		int[] marks = new int[5];
		float sum=0.0f,avg=0.0f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks Obtained in 5 Subjects :");
		for(int i=0;i<marks.length;i++)
		{
			marks[i] = sc.nextInt();
			sum = sum + marks[i];
		}
		System.out.println("Sum of 5 subjects : "+ sum );
		
		avg = sum/marks.length;
		System.out.println("Average os Subjects is : " + avg);
		
		System.out.println("Your Grade is : ");
		if(avg>80)
		{
			System.out.println("A");
		}
		else if(avg>60 && avg<=80)
		{
			System.out.println("B");
		}
		else if(avg>40 && avg<=60)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("D");
		}
		

	}

}
