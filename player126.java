  import java.util.*;
class k_time
{
  public static void main(String[] args)
  {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k=in.nextInt();
      if(n<=100000&&k<=100000)
      {
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
          arr1[i]=in.nextInt();
        }
        ArrayList<Integer> num=new ArrayList<Integer>();
        HashSet<Integer> check=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
          int count=0;
          for(int j=0;j<n;j++)
          {
            if(arr1[i]==arr1[j])
            {
              count++;
            }
          }
          if(count<k)
          {
            if(check.add(arr1[i]))
            {
              num.add(arr1[i]);
            }
          }
        }
        for(int i=0;i<num.size();i++)
        {
          System.out.print(num.get(i));
          if(i<num.size()-1)
          {
            System.out.print(" ");
          }
        }

          }
  }
}
