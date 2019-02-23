import java.util.*;
class date
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      String str=input.next();
      String val[]=str.split("/");
      int date=Integer.parseInt(val[0]);
      int month=Integer.parseInt(val[1]);
      int year=Integer.parseInt(val[2]);
      if(date>=1 && date<=31 && month>=1 && month<=12 && val[1].length()==2 && val[2].length()==4)
      {
        System.out.print("yes");
      }
      else
      {
        System.out.print("no");
      }
  }
}
