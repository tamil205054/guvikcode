import java.util.*;
import java.lang.*;
class  min
{
    public static void main(String[] args) 
    {
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       int arr[]=new int[n];
       int arr1[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=input.nextInt();
           
       }
       for(int i=0;i<n;i++)
       {
           int sum=0;
        if(i==0)
        {
            arr[i]=arr[i];
        }
        
            for(int j=0;j<=i;j++)
            {
                if(arr[i]%2==0)
                {  
            if(arr[j]%2==0)
            {
               sum=sum+arr[j];
            }
        }
        else
        {
            sum=arr[i];
            break;
        }
         
           }
           arr1[i]=sum;
      
       }
       for(int i=0;i<n;i++)
       {
System.out.print(arr1[i]);
if(i<n-1)
{
    System.out.print(" ");
}
       }
       input.close(); 
    }
}
