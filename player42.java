import java.util.*;
class number
{
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=arr1[i]=input.nextInt();
        }
     Arrays.sort(arr);
     int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==arr1[i])
            {
                count++;
            }
        }
        if(count==n)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}
