import java.util.*;
class array
{
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt(),count=0;
        int search=input.nextInt();
        int arrayNum[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arrayNum[i]=input.nextInt();
            if(arrayNum[i]==search)
            {
                count=count+1;
            }
        }
    System.out.print(count);
    }
}
