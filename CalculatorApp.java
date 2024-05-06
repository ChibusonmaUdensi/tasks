import java.util.Scanner;
public class CalculatorApp {
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Welcome to E-store, Please enter customer Name");
String name = input.nextLine();


int total =0;
int count = 1;
int percentRate = 10/100;
double discount = 0.01;
double discountedCost = total - (discount * total);


while  (count <=10) {
	System.out.println("Please enter cost for item " + count);
	int cost = input.nextInt();
count = count + 1;
total += cost;
 }
System.out.println("Original cost:");
System.out.print(total);


if (total >=200); {
System.out.print(discountedCost);
	}
}
}