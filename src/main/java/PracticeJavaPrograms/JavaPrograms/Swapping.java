package PracticeJavaPrograms.JavaPrograms;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {

		//Using 3rd variable
		int a=11;
		int b=22;
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("value of a is "+a+" and value of b is "+b);
		
		//without using 3rd variable
		int x=11;
		int y=22;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("value of x is "+x+" and value of y is "+y);
		
//Swapping of Strings without using 3rd variable
		
		String s1="Sai";
		int p=s1.length();
		String s2="Teja";
		s1=s1.concat(s2);
		s2=s1.substring(0,p);
		s1=s1.substring(p);
		System.out.println("value of s1 is "+s1+" and value of s2 is "+s2);
		
		//Swapping of Strings using 3rd variable
		String s3="Sai";
		String s4="Teja";
		String s5="";
		s5=s3;
		s3=s4;
		s4=s5;
		System.out.println("value of s3 is "+s3+" and value of s4 is "+s4);
	}

}
