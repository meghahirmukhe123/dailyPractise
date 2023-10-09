import java.util.*;
public class matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row= 3;
        int col=3;
        int[][] arr= new int[row][col];
        System.out.println("enter numbers in matrix: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }

        System.out.println("matrix is: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }

        for(int i=0;i<3;i++)
        {
            for(int j=1;j<=1;j++)
            {
                arr[i][j]=0;
            }
        }
        System.out.println("my aswer is: ");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }

        

        
        
    }
    
}
