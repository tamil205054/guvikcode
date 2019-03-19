
import java.util.*;
class repeat
{
    public static void main(String[] args) 
    {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=ip.next();
		}
		for(int i=0;i<n;i++)
		{
			char ch1[]=str[i].toLowerCase().toCharArray();
			int count1=0;
			for(int j=0;j<ch1.length;j++)
			{
				if(ch1[j]=='a'||ch1[j]=='e'||ch1[j]=='i'||ch1[j]=='o'||ch1[j]=='u')
				{
					count1++;
				}
			}
			 
			
			for(int k=0;k<n;k++)
			{		
					int count2=0;
					char ch2[]=str[k].toLowerCase().toCharArray();
					for(int j=0;j<ch2.length;j++)
					{
						if(ch2[j]=='a'||ch2[j]=='e'||ch2[j]=='i'||ch2[j]=='o'||ch2[j]=='u')
						{
							count2++;
						}
					} 
			if(count2<count1)
			{
				String temp=str[i];
				str[i]=str[k];
				str[k]=temp;
			}
				
			}
		
		}
		   			for(int i=0;i<n;i++)
					{
						System.out.println(str[i]);
					 
					}
		 	
	
		ip.close(); 
    }
}
