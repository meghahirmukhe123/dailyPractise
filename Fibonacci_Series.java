//Fibonacci Series Program.
//next number is the sum of previous two numb... 

import java.util.*;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1: ");
		int num1= sc.nextInt();
		System.out.println("enter num2: ");
		int num2= sc.nextInt();
		int next=0;
		
		
		while(next<=20)
		{
			next=num1+num2;   //to get third number
			System.out.println("next number is: "+next);  //print third number
			num1=num2;   //change position of second number to first
			num2=next;    // change position of third number to second
		} 
		
	}

}
