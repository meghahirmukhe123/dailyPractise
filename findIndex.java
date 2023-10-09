//find index of user provided number
import java.util.*;
public class findIndex {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array: ");
		int size= sc.nextInt();
		int[] arr= new int[size];
		System.out.println("enter elements in array:  ");
		for(int i=0;i<size;i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.println("enter user number: ");
		int num= sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				System.out.println("index of : "+num+" is : "+i);
				
			}
			
		}
		

	}

}
