package PracticeJavaPrograms.JavaPrograms;

public class MissingNumberANDSmallestLargestInArray {

	public static void main(String[] args) {
		
		//Check missing number in array
		int[] array= {1,2,3,4,5,7,8};
		int len=array.length+1;
		int expectedSum=len*(len+1)/2;
		int actualSum=0;
		
		for(int i=0; i<array.length; i++)
		{
			actualSum+=array[i];
			
		}
		
		int missingNumber=expectedSum-actualSum;
		System.out.println("missing number is "+missingNumber);
		
		
		//Check smallest and largest of array
		int largest=array[0];
		int smallest=array[0];
		for(int i=0; i<array.length; i++)
		{
			if(array[i]>largest)
			{
				largest=array[i];	
			}
			if(array[i]<smallest)
			{
				smallest=array[i];	
			}
		}
		System.out.println("Smallest in array is "+smallest+" and largest in array is "+largest);
		
		
		
	}

}
