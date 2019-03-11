import java.util.*;
class sum
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        ArrayList<Integer> in=new ArrayList<Integer>();
        while (n != 0) 
        {   int m=n % 10;
            in.add(m);
            n = n/10; 
        } 
        int additon=0;
        for(int i=0;i<in.size();i++)
        {
            int sum=0;
            for(int j=0;j<=i;j++)
            {
                sum=sum+in.get(i);
            }
            additon=additon+sum;
        }
        System.out.println(additon);
        input.close();
    }
}
