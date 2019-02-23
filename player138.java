import java.util.*;
class power
{
public static void main(String[] args)
{
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    if((Math.ceil((Math.log(n) / Math.log(2)))) == (Math.floor(((Math.log(n) / Math.log(2)))))){
  System.out.print("yes");
    }
    else
    {
      System.out.print("no");
    }
}
}
