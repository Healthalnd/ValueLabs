import java.util.Arrays;

public class IntSort {

	public static void main(String[] args) {

	 
	
	int[] c = {2,15,3,14};
	
	int temp;
	for(int i=0; i<=c.length-1; i++)
	{
		for(int j=i+1; j<=c.length-1; j++)
		{
			if(c[i]>c[j])
			{
				
				temp=c[i];
				c[i]=c[j];
				c[j]=temp;
				
			} 
			
			
		}
	}
		
	System.out.println(Arrays.toString(c));
	

	}

}
