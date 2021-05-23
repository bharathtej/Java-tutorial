package _6_Loops;

public class WhileLoop {
	
	/* The while statement continually executes a block of statements while a particular condition is true. Its syntax can be expressed as:

				while (expression) {
     				statement(s)
				}

	The while statement evaluates expression, which must return a boolean value. 

	If the expression evaluates to true, the while statement executes the statement(s) in the while block. 

	The while statement continues testing the expression and executing its block until the expression evaluates to false. */
	
	public static void main(String[] args) {
		
		int count = 1;
		
		while(count<10)
			System.out.println("count is "+ count++);
	}

}
