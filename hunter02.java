import java.util.*;
class number
{
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arrNum[]=new  int[n];
        for(int i=0;i<n;i++)
        {
            arrNum[i]=input.nextInt();
        }
         Arrays.sort(arrNum);
        for(int i = arrNum.length-1; i >0 ; i--)
        {
                System.out.print(arrNum[i]);
        }   
    }
}
