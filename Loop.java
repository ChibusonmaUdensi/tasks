import java.util.Scanner;
public class Loop {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter a number: ");
int number = input.nextInt();

int i  = 1;
while ( i <= number ) {

if (number % i == 0) {
System.out.println(i);



  }
i++;
 }
}
}