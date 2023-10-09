//Given an array of integers, find the two numbers that sum up to a given target.
import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
public class numFromArray {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
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
		}System.out.println();
		System.out.println("enter user addition: ");
		int user=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==user)
				{
					System.out.println(arr[i]+" "+arr[j]+" are the numbers whose sum is: "+user);
				}
			}
		}
	
		
		
		
	}
}
