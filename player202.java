import java.util.*;
class string
{
  public static void main(String[] args)
  {
      Scanner scan=new Scanner(System.in);
      String str=scan.next();
      ArrayList<Character> arr=new ArrayList<Character>();
      for (int i = 0; i < str.length(); i++)
      {
        char ch=str.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
          System.out.print(str.charAt(i));
        }
        else
        {
          arr.add(str.charAt(i));
        }

      }
      for(int i=0;i<arr.size();i++)
      {

          System.out.print(arr.get(i));

      }



  }
}
