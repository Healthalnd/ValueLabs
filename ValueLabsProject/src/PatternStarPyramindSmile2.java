
public class PatternStarPyramindSmile2 {

	public static void main(String[] args) {

		int n = 9;

		int tempFirst = 1, tempSec = 9, Count =0;
		for (int k = 1; k <= n; k++) {
			for (int i = 1; i <= n; i++) {
				if (i == tempFirst) {
					System.out.print("*");
					if(k==3)
						Count=1;

				} else if (i == tempSec ) {
					System.out.print("*");
					if(k==3)
					Count=1;

				} else {
					if(k==3 && Count==1 &&tempSec>=3)
					{
						System.out.print("*");
					}else

					System.out.print(" ");
				}

				// System.out.println(tempSec);
				
			}
			System.out.println();
			tempFirst = tempFirst + 1;
			tempSec = tempSec - 1;
			
	
			
			if(tempFirst>3||tempSec<3)
			{
				tempFirst=0;
				tempSec=0;
			}
		}
	}
}
