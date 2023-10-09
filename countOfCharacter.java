//Write a program to count the occurrence of each character in a string and display the count for each character.
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

interface countOfCharacter {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter input string: ");
		String str= sc.next();
		
		
		char[] ch= str.toCharArray();
		
		Map<Character,Integer> m= new HashMap<>();
		
		for(char c:ch)
		{
			if(m.containsKey(c))
			{
				m.put(c, m.get(c)+1);
			}
			
			else {
				m.put(c, 1);
			}
		}
		
		System.out.println(str+ " "+m);
		
		


		
	
	
		
		
		
		
		
		
		
	
	}

}
