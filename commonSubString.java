//Write a function that takes the input array of strings and returns the longest common prefix as a string.
//Example:
//Input: ["flower", "flow", "flight"]
//Output: "fl"


public class commonSubString {

	public static void main(String[] args) {
		
		String[] str={"mnno", "nano", "rano"};
		String e1="";
		String e2="";
		String e3="";
		
		for(int i=0;i<4;i++)
		{
			for(int j=i+1;j<=4;j++)
			{
				e1=str[0].substring(i, j);
				e2=str[1].substring(i, j);
				e3=str[2].substring(i, j);
				
				if(e1.equals(e2) && e2.equals(e3))
				{
					System.out.println(e2+" is the substring from index: "+i+" and "+j);
				}
				else if(e1 !=e2 && e2 != e3)
				{
					System.out.println("there is no substring from index: "+i+" and "+j);
				}
				
			}
		}
		
		
			
			
		
	
	}

}
