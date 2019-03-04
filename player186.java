  import java.util.*;
class Find
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
       String sentence=input.nextLine();
       if(sentence.contains("Vishal")&&sentence.contains("Sundar"))
       {
         System.out.print("yes");
       }
       else {
         System.out.print("no");
       }

  }
}
