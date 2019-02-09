import java.util.Scanner;
class string 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
 int l=sc.nextInt();
 int find=sc.nextInt();
 int arr[]=new int[l];
 int j=0,k=0;
 int odd[]=new int[l];
 for(int i=0;i<l;i++)
 {
    arr[i]=sc.nextInt();
 }
 for(int i=0;i<l;i++)
 {
  if(arr[i]%2!=0 &&j!=find)
  {
     
    odd[i]=arr[i];
    k=i;
    j++;
  }
 }
  
 System.out.print(odd[k]);

}
}
