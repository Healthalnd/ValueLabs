import java.util.Arrays;

public class StringSortCollection {

	public static void main(String[] args) {

		String[] c ={"sakthi", "ameer", "vel"};
	
	//char[] c = name.toCharArray();
	
	String temp;
	for(int i=0; i<=c.length-1; i++)
	{
		for(int j=i+1; j<=c.length-1; j++)
		{
			if(c[i].compareTo(c[j])>0)
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
