import java.util.*;
class range
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
     if(n<=100000)
     {
      int num[]=new int[n];
      for (int i=0;i<n;i++)
      {
        num[i]=input.nextInt();
      }
      ArrayList<Integer> ans=new ArrayList<Integer>();
      for(int i=0;i<n-1;i++)
      {
          if(num[i+1]%num[i]==0)
          {
              ans.add(num[i+1]);
          }
      }
      for(int i=0;i<ans.size();i++)
      {
        System.out.print(ans.get(i));
        if (i<ans.size()-1) {
          System.out.print(" ");
        }
      }

    }
  }
}
