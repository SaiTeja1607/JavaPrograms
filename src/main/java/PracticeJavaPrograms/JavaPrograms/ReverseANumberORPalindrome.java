package PracticeJavaPrograms.JavaPrograms;

import java.util.Scanner;

public class ReverseANumberORPalindrome {

	public static void main(String[] args) {


		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int b=a;
	int reverseNumber=0;
	
	while(a!=0)
	{
		int temp=a%10;
		reverseNumber=reverseNumber*10+temp;
		a=a/10;
	}
		if(b==reverseNumber)
		{
			System.out.println(b+"is a Palindrome");
			
		}
		else
		{
			System.out.println(b+"is not a palindrome");
			
		}

	}

}
