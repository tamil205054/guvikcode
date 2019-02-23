import java.util.*;
class string
{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    String str=input.next();
    int k=input.nextInt();
    int i=k-1;
    ArrayList<Character> sub=new ArrayList<Character>();
    while(i<str.length())
    {
      sub.add(str.charAt(i));
    i=i+k;
    }
    System.out.print(sub);

  }
}
