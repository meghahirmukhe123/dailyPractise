import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

//Find the 100 prime number not the 1st 100 prime number 
public class prime100 {

	public static void main(String[] args)
	{
		List<Integer> l= new ArrayList<>();  //to store prime numbers
		Predicate<Integer> isPrime = num -> {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <=(num-1); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };
        int count=0;
        
        for(int i=21;i<=10000;i++)
        {
        	if(isPrime.test(i))
        	{
        		count++;
        		l.add(i);
        		if(l.size()>99)
        		{
        			break;
        		}
        	}
        }
        
        System.out.println("total prime number is: "+count);
        System.out.println("prime numbers are: "+l);
        }
}
		
			
		
		
		


