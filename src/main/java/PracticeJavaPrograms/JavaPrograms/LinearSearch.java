package PracticeJavaPrograms.JavaPrograms;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] array= {45,32,76,2,88,94,33};
		
		int searchNumber=33;
		int index=-1;
		int i;
		
		for( i=0; i<array.length; i++)
		{
			if(searchNumber==array[i])
			{
				index=i;
				break;
			}
			i++;
		}
		if(index!=-1)
		{
		System.out.println("Index of target element is "+i);
		}
		else
		{
			System.out.println("no number matched");
		}
	}

}
