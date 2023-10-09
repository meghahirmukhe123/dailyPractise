import java.util.*;
public class removeChartry2 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array" );
		int size=sc.nextInt();
		//declared string array
		String[] arr= new String[size];
        char ch= '0';
        List<String> l= new ArrayList<>();
		
		String ans="";
		
		
		//entered elements in string array
		System.out.println("enter elements in array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]= sc.next();
			
		}
		
		System.out.println("array is:");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}System.out.println();
		
		
		//applied condition
		for(int i=0;i<arr.length;i++)
		{
			String str1=arr[i];  
			for(int j=0;j<str1.length();j++)
			{
				for(int k=j+1;k<str1.length();k++)
				{ 
					if(str1.charAt(j)==str1.charAt(k))
					{
						ch=str1.charAt(j);
						ans=str1.replace(Character.toString(ch),"");
						l.add(ans);
					}
				}
			}
		}
		System.out.println("answer is: "+l);
		
						
					
		
		
		
	}
}
		
		
		
		
		
	


