import java.util.*;
class array
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int k=input.nextInt();
      int array[]=new int[n];
      int flag=0;
      for(int i=0;i<n;i++)
      {
        array[i]=input.nextInt();
        if(array[i]==k)
        {
          flag=i+1;
        }
      }
      System.out.print(flag);
  }
}
