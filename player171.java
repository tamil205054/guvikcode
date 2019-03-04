import java.util.*;
class player171
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      String str=input.nextLine();
      String word[]=str.split(" ");
      for(int i=1;i<word.length-1;i++)
      {
        if(word[i].equals("and"))
        {
          String temp=word[i-1];
          word[i-1]=word[i+1];
          word[i+1]=temp;
        }
      }
      for (int i=0 ;i<word.length;i++ )
      {
      System.out.print(word[i]);
      if (i<word.length-1) {
        System.out.print(" ");
      }
      }
  }
}
