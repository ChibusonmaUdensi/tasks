import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

 	public class AverageArray {
	public static void main(String [] args) {
	
	Scanner input = new Scanner(System.in);

	
	String names;
	int ages;
	int total = 0;
	
	int average;


	List<String> allNames = new ArrayList<String>();
	



	for (int counter = 0; counter < 5; counter++) {

	System.out.println("Enter the names: ");
	names = input.nextLine();
	
	
	System.out.println("Enter the ages: ");
	ages = input.nextInt();
	total += ages;
	input.nextLine();
allNames.add(names + " " + ages + " \n");
	}

for (String mercy : allNames){
	System.out.print(mercy);
	}
	System.out.print(total);
 
      }
}
