import java.util.Scanner;
public class Average {
Scanner input = new Scanner(System.in){

into total =0;
int gradeCounter = 0;

System.out.print("Enter grade or -1 to quit: ");
int grade = input.nextInt();
 
while (grade != -1) {
total = total + grade;
gradeCounter = gradeCounter + 1;

System.out.print("Enter grade or -1 to quit: ");
  grade = input.nextInt();
}
if (gradeCounter !=0) {
double average = (double) total/ gradeCounter;

System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
System.outprintf("Average is %.2f%n:, average);
}
 else {
System.out.println("No grades were entered");
    }
  }
}