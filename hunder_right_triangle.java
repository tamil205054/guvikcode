import java.util.*;
class triangleright
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(1);
                if(j<i-1)
                {
                    System.out.print(" ");
                }
                
            } 
            System.out.println();
        }
    }
}
