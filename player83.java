import java.util.*;
class bitor
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      if(n<=100000)
      {
        int temp=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {

          arr[i]=input.nextInt();
           
          temp=temp|arr[i];
        }
        System.out.print(temp);
      }

  }
}
