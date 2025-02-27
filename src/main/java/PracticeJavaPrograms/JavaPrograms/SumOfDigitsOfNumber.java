package PracticeJavaPrograms.JavaPrograms;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int b=number;
		int reminder=0;
		int sumOfNumber=0;
		
		while(number!=0)
		{
			reminder=number%10;
			sumOfNumber+=reminder;
			number/=10;
		}
		System.out.println("Sum of digits of "+b+" is "+sumOfNumber);
	}

}
