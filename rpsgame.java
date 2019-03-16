import java.util.*;
class sum
{
    public static void main(String aa[])
	{ 
        Scanner ip=new Scanner(System.in);  
			char player_1=ip.next().toLowerCase().charAt(0);
			char player_2=ip.next().toLowerCase().charAt(0);
			if(player_1==player_2)
			{
				System.out.print('D');
			}
			else if(player_1=='r'&&player_2=='s')
			{
				System.out.print('R');
			}
			else if(player_1=='p'&&player_2=='r')
			{
				System.out.print('P');
				
			}
			else if(player_1=='s'&&player_2=='p')
			{
				System.out.print('S');
				
			}
			else if(player_1=='s'&&player_2=='r')
			{
				System.out.print('R');
			}
			else if(player_1=='r'&&player_2=='p')
			{
				System.out.print('P');
				
			}
			else if(player_1=='p'&&player_2=='s')
			{
				System.out.print('S');
				
			}
			
			
		ip.close();
    }

}
