import java.util.*;
//find square root withoutn predefined methods
public class findSquareRoot {

	public static void main(String[] args) {
		
		//first way to find sqrt of any number:
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int num= sc.nextInt();
        double temp, squareroot;
		
		squareroot = num / 2;
		
		do {
			temp = squareroot;
			squareroot = (temp + (num / temp))/2;
		} while((temp - squareroot) != 0);
		
		System.out.println("\nThe Square Root of a Number without sqrt = " + squareroot);
		
		
		//second way to find sqrt of number between 1-10
		
		for(double i=2;i<=num;i++)
		{
			if(i*i==num)
			{
				System.out.println(i+" is sqrt of : "+num);
			}
		}
		

	}

}
