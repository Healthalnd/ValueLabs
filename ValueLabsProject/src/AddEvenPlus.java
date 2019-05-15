
public class AddEvenPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] number= {1,2,3,4,5,6,7};
		int addTemp=0, evenTemp=0 , multiple;
		
		for(Integer i:number)
		{
			
			if(i%2==0)
			{
				addTemp=addTemp+i;
				
			}else
			{
				evenTemp=evenTemp+i;
			}
			
			
		}
		
		multiple = addTemp*evenTemp;
		System.out.println(multiple);
		

	}

}
