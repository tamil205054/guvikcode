import java.util.Scanner;
 class digit_count 
{
    public static void main(String args[])
    {
    Scanner input =new Scanner(System.in);
    int n1,n2,i; 
	 n1=input.nextInt(); 
        n2=input.nextInt();

	 
    if(n1>n2)
	{ 
        System.out.println(n1-n2);
	}
	else
	{ 
        
        System.out.println(n2-n1);
	}
    }
 
}
