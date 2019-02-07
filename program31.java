import java.util.Scanner;
class stringlen 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
 
String str= sc.nextLine();
int count=0;
String array[]= str.split(" ",0);
 
 for(int i=0;i<array.length;i++)
 {
     count+=array[i].length();
   
}
System.out.println(count);
}
}
