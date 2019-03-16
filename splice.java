import java.util.*;

class PowerOfSum{ 
	 
	public static void main(String[] args) {  
		Scanner input=new Scanner(System.in);
		String num1=input.next();
		int spl=input.nextInt();
		for(int i=0;i<num1.length()-(spl-1);i++)
		{
			System.out.print(num1.substring(i,i+spl));
			if(i<num1.length()-(spl-2))
			{
				System.out.print(" ");
			}
		} 
		input.close();
		
	} 
} 
