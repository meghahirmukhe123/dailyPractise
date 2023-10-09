// Take a array .print addition of all even index numbers from array and 
// print addition of odd index numbers from array.
// ex: arr=[1,2,3,4,5,6]
// odd=2+4+6  sum=12
// even=1+3+5  sum=9
import java.util.*;
public class alterAdd {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array: ");
        int size=sc.nextInt();
        int[] arr= new int[size];
        List<Integer> evenl=new ArrayList<>();
        List<Integer> oddl=new ArrayList<>();
        System.out.println("enter elements in array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        int evensum=0;
        int oddsum=0;
        for(int i=0;i<size;i++)
        {
            if(i%2==0)
            {
                evensum=arr[i]+evensum;
                evenl.add(arr[i]);
                
            }
            else if(i%2 !=0)
            {
                oddsum=arr[i]+oddsum;
                oddl.add(arr[i]);
            }
 
        }

        System.out.println("even idex numbers are: "+evenl);
        System.out.println("sum of even idex numbers is: "+evensum);
        System.out.println("odd endex numbers are: "+oddl);
        System.out.println("sum of odd endex numbers is: "+oddsum);
      

        

    

       
        
    }

        
    
}
