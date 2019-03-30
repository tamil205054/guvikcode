import java.util.*;
class prime
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int two=2;
        ArrayList<Integer> prime=new ArrayList<Integer>();
        for(int i=0;i<=n;i++)
        {
            int count=0;
            for(int j=1;j<=two;j++)
            {
                if(two%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                prime.add(two);
            }
            two++;
        }
        int flag=0;
        for(int i=0;i<prime.size();i++)
        {
            for(int j=i;j<prime.size();j++)
            {
                if(prime.get(i)+prime.get(j)==n)
                {
                    // System.out.println(prime.get(i)+"+"+prime.get(j)+"="+ (prime.get(i)+prime.get(j)));
                    flag++;
                }
            }
        }
        System.out.println(flag);
        in.close();
    }
}
