import java.lang.*;
import java.util.Scanner;
class number
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);  
String str= sc.nextLine();
count(str); 
}
public static void count(String x)
{
        int num=0;
		char[] ch = x.toCharArray();
        for(int i=0;i<x.length();i++)
        {
         if(Character.isDigit(ch[i]))
         {
          num=1;
         }
            if(Character.isLetter(ch[i])&&num==1)
            {
        	num=2;
            }
        }
        if(num ==2)
        {
            System.out.println("yes");
        }
        else{
              System.out.println("no");
        }
}
}
