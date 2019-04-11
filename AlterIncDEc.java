import java.util.*;
import java.lang.*;
class incdec
{
    public static void main(String[] args) 
    {
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=input.nextInt();
       }
       int flag=0,k=0;
       for(int i=0;i<n-2;i++)
       {
           if(arr[i]<arr[i+1] && arr[i+1]>arr[i+2])
           {
               flag++;
           }
           else if(arr[i]>arr[i+1] && arr[i+1]<arr[i+2])
           {
               k++;
           }
       }
       if(flag+k==n-2)
       {
           System.out.println("yes");
       }
       else
       {
           System.out.println("no");
       }
       input.close(); 
    }
}
