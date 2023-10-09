import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int num= sc.nextInt();
        String str=Integer.toString(num);
        String ans="";
        for(int i=0;i<str.length();i++)
        {
            ans=str.charAt(i)+ans;
        }

        if(str.equals(ans))
        {
            System.out.println(num+" is palindrome");
        }else{
            System.out.println(num+" is not palindrome");
        }
    }
    
}
