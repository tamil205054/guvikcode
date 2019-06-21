import java.util.*;
public class Binary_position
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		int num2=input.nextInt();
		int prodect=num1*num2;
		int index=0;
		String str=Integer.toBinaryString(prodect);
		System.out.println(str);
		for(int i=str.length()-1;i>=0;i--)
		{
		    if(str.charAt(i)=='1')
		    {
		        index=i;
		        break;
		    }
		}
		System.out.print(index+1);
	  	input.close();	
	}
}
