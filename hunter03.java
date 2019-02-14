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
        for(int i=0; i<n ; i++)
        {   
          
            if(arrNum[i]==i)
            {
                System.out.print(arrNum[i]);
            }
            if(i<n-1&&arrNum[i]==i)
            {
                System.out.print(" ");
            }
            
        }    
    }
}
