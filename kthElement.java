import java.util.*;
public class kthElement {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int[] arr= {3,6,2,9,4,1};
		
		int small= arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(small>arr[i])
			{
				small=arr[i];
			}
		}
		System.out.println("enter value of k: ");
		
		int k= sc.nextInt();
		
		//to find 1st min
		int min1=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[0])
			{
				min1=arr[i];
			}
		}
		
		System.out.println("min1 is: "+min1);
		
		//to find 2nd min
		
		int min2=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[0] && arr[i]>min1)
			{
				min2=arr[i];
			}
		}
		
		System.out.println("min 2 is: "+min2);
		
		//to find 3rd min
		
		int min3=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[0] && arr[i]>min2 )
			{
				min3=arr[i];
			}
		}
		
		System.out.println("min 3 is: "+min3);
		
		
		//to find 4th min
		int min4=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if((arr[i]<arr[0] && arr[i]>min1) && (arr[i]>min2 && arr[i]>min3))
			{
				min4=arr[i];
			}
		}
		
		System.out.println("min4 is: "+min4);
		
		//to find 5th min
		
		int min5=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[0] && arr[i]>min4  && arr[i]>min3 &&  arr[i]>min2 && arr[i]>min1)
			{
				min5=arr[i];
			}
		}
		
		System.out.println("min 5 is: "+min5);
		//to find 6th min 
		
		int min6=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[0] && arr[i]>arr[5] && arr[i]>min4  && arr[i]>min3 &&  arr[i]>min2 && arr[i]>min1)
			{
				min5=arr[i];
			}
		}
		System.out.println("min 6is: "+min6);
		
		
		if(k==1)
		{
			System.out.println("first smallest number is: "+min1);
		}
		else if(k==2)
		{
			System.out.println("second min number is: "+min2);
		}
		else if(k==3)
		{
			System.out.println("third min number is: "+min3);
		}
		else if(k==4)
		{
			System.out.println("4th min number is: "+min4);
		}
		else if(k==5)
		{
			System.out.println("5th min number is: "+min5);
		}
		else if(k==6)
		{
			System.out.println("6th min number is: "+min6);
		}
		
		
		
	}

}
