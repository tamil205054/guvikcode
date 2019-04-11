import java.util.*;
import java.lang.*;
class Merge
{
    public static void main(String[] args) 
    {
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       List<Integer> result=new ArrayList<Integer>();
       for(int i=0;i<=n;i++)
       {
           String str=input.nextLine();
           StringTokenizer str_arr = new StringTokenizer(str);   
            while (str_arr.hasMoreTokens()) 
                { 
                    result.add(Integer.parseInt(str_arr.nextToken()));
                } 
 
       }
       Collections.sort(result);
       for(int i=0;i<result.size();i++)
       {
        System.out.print(result.get(i));
        if(i<result.size()-1)
        {
            System.out.print(" ");
        }
       } 
       input.close(); 
    }
}
