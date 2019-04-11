  import java.util.*;
import java.lang.*;
class alph
{
    public static void main(String[] args) 
    {
       Scanner input=new Scanner(System.in);
       char str1[]=input.next().toCharArray();
       char str2[]=input.next().toCharArray();       
      Set<Character> result=new HashSet<Character>();
      for(char s:str1)
      {
        result.add(s);
      }
      for(char s:str2)
      {
        result.add(s);
      }
      if(result.size()==26)
      {
          System.out.println("complementary");
      }
      else
      {
          System.out.println("non-complementary");
      }
       input.close(); 
    }
}
