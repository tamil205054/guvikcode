import java.util.*;
class Cataln { 
	public static void main(String[] args) {  
		Scanner input=new Scanner(System.in);
		int coin=input.nextInt();
		int player=input.nextInt();
		int result=coin%player;
		if(result==0)
		{
			System.out.print(player);
		}
	
		else
		{
		System.out.print(result);	
		}
		
		input.close();
	} 
} 
