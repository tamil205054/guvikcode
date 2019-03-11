import java.util.*;
class number
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n<=100000)
        {
            int flag=0;
            int k=input.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=input.nextInt();
                if(arr[i]==k)
                {
                    flag=1;
                }
            }
            if(flag==1)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
        input.close();

    }
}
