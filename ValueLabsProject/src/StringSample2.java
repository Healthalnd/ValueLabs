import java.util.Arrays;

public class StringSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="#@bvcr1100#(@2#,#30)";
		
		String[] s1=x.split("\\#|\\@|\\)|//,|\\(|bvcr");
		
		System.out.println(s1.length);
		
	System.out.println(Arrays.toString(s1));
	
	for (int i= 0; i<=s1.length-1;i++)
	{
		System.out.println("************:"+s1[i]);
	}
	
	
	int finalCount = Integer.parseInt(s1[8]) +Integer.parseInt(s1[6]) +Integer.parseInt(s1[3]) ;
	
	System.out.println(finalCount);	

	}

}

// @bvcr10  