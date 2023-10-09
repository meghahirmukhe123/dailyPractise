package daily_practise;

public class countStringByForLoop {
	public static void main(String[] args)
	{
		String[] s1= {"ab","bc","cd"};
		String[] s2= {"ab","cv","cd"};
		int count=0;
		
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j<s2.length;j++)
			{
				if(s1[i]==s2[j])
				{
					 count=1;
					count++;
					System.out.println(s1[i]+" "+count);
					
				}
				
				
				
			}
		}
	}

}
