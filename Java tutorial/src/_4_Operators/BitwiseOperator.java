package _4_Operators;

public class BitwiseOperator {
	
	/*The unary bitwise complement operator "~" inverts a bit pattern; 
	 
it can be applied to any of the integral types, making every "0" a "1" and every "1" a "0". 

For example, a byte contains 8 bits; applying this operator to a value whose bit pattern is "00000000" would change its pattern to "11111111".

The signed left shift operator "<<" shifts a bit pattern to the left, 

and the signed right shift operator ">>" shifts a bit pattern to the right. 

The bit pattern is given by the left-hand operand, and the number of positions to shift by the right-hand operand. 

The unsigned right shift operator ">>>" shifts a zero into the leftmost position,

 while the leftmost position after ">>" depends on sign extension.

The bitwise & operator performs a bitwise AND operation.

The bitwise ^ operator performs a bitwise exclusive OR operation.

The bitwise | operator performs a bitwise inclusive OR operation.*/
	
	
	public static void main(String[] args) {
		
		/* '&&' uses short circuit behavior which means java only checks second or other operands only if it is needed.
		 * '&'  uses standard behavior which means you check all the operands even it is not needed. these behavior is same for "or"
		 * */
		//   it don't work it gives compilation error   System.out.println("5 && 7 : "+(5 && 7));
		
		//initial values
		
		int value1 = 5;
		
		int value2 = 7;
		
		
		// bitwise and
		// 0101 & 0111 = 0101
		
		System.out.println("value1 & value2 : "+ (value1 & value2));
		
		//bitwise or 
		// 0101 | 0111 = 0111
		
		System.out.println("value1 | value2 : "+ (value1 | value2));
		
		//left shift <<
		
		// after shifting left new bit which comes on far right are assigned zero "0"
		
		System.out.println("5 left shift by 1 bit is "+(5<<1));
		
		//left shift <<
		
				// after shifting right new bit which comes on far left are assigned zero "0"
				
				System.out.println("5 right shift by 1 bit is "+(5>>1));
		
	}
	
	

}