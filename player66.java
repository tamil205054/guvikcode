import  java.util.*;
class array
{
    public static  void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int result=0;
        int arrNum[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arrNum[i]=input.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            int count=0;
            for (int j=0;j<n;j++)
            {

                    if(arrNum[i]==arrNum[j])
                    {
                        count++;
                    }
                if(count==k)
                {
                    result=arrNum[i];
                    i=n;
                    break;
                }
            }
        }
    System.out.print(result);
    }
}
