import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class oct3 {

	public static void main(String[] args)
	{
		//sort in asc order
		int[] a= new int[]{2,8,4,1,7};
		List<Integer> l= new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			l.add(a[i]);
		}
		
		System.out.println("list is: "+l);
		List<Integer> l2 =l.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted list is: "+l2);
		
		
		
		//sort string array
		String[] str= new String[] {"megha","anu","tanu","manu"};
		List<String> list= new ArrayList<>();
		for(int i=0;i<str.length;i++)
		{
			list.add(str[i]);
		}
		
		System.out.println("string list is: "+list);
		List<String> ans2= list.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted string list is: "+ans2);
		System.out.println("reverse order of string array is: ");
		for(int i=ans2.size()-1;i>=0;i--)
		{
			System.out.print(ans2.get(i)+" ");
			
		}
		
		System.out.println();
		
		
		//find second largest number from array
		int[] arr1= new int[] {45,78,23,56,77};
		int max= arr1[0];
		for(int i=1;i<arr1.length;i++)
		{
			if(arr1[i]>max)
			{
				max=arr1[i];
			}
		}
		System.out.println("largest number is: "+max);
		int secmax= arr1[0];
		for(int i=1;i<arr1.length;i++)
		{
			if(arr1[i]<max && arr1[i]>secmax)
			{
				secmax= arr1[i];
			}
		}
		
		System.out.println("second max is: "+secmax);
		
		//find second smallest number from array
		int[] arr2= new int[] {45,78,23,56,77};
		int min= arr2[0];
		for(int i=1;i<arr2.length;i++)
		{
			if(arr2[i]<min)
			{
				min=arr2[i];
			}
		}
		System.out.println("smallest number is: "+min);
		int secmin= arr2[0];
		for(int i=1;i<arr2.length;i++)
		{
			if(arr2[i]>secmin && arr2[i]<min)
			{
				secmin= arr2[i];
			}
		}
		
		System.out.println("second min is: "+secmin);
		
		//find common numbers from array
		int[] arr = new int[] {2,5,2,6,8,9,5,1,5};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println(arr[i]+" is repeated");
				
				}
			
				
			}
			
		}
		
		
		
		

		
	}
}
