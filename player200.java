import java.util.*;
class min
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
     String str=input.next();
     char ch[]=str.toCharArray();
     HashSet<Character> op=new HashSet<Character>();
     ArrayList<Character> ans=new ArrayList<Character>();
     for(int i=0;i<ch.length;i++)
     {
       if(op.add(ch[i]))
       {
         ans.add(ch[i]);
       }
     }
  for(int i=0;i<ans.size();i++)
  {
    System.out.print(ans.get(i));
  }
}
}
