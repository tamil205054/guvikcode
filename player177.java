import java.util.*;
class Vowels
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
       String sentece=input.nextLine();
       String str[]=sentece.split(" ");
int n=str.length;
          String ans[]=new String[n];
        for(int i=0;i<n;i++)
        {
          char ch[]=str[i].toCharArray();
          Arrays.sort(ch);
          ans[i]=new String(ch);
        }

        for(int i=0;i<n;i++)
        {
          System.out.print(ans[i]);
          if (i<n-1)
          {
            System.out.print(" ");
          }
        }

  }
}
