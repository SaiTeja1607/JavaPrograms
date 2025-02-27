package PracticeJavaPrograms.JavaPrograms;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		int b=a;
		int n= String.valueOf(a).length();
		int armstrongValue=0;
		
		while(a!=0)
		{
			int remainder=a%10;
			armstrongValue+=Math.pow(remainder, n);
			a/=10;
		}
		
		if(armstrongValue==a)
		{
			System.out.println(b+"is an armstrong number");
		}
		else
		{
			System.out.println(b+"is an Not armstrong number");
		}
		
		
		//Test adding branch		
		

	}

}
