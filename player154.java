import java.util.*;
class string
{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    String str=input.next();
    int k=input.nextInt();
    char ch[]=str.toCharArray();
		int n=ch.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			count++;
			if(count%k==0)
			{
				System.out.print(Character.toUpperCase(ch[i]));
			}
			else
			{
				System.out.print(ch[i]);
			}
		}
  }
}
