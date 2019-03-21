 
import java.io.*; 
import java.util.*; 
class arraysort1 { 
	static void sortMat(int mat[][],int n, int m) 
	{ 
		 
		int temp[] = new int[n * m]; 
		int k = 0; 
	
		 
		for (int i = 0; i < n; i++)
		{			
			for (int j = 0; j < m; j++) 
			{	
			temp[k++] = mat[i][j]; 
			}
		
		} 
		Arrays.sort(temp); 
		k = 0; 
		for (int i = 0; i < n; i++)
		{			
			for (int j = 0; j < m; j++)
			{				
				mat[i][j] = temp[k++]; 
			}
		}
	} 
 
	static void printMat(int mat[][],int n, int m) 
	{ 
	  
		for (int i = 0; i < n; i++) 
		{ 
			for (int j = 0; j < m; j++)
			{				
				System.out.print( mat[i][j]);
				if(j<m-1)
				{
					System.out.print(" ");
				}
			}
			System.out.println(); 
		} 
	} 
	 
	public static void main(String args[]) 
	{ 
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		int mat[][] = new int[m][n]; 
		for (int i = 0; i < m; i++)
		{			
			for (int j = 0; j < n; j++) 
			{	
				mat[i][j] =input.nextInt(); 
			}
		
		} 
		 
	
		sortMat(mat,m,n);   
		printMat(mat,m,n); 
	
	} 
} 
 
