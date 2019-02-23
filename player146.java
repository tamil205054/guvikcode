import java.util.*;
class number
{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int A=input.nextInt();
    int B=input.nextInt();
      if(A<10000&&B<10000&& A-B<=5)
      {
        int fact1=1,fact2=1;
        for (int i=1;i<=A;i++)
        {
            fact1*=i;
        }
        for (int i=1;i<=B;i++)
        {
            fact2*=i;
        }
        System.out.print(fact1/fact2);
      }

  }
}
