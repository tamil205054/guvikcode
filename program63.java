import java.util.*;
class array
{
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        int arrayNum[]=new int[10];
        for(int i=0;i<10;i++)
        {
            arrayNum[i]=input.nextInt();
        }
        Arrays.sort(arrayNum);
         
         
            System.out.print(arrayNum[0]);
        
    }
}
