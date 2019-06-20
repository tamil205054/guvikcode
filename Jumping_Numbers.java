import java.util.*;

public class Jumping_Numbers 
{
  
   static boolean Check(int n)
   {
    boolean result=true;
    ArrayList<Integer> digit=new ArrayList<Integer>();
    while(n>0)
    {
      digit.add(n%10);
      n=n/10;
    }
    for(int i=0;i<digit.size()-1;i++)
    {
      if(Math.abs(digit.get(i)-digit.get(i+1))!=1)
      {
        result=false;
      }
    }
    return result;
  }
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int count=0;
    for(int i=0;i<=n;i++)
    {
      if(i<10)
      {
        count++;
      }
      else if(Check(i))
      {
        count++;
      }
    }
    System.out.print(count);
      input.close();
  }
}
