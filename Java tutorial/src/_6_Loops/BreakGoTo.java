package _6_Loops;

public class BreakGoTo {
	
	public static void main (String [] args) {
		
/* In addition to its uses with the switch statement and loops, the break statement can also be
		
employed by itself to provide a “civilized” form of the goto statement. Java does not have a

goto statement because it provides a way to branch in an arbitrary and unstructured

manner. This usually makes goto-ridden code hard to understand and hard to maintain. It

also prohibits certain compiler optimizations. There are, however, a few places where the

goto is a valuable and legitimate construct for flow control. For example, the goto can be

useful when you are exiting from a deeply nested set of loops. To handle such situations,

Java defines an expanded form of the break statement. By using this form of break, you can,

for example, break out of one or more blocks of code. These blocks need not be part of a

loop or a switch. They can be any block. Further, you can specify precisely where execution

will resume, because this form of break works with a label. As you will see, break gives you

the benefits of a goto without its problems.*/
		
	outer :	for (int i = 0; i < 3; i++) {
				
				System.out.print("the pass " + i + " :");
				
				inner : for (int j = 0; j < 100; j++ ) {
					
					if(j == 10)
						break outer;
					System.out.print(j+" ");
					
					
					
				}
				
				System.out.println("This will won't print");
			
		}
	
	
		System.out.println();
		System.out.print("This  will be printed because of break of outer loop");
	}
	
	

}
