import java.util.*;
class count
{
	public static void main(String args[])
	{
		Scanner SC=new Scanner(System.in);
		int num=SC.nextInt();
        int flag=0;
        while(num!=0)
        {
            num/=10;
                flag++;

        }
            System.out.print(flag);
	}
}
