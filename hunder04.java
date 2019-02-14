import java.util.*;
import java.lang.*;
class number
{
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a[]=new  int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        ArrayList<Integer> array = new ArrayList<Integer>();
int count=0;        
Arrays.sort(a);
int flag=0;        
for(int i = 0; i < n; i++)
{
    for(int j = 0; j < n; j++)
    {
        if(i != j)
        {
            if(a[i] != a[j])
            {
                flag = 1;
            }
            else
            {
                flag = 0;
                break;
            }
        }
    }
    if(flag == 1)
    {   
     array.add(a[i]);
    }
}
for(int i=0;i<array.size();i++)
{
    System.out.print(array.get(i));
    if(i<array.size()-1)
    {
        System.out.print(" ");
    }
}
             
    }
}
