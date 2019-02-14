import java.util.*;
class triangle
{
    public static void main(String ar[])
    {
        Scanner input =new Scanner(System.in);
        int number=input.nextInt();
        ArrayList<Integer> num=new ArrayList<Integer>();
        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
            {
                if(i%2!=0)
                {
                     num.add(i);
                }
            }
        }
        for(int i=0;i<num.size();i++)
            {    
                System.out.print(num.get(i));
                if(i<num.size()-1)
                {                            
                    System.out.print(" ");
                
                }   
            }
    }
}
