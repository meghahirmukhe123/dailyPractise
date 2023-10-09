
import java.util.*;
public class spriralPrinting {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of row: ");
		int row= sc.nextInt();
		System.out.println("enter number of column: ");
		int col= sc.nextInt();
		
		int[][] matrix= new int[row][col];
		System.out.println("enter numbers: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix is:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}System.out.println();
				
				
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				
			}
		}
	}

}
