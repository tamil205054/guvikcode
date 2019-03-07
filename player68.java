import java.util.*;
class array
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n<=100000)
        {
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=input.nextInt();
            }
            int flag=0;
            for(int i=0;i<n;i++)
            {
                int count=0;
                
                for(int j=0;j<n;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                    }
                }
                if(flag<count)
                {
                    flag=count;
                }
            }
            System.out.println(flag);
        }
        input.close();    
    }
}
