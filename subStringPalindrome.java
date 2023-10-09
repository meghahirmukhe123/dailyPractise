//Given a string, find the longest palindrome substring within it.
import java.util.*;

public class subStringPalindrome {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string: ");
		String s= sc.next();
		String e="";
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=1;j<s.length();j++)
			{
				e=s.substring(i, j);
				
				for(int k=0;k<e.length();k++)
				{
					rev= e.charAt(k)+rev;
				}
				if(rev.equals(e))
				{
					System.out.println(e+" is the substring who is palindrome");
				}
			}
		}
	}

}
