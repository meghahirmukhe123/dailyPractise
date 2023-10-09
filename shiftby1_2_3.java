import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class shiftby1_2_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size= sc.nextInt();
		int[] arr= new int[size];
		System.out.println("enter elements: ");
		for(int i=0;i<size;i++)
		{
			arr[i]= sc.nextInt();
		}
		List<Integer> l1= new ArrayList<>();
		List<Integer> l2= new ArrayList<>();
		List<Integer> l3= new ArrayList<>();
		List<Integer> l4= new ArrayList<>();
		for(int i=0;i<size;i++)
		{
			l1.add(arr[i]);
		}
		
		System.out.println("before any shifting: "+l1);
		l2.add(l1.get(0));   //l2=1
		l1.remove(0);
		l1.addAll(l2);
		System.out.println("after shifting by one element: "+l1);   //2 3 4 5 1
		l3.add(l1.get(0));   //l3= 2
		l1.remove(0);       //l1=3 4 5 1
		l1.addAll(l3);      //3 4 5 1 2
		System.out.println("after shifting by two element: "+l1);  
		l4.add(l1.get(0));
		l1.remove(0);
		l1.addAll(l4);
		System.out.println("after shifting by three elements: "+l1);
		
		
		
		
		
		
		
}
}
