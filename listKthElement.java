import java.util.*;
public class listKthElement {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter k: ");
		int k=sc.nextInt();
		int x=0;
		int[] arr= {4,2,8,6,1};
		List<Integer> list=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++)
		{
			list.add(arr[i]);
		}
		
		System.out.println("list is: "+list);
		//for first number
		int min1=list.get(0);
		for(int i=1;i<list.size();i++)
		{
			if(list.get(0)>list.get(i))
			{
				min1=list.get(i);
				x=i;
			}
		}
		list.remove(x);
		
		//for second number
		int min2=list.get(0);
		for(int i=1;i<list.size();i++)
		{
			if(list.get(0)>list.get(i))
			{
				min2=list.get(i);
			}
		}
		list.remove(list.indexOf(min2));
		
		
		//for third
		int min3=list.get(0);
		for(int i=1;i<list.size();i++)
		{
			if(list.get(0)>list.get(i))
			{
				min3=list.get(i);
			}
		}
		list.remove(list.indexOf(min3));
		
		
		//only 2 numbers are remained
		int m=list.get(0);
		int n=list.get(1);
		int min4=Math.min(m, n);
		list.remove(list.indexOf(min4));
		int min5=list.get(0);
		
		if(k==1)
		{
			System.out.println("min1 is: "+min1);
		}
		else if(k==2)
		{
			System.out.println("second min is: "+min2);
		}
		else if(k==3)
		{
			System.out.println("third min is: "+min3);
		}
		else if(k==4)
		{
			System.out.println("fourth min is: "+min4);
		}
		else if(k==5)
		{
			System.out.println("fifth min is: "+min5);
		}
		
		else if(k>arr.length)
		{
			System.out.println("out of array length");
		}
		
		
}

}
