import java.util.*;
class date
{
  public static void main(String[] args)
  {
      Scanner scan=new Scanner(System.in);
      String str=scan.next();
      String arr[]=str.split("-");
      int mon=Integer.parseInt(arr[01]);
      String month[]={"null","January","February","March","April","May","June","July","August","September","October","November","December"};
      System.out.print(month[mon]);
  }
}
