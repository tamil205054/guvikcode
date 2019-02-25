import java.util.*;
class string
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int limit=9999;
		int len,flag=1;
		String s=input.nextLine();
		String str[]=new String[n];
		for(int i=0;i<n;i++){
			str[i]=input.nextLine();
			len=str[i].length();
			if(len<limit)
      {
				limit=len;
      }
		}
		for(int i=0;i<=limit-1;i++)
    {
			for(int j=0;j<=n-2;j++)
      {
				if(str[j].charAt(i)==str[j+1].charAt(i))
        {
					continue;
        }
				else{
					flag=0;
					break;
				}

			}
			if(flag==1)
      {
				System.out.print(str[0].charAt(i));
			}
			else
				break;

		}

	}

}
