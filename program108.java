import java.util.Arrays;
import java.util.Scanner;
class string 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
 int a=sc.nextInt();
 int b=sc.nextInt();
 int arr[]=new int[a];
 for(int i=0;i<a;i++)
 {
     arr[i]=sc.nextInt();
 }
 Arrays.sort(arr); 
System.out.print(arr[b-1]);


}
}
