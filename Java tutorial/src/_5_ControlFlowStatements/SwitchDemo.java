package _5_ControlFlowStatements;

public class SwitchDemo {
	
	
	/*Unlike if-then and if-then-else statements, the switch statement can have a number of possible execution paths.
	 * 
	 *  A switch works with the byte, short, char, and int primitive data types. 
	 *  
	 *  It also works with enumerated types (discussed in Enum Types), the String class, 
	 *  
	 *  and a few special classes that wrap certain primitive types: Character, Byte, Short, and Integer (discussed in Numbers and Strings).*/

	public static void main(String[] args) {
		int month = 13;
		
		String monthString;
		
		switch(month) {
		case 1:
			monthString = "January";
			break;
			
		case 2:
			monthString = "February";
			break;
			
		case 3:
			monthString = "March";
			break;
		
		case 4:
			monthString = "April";
			break;
			
		case 5:
			monthString = "May";
			break;
			
		case 6:
			monthString = "June";
			break;
			
		case 7:
			monthString = "July";
			break;
			
		case 8:
			monthString = "August";
			break;
		
		case 9:
			monthString = "September";
			break;
			
		case 10:
			monthString = "Octomber";
			break;
		
		case 11:
			monthString = "November";
			break;
			
		case 12:
			monthString = "December";
			break;
			
		default:
			monthString = "Invalid Month number";
			break;
		
		}
		
		
		System.out.println("Month : "+ monthString);

	}

}
