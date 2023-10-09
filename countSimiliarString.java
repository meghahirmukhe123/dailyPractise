import java.util.*;
public class countSimiliarString {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of str1: ");
		int size1= sc.nextInt();
		String[] arr1= new String[size1];
		System.out.println("enter elements in arr1: ");
		for(int i=0;i<size1;i++) {
			arr1[i]= sc.next();
		}
		
		
		
		System.out.println("enter size of str2:");
		int size2= sc.nextInt();
		String[] arr2=new String[size2];
		
		System.out.println("enter elements in arr2: ");
		for(int i=0;i<size2;i++) {
			arr2[i]= sc.next();
		}
		
		System.out.println("arr 1 is: ");
		for(int i=0;i<size1;i++)
		{
			System.out.println(arr1[i]+" ");
		}
		
		System.out.println("arr 2 is: ");
		for(int i=0;i<size2;i++)
		{
			System.out.println(arr2[i]+" ");
		}
		
		//list1
		
		List<String> l1=new ArrayList<>();
		for(int i=0;i<size1;i++)
		{
			l1.add(arr1[i]);
		}
		//list2
		
		List<String> l2=new ArrayList<>();
		for(int i=0;i<size2;i++)
		{
			l2.add(arr2[i]);
		}
		
		l1.addAll(l2);
		System.out.println("l1 is: "+l1);
		
		Map<String,Integer>m=new HashMap<>();
		for(String s:l1)
		{
			if(m.containsKey(s))
			{
				m.put(s, m.get(s)+1);
			}
			else {
				m.put(s, 1);
			}
		}
		
		System.out.println(m);
		
		
	}

}
