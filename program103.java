import java.util.Scanner;
class string 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
String str= sc.nextLine();
String array[]= str.split(" ",0);
for(int i=0;i<array.length;i++)
{
char a=array[i].charAt(0);
char t=Character.toUpperCase(a);
array[i]=array[i].replace(a,t);
System.out.print(array[i]+" ");
}

}
}
