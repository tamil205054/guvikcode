import java.util.*;
class Matrix{

    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
        int arr[][] =new int[n][n];
        int total = 0;

        for(int i=0; i<n; i++)
		{
			for(int j=0;j<n;j++)
			{
				 arr[i][j]=input.nextInt();
			}
        }
		
        for(int i=0; i<n; i++)
		{
			for(int j=0;j<n;j++)
			{
				 total+=arr[i][j];
			}
        }
 
       float average = total / (n*n);
        System.out.format("%.6f",average);
    }
}
