import java.util.*;
class arrays
{
    public static void main(String ar[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
             
        }
        for (int i = 0; i < n; i++)  
        { 
            for (int j = i + 1; j < n; j++)  
            { 
                if (arr[i] == arr[j])  
                    sum+=arr[i]; 
            } 
        } 
        if(sum==k)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}
