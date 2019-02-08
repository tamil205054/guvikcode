 import java.util.Scanner;
 class digit_count 
{
    public static void main(String args[])
    {
    Scanner input =new Scanner(System.in);
    int n1[] =new int[4],n2[]=new int[4],i; 
	for(i=0;i<3;i++)
	{
        n1[i]=input.nextInt(); 
        n2[i]=input.nextInt();

	}
    for(int j=0;j<3;j++){
    if(n1[j]>n2[j])
	{ 
        System.out.println(n1[j]-n2[j]);
	}
	else
	{ 
        
        System.out.println(n2[j]-n1[j]);
	}
    }
 
    }
}
