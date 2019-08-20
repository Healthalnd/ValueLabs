import java.util.HashMap;
import java.util.Map;

public class StringduplicateremoveSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="INDIAAAII", temp="";
		
		for(int i=0; i<=name.length()-1;i++)
		{
			char c=name.charAt(i);
			if(!temp.contains(String.valueOf(c)))
			{
				temp=temp+name.charAt(i);
				
			}
		}
		
		 System.out.println(temp);
	}

}
