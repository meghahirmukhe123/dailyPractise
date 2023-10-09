//check password having length 8.in even places there should be characters and in odd places there should be integers.
public class randomPassword {

	public static void main(String[] args) {
		String pwd="a1b2c3d4";
		
		try {
		if(pwd.length()==8)
		{
			//check at odd places numbers is present or not
			for(int i=1;i<=pwd.length();i+=2)
			{
				
				
					if(pwd.charAt(i)=='0' || pwd.charAt(i)=='1' || pwd.charAt(i)=='2' || pwd.charAt(i)=='3' || pwd.charAt(i)=='4'|| pwd.charAt(i)=='5')
					{
						for(int k=0;k<=pwd.length();k+=2)
						{
							//check character is present in odd index or not
							
								if(pwd.charAt(k)=='a' || pwd.charAt(k)=='b' ||pwd.charAt(k)=='c' || pwd.charAt(k)=='d')
								{
									System.out.println("password accepted");
								}
								else{
									System.out.println("characters are not present in odd places");
									break;
								}
							
						
					  }
						
		          }
					
					else {
						System.out.println("number is not present in odd places");
						break;
					}
				}
				
			}
		else {
			System.out.println("length is not equal to 8");
		}
			
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		
	}

		
		
		

	}

