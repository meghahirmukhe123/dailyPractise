//write program for pangram.
//pangram means sentence contains all the alphabets.
import java.util.*;
import java.util.stream.Stream;
public class pangram {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char[] alpha= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		System.out.println("enter sentence: ");
		String st= sc.nextLine();
		String str= st.toLowerCase();
		String str1= str.replace(" ", "");
		
		char[] ch= str1.toCharArray();
		
		TreeSet<Character> t= new TreeSet<>();
		for(int i=0;i<ch.length;i++)
		{
			t.add(ch[i]);
		}
		List<Character> l= new ArrayList<>(t);
		System.out.println("list is: "+l);
		
		char[] f= new char[l.size()];
		for(int i=0;i<l.size();i++)
		{
			f[i]=l.get(i);
		}
		
		if(alpha.length==f.length)
		{
			for(int i=0;i<f.length;i++)
			{
				for(int j=i;j<alpha.length;j++)
				{
					if(f[i]==alpha[j])
					{
						System.out.println(st+" is pangram");
					}
				}
			}
		}
		else
		{
			System.out.println("all alphabets are not present.hence not pangram");
		}
		
		
		
	
		
	
		
		
		
		
		
	
	}

}
