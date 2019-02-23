import java.util.*;
class sum
{
  public static void main(String[] args)
  {
      Scanner in=new Scanner(System.in);
      String line=in.nextLine();
      String str=in.next();
      String arr[]=line.split(" ");
      for(int i=0;i<arr.length;i++)
      {
        if(str.equals(arr[i]))
        {
          System.out.print(i+1);
        }
      }

  }
}
