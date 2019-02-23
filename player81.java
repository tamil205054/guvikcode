import java.util.*;
class bitand
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      if(n<=100000)
      {
        int arr[]=new int[n];
        ArrayList<Integer> bitwise=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
          arr[i]=input.nextInt();
          bitwise.add(arr[i]&arr[i]);
        }
        Collections.sort(bitwise);
      System.out.print(bitwise.get(bitwise.size()-1));
      }
  }
}
