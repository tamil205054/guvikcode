import java.util.*;
class string
{
  public static void main(String[] args)
  {
      Scanner ip=new Scanner(System.in);
      int n=ip.nextInt();
      String str[]=new String[n];
      for(int i=0;i<n;i++)
      {
        str[i]=ip.next();
      }
      Arrays.sort(str);
System.out.print(str[0]);      
  }
}
