 import java.util.*;
 public class Weight
 { 
     public static void main (String[] args) 
     {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int w=input.nextInt();
        List<Integer>arr1=new ArrayList<Integer>();
        List<Integer>arr2=new ArrayList<Integer>();
        List<Integer>result=new ArrayList<Integer>();
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr1.add(input.nextInt());
        }
        for(int i=0;i<n;i++)
        {
            arr2.add(input.nextInt());
        }
        for(int i=0;i<n;i++)
        {
            int flag=arr2.get(i)/arr1.get(i);
            result.add(flag);
        }
        while (w>=0 && result.size()>0)
        {
            int max=Collections.max(result);
            int min=0;
            for(int i=0;i<result.size();i++)
            {
                if(max==result.get(i))
                {
                    min=i;
                    break;
                }
            }
            if(w>=arr1.get(min))
            {
                count+=arr2.get(min);
                w-=arr1.get(min);
            }
            arr1.remove(min);
            arr2.remove(min);
            result.remove(min);
        }
        System.out.println(count);
     }
 }
 
 
 
 
 
 
 
 
 
 
 
