import java.util.*;
public class palindrome2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number: ");
        int num= sc.nextInt();

        // Convert number to a string
        String numstr = String.valueOf(num);

        // Initialize the integer array
        int[] arr = new int[numstr.length()];

        // Convert each character to an integer and store in the array
        for (int i = 0; i < numstr.length(); i++) {
            arr[i] = Character.getNumericValue(numstr.charAt(i));
        }

        int a=0;
        int b=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=arr.length-1;j>=0;j--)
            {
                a=arr[i];
                b=arr[j];
            }
        }

        if(a==b)
        {
            System.out.println("palindrome");
        }
        else if(a!=b)
        {
            System.out.println("not palindrome");
        }
       
    

    }
    
}
