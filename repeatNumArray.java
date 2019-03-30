import  java.util.*; 
class array
{
	public static void main (String[] args) 
	{ 
		Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int arr[][]=new int[n][k];
        Set<Integer> result=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<k;j++)
            {
                arr[i][j]=input.nextInt();
            }
        }	
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<k;j++)
            {
                int find=arr[i][j];
                int flag=0;
                for(int t=0;t<n;t++)
                {
                    for(int y=0;y<k;y++)
                    {
                         if(find==arr[t][y])
                         {
                             flag++;
                             break;
                         }
                    }
                }	
                if(flag==k)
                {
                    result.add(find);
                }
            }
        }
        List<Integer> output=new ArrayList<Integer>(result);
        for(int i=0;i<output.size();i++)
        {
            System.out.print(output.get(i));
            if(i<output.size()-1)
            {
                System.out.print(" ");
            }
        }	 

		input.close();
	}
}
