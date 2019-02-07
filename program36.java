import java.lang.*;
import java.util.Scanner;
class special
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);  
String str= sc.nextLine();
count(str); 
}
public static void count(String x)
{ 
		int other = 0;
		char[] ch = x.toCharArray();
        for(int i=0;i<x.length();i++)
        {
        	if(!(Character.isLetter(ch[i])||Character.isDigit(ch[i])||Character.isSpaceChar(ch[i])))
            {
				other ++;
			}

			 
        }
            System.out.println(other);
}
}
