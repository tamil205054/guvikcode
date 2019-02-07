import java.util.*;
class bin
{
	public static void main(String args[])
	{
		Scanner SC=new Scanner(System.in);
		String str=SC.next();
        int flag=0;
        char ch[] = str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='0'||ch[i]=='1')
            {
                flag=2;
            }
            else
            {
                flag=0;
            }
        }
        if(flag==2)
        {
            System.out.print("yes");
        }
        else 
        {
            System.out.print("no");
        }
    }
}
