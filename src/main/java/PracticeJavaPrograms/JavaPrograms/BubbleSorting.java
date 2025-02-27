package PracticeJavaPrograms.JavaPrograms;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {

int[] array= {45,32,76,2,88,94,33};

for(int i=0; i<array.length-1;i++)
{
	for(int j=0; j<array.length-1-i;j++)
	{
		if(array[j]>array[j+1])
		{
			array[j]=array[j]+array[j+1];
			array[j+1]=array[j]-array[j+1];
			array[j]=array[j]-array[j+1];
		}
	}
}
System.out.println(Arrays.toString(array));

	}

}
