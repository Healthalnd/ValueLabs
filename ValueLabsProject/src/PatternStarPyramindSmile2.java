
public class PatternStarPyramindSmile2 {

	public static void main(String[] args) {

		int n = 9;

		int tempFirst = 1, tempSec = 9;
		for (int k = 1; k <= n; k++) {
			for (int i = 1; i <= n; i++) {
				if (i == tempFirst) {
					System.out.print("*");

				} else if (i == tempSec ) {
					System.out.print("*");

				} else {

					System.out.print(" ");
				}

				// System.out.println(tempSec);
			}
			System.out.println();
			tempFirst = tempFirst + 1;
			tempSec = tempSec - 1;
			
			if(tempFirst>4||tempSec<4)
			{
				tempFirst=0;
				tempSec=0;
			}
		}
	}
}
