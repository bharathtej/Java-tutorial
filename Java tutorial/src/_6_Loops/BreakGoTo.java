package _6_Loops;

public class BreakGoTo {
	
	public static void main (String [] args) {
		
	outer :	for (int i = 0; i < 3; i++) {
				
				System.out.print("the pass " + i + " :");
				
				inner : for (int j = 0; j < 100; j++ ) {
					
					if(j == 10)
						break outer;
					System.out.print(j+" ");
					
				}
				
				System.out.println("This will won't print");
			
		}
	
		System.out.println("This  will be printed because of break of outer loop");
	}
	
	

}
