import java.util.*;
class string
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      String line=input.nextLine();
      String str=input.next();
      String array[]=line.split(" ");
      int n=array.length;
     
      for (int i=0;i<n;i++)
      {
          if(!(array[i].equals(str)))
          {
            System.out.print(array[i]);
            if(i<n-2)
            {
              System.out.print(" ");
            }
          }
      }
  }
}
