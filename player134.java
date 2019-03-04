import java.util.*;
class range
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int l=input.nextInt();
      int r=input.nextInt();
      int num[]=new int[n];
      for (int i=0;i<n;i++)
      {
        num[i]=input.nextInt();
      }
      ArrayList<Integer> ans=new ArrayList<Integer>();
      for(int i=l-1;i<r;i++)
      {
        ans.add(num[i]);
      }
      Collections.sort(ans);
      System.out.print(ans.get(0));
  }
}
