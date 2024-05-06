import java.util.Scanner;
public class Interest{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("enter balance and interest rate:");
int balance = input.nextInt();
        
double annualPercentageInterestRate = input.nextDouble();
double interest = balance * (annualPercentageInterestRate / 1200);

System.out.printf("The interest is %.5f", interest);
	
  }

}