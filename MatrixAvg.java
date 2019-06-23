import java.util.*;
 public class MatrixAvg{ 
	  
	  
	public static void main (String[] args) 
	{ 
		Scanner input=new Scanner(System.in);
		int n = input.nextInt();
		float sum=0.000000f; 
		float arr[][]=new float[n][n];
		 for(int i=0;i<n;i++)
		 {
		 	for (int j=0;j<n;j++ ) 
		 	{
		 		arr[i][j]=input.nextFloat();
		 		sum+=arr[i][j];	
		 	}

		 }
		 float avg=sum/(n*n);
		 System.out.printf("%.6f",avg);
		input.close();
	} 
} 

 
