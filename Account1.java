import java.util.Scanner;
public class Account1{

public static void main(String [] args){

System.out.print("NwanyiSunday type something..");
Scanner scanner = new Scanner(System.in);

 int collectedInput = scanner.nextInt();
System.out.println(collectedInput );
System.out.print("NwanyiSunday type second number");

int secondNumber = scanner.nextInt();
int sum = collectedInput + secondNumber;

System.out.println("The sum is: "+sum);

System.out.print("NwanyiSunday type third number");
int thirdNumber = scanner.nextInt();

System.out.print("NwanyiSunday type fourth number");
int fourthNumber = scanner.nextInt();

int difference = thirdNumber- fourthNumber;
System.out.println("The difference of the integers is: "+difference);

}


}