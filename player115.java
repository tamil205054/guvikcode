import java.util.*;
class concat
{
  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);
    String str1=input.next();
    String str2=input.next();
    int len1=str1.length();
    int len2=str2.length();
    int min =Math.min(len1,len2);
    String str3=str1.substring(0,min);
    String str4=str2.substring(0,min);
    System.out.print(str3+str4);
  }
}
