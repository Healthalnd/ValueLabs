import java.util.Arrays;

public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="abc(2,1456455445)";
		
		String[] s1=x.split("\\(|\\,|\\)");
		
		System.out.println(s1.length);
		
	System.out.println(Arrays.toString(s1));
	
	int finalCount = Integer.parseInt(s1[1])+Integer.parseInt(s1[2]);
	
	System.out.println(finalCount);	

	}

}
