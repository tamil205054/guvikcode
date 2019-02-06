import java.util.Scanner;
class Prime {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int num =input.nextInt();
        int flag=0;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag =flag+1;
                break;
            }
        }

        if (flag==1)
        {
            System.out.println("no");
        }
        else
        {
            System.out.println("yes");
        }  
    }
}
