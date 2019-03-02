import java.util.*;
class ways
{
  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);
    int num=input.nextInt();
    int count=0;
    for(int i=0;i<=num;i++)
    {
      for(int j=num;j>=0;j--)
      {
        if((i*1)+(j*2)==num)
        {
          count++;
        }
      }
    }
    System.out.print(count);
  }
}
