package Questions;

public class Q2 {
	
	
	int b = 0;
	int c = 1;
	int e;
	int i;
	int counter = 25;
	
	System.out.println(b + " " + c);
	
	for(i=2;i<counter;++i){
		e= b + c;
		System.out.println(" " + e);
		
		b = c; 
		c = e;
		
	}

}
