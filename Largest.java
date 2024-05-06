import java.util.Scanner;
public class Largest {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
int number = input.nextInt();

System.out.print("Enter a number or press -1 to end: ");


int largest = Integer.MIN_VALUE;
int smallest = Integer.MAX_VALUE;


while ( number != -1) {
number = input.nextInt();
         

largest = Math.max(largest, + number);
smallest = Math.min(smallest, + number);

}
System.out.print("Enter a number or press -1 to end: ");

if (number < Integer.MIN_VALUE) {
   number = smallest;
}

if (number > Integer.MAX_VALUE) {
  number = largest;
}
else {
System.out.print("No numbers were entered. ");
}
System.out.println("Entered numbers: " +number);

System.out.printf("Largest numbers: ", + smallest);

System.out.printf("Smallest numbers: ", + largest);


}
}
