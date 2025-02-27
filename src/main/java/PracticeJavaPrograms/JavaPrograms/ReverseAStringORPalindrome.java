package PracticeJavaPrograms.JavaPrograms;

import java.util.Scanner;

public class ReverseAStringORPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next();
		usingCharAt(str);
		usingArrays(str);

	}

	public static void usingCharAt(String str)

	{
		String reverseString = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverseString = reverseString + String.valueOf(str.charAt(i));
		}
		if (str.equals(reverseString)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}

	}

	public static void usingArrays(String str) {
		String reverseString = "";
		String[] stringChars = str.split("");
		for (int i = stringChars.length - 1; i >= 0; i--) {
			reverseString += stringChars[i];
		}
		if (str.equals(reverseString)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}
	}

}
