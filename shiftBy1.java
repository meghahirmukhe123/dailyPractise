//Shift the array by 1 position
//a=[1,5,7,8,9,4}
//o/p=[{5,7,8,9,4,1}

import java.util.*;
public interface shiftBy1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array ");
		int size= sc.nextInt();
		
		int[] arr= new int[size];
		System.out.println("enter elements ");
		for(int i=0;i<size;i++)
		{
			arr[i]= sc.nextInt();
		
		}
		
		List<Integer> l1= new ArrayList<>();   // to store array
		List<Integer> l2= new ArrayList<>();   // to store first element
		
		
		for(int i=0;i<arr.length;i++)
		{
			l1.add(arr[i]);
		}
		l2.add(l1.get(0));
		l1.remove(0);   
		
		//answer
		
		l1.addAll(l2);
		System.out.println(l1);
		
		
		
		
		
		
		
	
		

	}

}
