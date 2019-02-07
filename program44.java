import java.util.*;
class concat
{
	public static void main(String args[])
	{
		Scanner SC=new Scanner(System.in);
		int num=SC.nextInt();
        int flag=0;
        for(int i=1;i<10;i++)
        {
            if(num==i)
            {
                flag=1;
            }
        }
           if(flag==1)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
	}
}
