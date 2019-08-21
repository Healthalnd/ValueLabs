
public class Sum {

	
	public static void main(String[] args) {
		
		int n = 220;
		
		int sum =0, temp, remin;
		temp=n;
		while(n!=0)
		{
			remin=n%10;
			sum =sum+remin;
			n=n/10;
			
		}
		
		 System.out.println(sum);
		
		
	}
}
