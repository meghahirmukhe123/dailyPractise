

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class basics {
	public static void main(String[] args)
	{
		
		//1.find max from given list 
		List<Integer> list= List.of(11,22,3,4,5,6);
		int max=list.get(0);
		for(int i=1;i<list.size();i++)
		{
			if(list.get(i)>max)
			{
				max=list.get(i);
		    }
	    }
		System.out.println("max number is: "+max);
		
		   //second way
		 Optional<Integer> max2 = list.stream()
	                .max(Integer::compare);
		 System.out.println("max number is: "+max2);
		 
		 
		 
		 //2.find length of length of each string
		 List<String> str= List.of("megha","anu","tanu",
				 "manu");
		 
		 Map<String,Integer> len= str.stream().collect(Collectors.toMap(a->a, a->a.length()));
		 System.out.println(len);
		 
		 
		 
		 //3.sum of all numbers from list
		 List<Integer> i= List.of(1,2,3,4,5);
		 int sum = i.stream()
	                .mapToInt(Integer::intValue)
	                .sum();
		 
		 System.out.println("sum is: "+sum);
		
		 
		 //4.find max length string from list
		 List<String> str2= List.of("megha","anuuuu","tanu",
				 "manu");
		 
		   //using for loop
		 String maxlen= str2.get(0);
		 for(int j=1;j<str2.size();j++)
		 {
			 if(str2.get(j).length()>maxlen.length())
			 {
				 maxlen=str2.get(j);
			 }
			 
		 }
		 System.out.println("string with max length is: "+maxlen);
		
		 
		 //using lambda
		 String maxLengthString = str2.stream()
	                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
	                .orElse(null);
		 System.out.println("string with max length: "+maxLengthString);
		 
		 
		 //5.Reverse string
		 String given= "megha";
		 String empty="";
		 for(int l=0;l<given.length();l++)
		 {
			empty=given.charAt(l)+empty; 
		 }
		 System.out.println("reverse of "+given+ " is  "+empty);
		
		 
		 
		 //6/reverse of list of string
		 List<String> l= List.of("megha","anu","tanu","manu");
		
		 List<String> finalans=new ArrayList<>();
		 for(int m=0;m<l.size();m++)
		 {
			 String emp="";
			 String let= l.get(m);
			 for(int x=0;x<let.length();x++)
			 {
				 emp=let.charAt(x)+""+emp;
			 }
			 finalans.add(emp);
			 
		 }
		 System.out.println("reverse of list is: "+finalans);
		 
		 
		 //7.Palindrome check
		 List<String> l1= List.of("megha","mom","tanu","kak");
		 List<String> answer=new ArrayList<>();
		 for(int y=0;y<l1.size();y++)
		 {
			 String e="";
			 String string= l1.get(y);
			 for(int k=0;k<string.length();k++)
			 {
				 e=string.charAt(k)+e;
			 }
			 
			 if(e.equals(string))
			 {
				 System.out.println(string+" is palindrome");
			 }
			 else {
				System.out.println(string+" is not palindrome");
			}
		 }
		 
	
		
		
		
		
	}
	

}
