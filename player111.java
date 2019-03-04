  import java.util.*;
class sum
{
  public static void main(String[] args)
  {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int m=in.nextInt();
      if(n<=100000&&m<=100000)
      {
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++)
        {
          arr1[i]=in.nextInt();
        }
        for(int i=0;i<m;i++)
        {
          arr2[i]=in.nextInt();
        }
       
        ArrayList<Integer> match=new ArrayList<Integer>();
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0;i<Math.max(m,n);i++)
        {
          for(int j=0;j<Math.min(m,n);j++)
          {
            if(arr1[i]==arr2[j])
              {
                if(h.add(arr1[i]))
                {
                  match.add(arr1[i]);
                }
              }
          }
        }
        Collections.sort(match);
        for(int i=0;i<match.size();i++)
        {
          System.out.print(match.get(i));
          if(i<match.size()-1)
          {
            System.out.print(" ");
          }
        }
      }
  }
}
