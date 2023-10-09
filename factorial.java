
//Write a program to find the factorial 
//Ex 5 
//o/p -120 (5*4*3*2*1)
import java.util.*;
import java.util.function.Function;
public class factorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter user number: ");
		int num= sc.nextInt();
		
		
		Function<Integer,Integer> f= i->{
			
			for(int j=i-1;j>0;j--)
			{
				i= i*j;
			}
			return i;
			
		};
		
		System.out.println("factorial of : "+num+" is : "+f.apply(num));
		
		
	}

}
