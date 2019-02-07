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
         if(Character.isDigit(ch[i])){
				num ++ ;
			}
        }
            System.out.println(num);
}
}
