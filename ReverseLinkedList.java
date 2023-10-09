

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//i/p => {1,2,3,4,5}
//o/p=> {5,4,3,2,1}

public class ReverseLinkedList {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of list: ");
		int size= sc.nextInt();
		List<Integer> list= new ArrayList<>();
		System.out.println("enter elements: ");
		for(int i=0;i<size;i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println("list is: "+list);
		System.out.println("list in reverse order is: ");
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i)+" ");
		}
		
	}

}
