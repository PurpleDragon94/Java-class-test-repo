package Questions;

public class Q1 {

	int Sort(bubbleArray[]) {
		int n= 0;
		int a = bubbleArray.length;
		
		for(int i = 0; i < a-1; i++) {
			
			for(int h = 0; h < (n - 1); h++) {
				
				if (bubbleArray[h - 1] > bubbleArray[h] ) {
					
					 int temp = bubbleArray[h];
	                    bubbleArray[h] = bubbleArray[h+1];
	                    bubbleArray[h+1] = temp;
				}
				System.out.println(bubbleArray);
			}
		}
		return a;
		
	}
} 

