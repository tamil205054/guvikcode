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
        Set<Integer> set = new HashSet<Integer>();
         
        for(int i = 0; i < arrNum.length ; i++)
        {
            if(set.add(arrNum[i]) == false)
            {
                System.out.printf("%d ",arrNum[i]);
            }
        }
       
    }
}
