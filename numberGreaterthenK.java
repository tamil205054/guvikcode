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
       
            }
            Arrays.sort(arr);
            for(int i=0;i<n;i++)
            {
                if(k<arr[i])
                {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
        input.close();

    }
}
