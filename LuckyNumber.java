import java.util.Scanner;
		public class LuckyNumber {

		public static void main(String[] args){	
		Scanner input = new Scanner(System.in);

  		

	 	int luckyNumber = 100;
		int count = 0;
		while(luckyNumber <=  100) {

		
		System.out.println("Enter a number: ");
		int number = input.nextInt();

	
		if(number == luckyNumber){
		System.out.println("Correct number");
		break;

		}

		else {
		System.out.println("try again");
		}
		
		  }
	       }

   }
