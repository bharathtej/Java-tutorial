package _5_ControlFlowStatements;

public class IfElse {
	
	public static void main(String[] args) {
		int testScore = 76;
		
		char grade;
		
		if(testScore >= 90)
			grade = 'A';
		
		else if (testScore >=80)
			grade = 'B';
		
		else if (testScore >=70)
			grade = 'C';
		
		else if (testScore >=60)
			grade = 'D';
		
		else if (testScore >=50)
			grade ='E';
		
		else
			grade ='F';
		
		System.out.println("The grade of the student is  : "+grade);
		
		//nested IF statement
		
		int i = 50;
		
		if (i == 50) {
			System.out.println("i == 50");
			
			if (i < 75) {
				System.out.println("i < 75");
				
				if (i < 55) {
					System.out.println("i < 55");
				}
			}
		}
				
		
	}

}
