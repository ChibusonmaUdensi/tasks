import java.util.Scanner;
	public class EvenNumber {
	 public static void main (String [] args){

Scanner input = new Scanner(System.in);
	
int sum = 0;
int i = 1; 
int average = 0;

for (i = 1; i <= 10; i++) {
System.out.print("Enter an integer: ");
	int num =input.nextInt();
}
	if (num % 2 == 0 ){
 		sum +=num;
}
	System.out.print("Sum is :" +sum);
 
	average = sum / i;
	System.out.print("average is : " + average);
}
  }
  
