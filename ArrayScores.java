import java.util.Scanner;
public class ArrayScores {
	public static void main(String[] args) {
int[] score = new int[10];

Scanner input = new Scanner(System.in);

 	for( int count = 0; count < 10; count++) {
	System.out.print("Enter Scores: ");
	int scores = input.nextInt();
	score[count] = scores;
	}
	

	for (int counter = 0; counter < 10; counter++)  {
	System.out.println(score[counter]);
   	}
     }
}