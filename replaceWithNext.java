//take a matrix.if number is even then replace that number with its nextnumber.
//ex:
//a=
//1 2 3
//4 5 6
//7 8 9
//
// 
//
//o/p=
//1 3 3
//5 5 6
//7 9 9

import java.util.*;

public class replaceWithNext {

	public static void main(String[] args) {
		Runnable r=()->{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row of matrix: ");
		int row= sc.nextInt();
		System.out.println("enter column of matrix: ");
		int col=sc.nextInt();
		int[][] m=new int[row][col];
		System.out.println("enter elements: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				m[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("matrix is");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(m[i][j]+" ");
			}System.out.println();
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				m[i][j] = m[i][j] % 2 == 0 ? m[i][j]=m[i][j]+1 : m[i][j];
			}
		}
		System.out.println("answer is: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(m[i][j]+" ");
			}System.out.println();
		}
		

	};
	
	r.run();

}
}
