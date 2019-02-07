import java.util.*;
class sum
{
	public static void main(String args[])
	{
		Scanner SC=new Scanner(System.in);
		int num=SC.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            sum=sum+i;
            
        }
            System.out.print(sum);
	}
}
