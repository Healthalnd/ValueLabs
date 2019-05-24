import java.util.HashMap;
import java.util.Map;

public class Stringduplicateremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="INDIA";
		char[] c= name.toCharArray();
		Map<Character, Integer> m1= new HashMap<Character, Integer>();
		
		for(Character ch:c)
		{
			if(m1.containsKey(ch))
			{
				m1.put(ch, m1.get(ch)+1);
			}else
			{
				m1.put(ch, 1);
			}
			
		}
		
		
		System.out.println(m1);
	}

}
