import java.util.*;
class Direction
{
	static boolean Circular(char ch[])
	{
		int x=0;
		int y=0;
		int direction=0;
		for(int i=0;i<ch.length;i++)
		{
		 char move=ch[i];
		 if(move == 'R')
		 {
			 direction =(direction+1)%4;
		 }
		 else if(move =='L')
		 {
			 direction =(4+direction-1)%4;
		 }
		 else
		 {
			 if(direction==0)
			 {
				 y++;
			 }
			 else if(direction==1)
			 {
				 x++;
			 }
			 else if(direction==2)
			 {
				 y--;
			 }

			 else
			 {
				 x--;
			 }
		 }
		}
		return (x==0 &&y==0);
	}
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		String str=input.next().toUpperCase();
		char ch[]=str.toCharArray();
		if(Circular(ch))
		{
			System.out.print("yes");	
		}
		else
		{
			System.out.print("no");
		}
		input.close();
	}
}
