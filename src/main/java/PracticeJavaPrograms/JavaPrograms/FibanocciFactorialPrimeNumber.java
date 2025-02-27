package PracticeJavaPrograms.JavaPrograms;

import java.util.ArrayList;

public class FibanocciFactorialPrimeNumber {

	public static void main(String[] args) {
		
		//Fibanocci series
		int a=0; 
		int b=1;
		System.out.print(a+" "+b);
		int next;
		for(int i=0; i<10; i++)
		{
			next=a+b;
			a=b;
			b=next;
			System.out.print(" "+next);	
		}
		
	//Second way of Fibanocci series
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(0);
		arr.add(1);
		
		for(int i=2; i<10; i++)
		{
			int ab =arr.get(i-2)+arr.get(i-1);
			arr.add(ab);
		}
		System.out.println("\n");
		System.out.println(arr);


	
	//Factorial of a number
	int fact=6;
	int result=1;
	for(int i=1; i<=fact; i++)
	{
		result*=i;
	}
System.out.println(result);

	//Prime number or not
int x=25;
boolean isPrime=true;

for(int af=2; af<x/2; af++)
{
	if(x%af==0)
	{
		System.out.println("x is not a prime number");
		isPrime=false;
		break;
	}
}
if(isPrime)
{
	System.out.println("x is  a prime number");
}



//PrimeNumbers from 1 to 100
	int kk=0;
	for(int i=1; i<=100; i++)
	{
		for(int j=2; j<i; j++)
		{
			if(i%j==0)
			{
				kk++;
				break;
			}
			
		}
		if(kk==0)
		{
			System.out.println(i);
		}
		kk=0;
			
	}



}
}

