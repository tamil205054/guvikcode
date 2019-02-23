import java.util.*;
import java.lang.*;
import java.io.*;
class string_reverse
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      String sentence=input.nextLine();
      String str[]=sentence.split(" ");
      int len=str.length;
      ArrayList<String>arr=new ArrayList<String>();
      for(int i=0;i<len;i++)
      {
        if(i!=0&&i!=len-1)
        {
          StringBuilder temp = new StringBuilder();
          temp.append(str[i]);
          temp=temp.reverse();
          arr.add(temp.toString());
        }
        else
        {
          arr.add(str[i]);
        }
      }
      for(int i=0;i<arr.size();i++)
        {
          System.out.print(arr.get(i));
          if(i<arr.size()-1)
          {
            System.out.print(" ");
          }
        }
  }
}
