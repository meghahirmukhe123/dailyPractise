//take a string array.remove duplicate charater from all strings.
//Ex: arr={"meena","raja","doggie"}
//o/p= arr={"mna",'rj","doie"}
import java.util.*;
public class removeCharFromString {
	public static void main(String[] args)
	{
		String[] arr= {"meena","raja","tanuja"};
		System.out.println("array is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}System.out.println();
		System.out.println();
		
		
		
		char ch= '0';
		
		String ans="";
		
		String str1=arr[0];
		for(int i=0;i<str1.length();i++)
		{
			for(int j=i+1;j<str1.length();j++)
			{
				if(str1.charAt(i)==str1.charAt(j))
				{
					ch=str1.charAt(i);
					ans=str1.replace(Character.toString(ch),"");
				}
			}
		}
		
		System.out.println(ans);
		String str2=arr[1];
		for(int i=0;i<str2.length();i++)
		{
			for(int j=i+1;j<str2.length();j++)
			{
				if(str2.charAt(i)==str2.charAt(j))
				{
					ch=str2.charAt(i);
					ans=str2.replace(Character.toString(ch),"");
				}
			}
		}
		
		System.out.println(ans);
		
		String str3=arr[2];
		for(int i=0;i<str3.length();i++)
		{
			for(int j=i+1;j<str3.length();j++)
			{
				if(str3.charAt(i)==str3.charAt(j))
				{
					ch=str3.charAt(i);
					ans=str3.replace(Character.toString(ch),"");
				}
			}
		}
		
		
		System.out.println(ans);
				
				
				
				
				
				
				
		
		
		
		
		
		
		
			
	   
			
			
			
			
			

		
	
		
		
	
	}
		
	}


