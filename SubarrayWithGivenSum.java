

import java.util.Scanner;

//Subarray with given sum

public class SubarrayWithGivenSum {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter sum: ");
		int sum= sc.nextInt();
		System.out.println("enter size of array: ");
		int size= sc.nextInt();
		int[] arr= new int[size];
		System.out.println("enter elements: ");
		for(int i=0;i<size;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		System.out.println("array is: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]+arr[j] == sum)
				{
					System.out.println(arr[i]+" "+arr[j]+" are the numbers whose sum is: "+sum);
				}
			}
		}
	
	}

}
