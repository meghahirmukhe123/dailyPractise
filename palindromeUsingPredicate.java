//Implement a predicate function in Java that determines whether a string is a palindrome.
import java.util.*;
import java.util.function.*;
public class palindromeUsingPredicate {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array: ");
		int size= sc.nextInt();
		
		String[] st= new String[size];
		System.out.println("enter elements in array: ");
		for(int i=0;i<size;i++)
		{
			st[i]= sc.next();
		}
		Function<String,String> f= s->
		{
			String str="";
			for(int i=0;i<s.length();i++)
			{
				str= s.charAt(i)+str;
			}
			if(s.equals(str))
			{
				return "palindrome";
			}else {
				return "not-palindrome";
			}
			
			
		};
		
		for(String string:st)
		{
			System.out.println(string+" is "+f.apply(string));
		}
		
		
	}

}
