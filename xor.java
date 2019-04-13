import java.util.*;
class xor
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int num[]=new int[n];
        List<Integer> result=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            num[i]=input.nextInt();
        }
        for(int i=0;i<k;i++)
        {
            int u=input.nextInt();
            int v=input.nextInt();
            int re=0;
            for(int j=u-1;j<v-1;j++)
            {
                if(j==u-1)
                {
                    re=num[j]^num[j+1];
                }
                else
                {
                    re=re^num[j+1];
                }
            }
            result.add(re);
        }
        for(int i=0;i<result.size();i++)
        {
            System.out.print("\n"+result.get(i));
            
        }
        input.close();
    }
}
