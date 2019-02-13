import java.util.*;
class find
{
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
          int n=input.nextInt();
          int find =input.nextInt();
          int arr[]=new int[n];
          int count=0;  
            for(int i=0;i<n;i++)
            {
                arr[i]=input.nextInt();
                if(arr[i]==find)
                {
                    count=1;
                }
            } 
            if(count==1)
            {
                System.out.print("Yes");
            }
            else
            {
                System.out.print("No");
            }
        
    }
}
