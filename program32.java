import java.util.Scanner;
class string 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
String str= sc.nextLine();
String array[]= str.split(" ",0);
System.out.println(array.length);
}
}
