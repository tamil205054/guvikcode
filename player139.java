import java.util.*;
class binary
{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int number=input.nextInt();
    int count=0;
    String str=Integer.toBinaryString(number);
    for(int i=0;i<str.length();i++)
    {
      if(str.charAt(i)=='1')
      {
        count++;
      }
    }
    System.out.print(count);
  }
}
