import java.util.*;
class array
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int array[]=new int[n];
      ArrayList<Integer> odd=new ArrayList<Integer>();
      ArrayList<Integer> even=new ArrayList<Integer>();
      for(int i=0;i<n;i++)
      {
        array[i]=input.nextInt();
        if(array[i]%2==0)
        {
          even.add(array[i]);
        }
        else
        {
          odd.add(array[i]);
        }
      }
      if(odd.size()<even.size())
      {
        System.out.print(odd.get(0));
      }
      else
      {
        System.out.print(even.get(0));
      }
  }
}
