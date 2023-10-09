//Find average of even numbers from given list.
import java.util.*;
import java.util.stream.Collectors;
public class avgOfEvenFromList {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of list: ");
		int size= sc.nextInt();
		List<Integer> l= new ArrayList<>();
		System.out.println("enter elements: ");
		for(int i=0;i<size;i++)
		{
			l.add(sc.nextInt());
		}
		
		
		
		long count= l.stream().filter(x->x%2==0).count();
		int sum= l.stream().filter(x->x%2==0).mapToInt(Integer::intValue).sum();
		
		System.out.println("avg of all even number from list is: "+(sum/count));
		
		
	}

}
