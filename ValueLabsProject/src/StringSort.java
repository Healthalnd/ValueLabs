import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {

	String name ="decbda";
	
	char[] c = name.toCharArray();
	
	char temp;
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
