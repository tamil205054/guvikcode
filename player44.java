import java.util.*;
class substr
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      String str=input.next();
      int n=input.nextInt();
      if(n<=str.length())
      {
      String str1=str.substring(str.length()-n);
    String str2=str.substring(0,str.length()-n);
      System.out.println(str1+str2);
    }
    else
    {
      System.out.print(str);
    }
  }
}
