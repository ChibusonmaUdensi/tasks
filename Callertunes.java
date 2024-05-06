import java.util.Scanner;
public class Callertunes{
public static void main(String[] args){

String prompt = """
Hi, Welcome
Press
1 -> For Sauces
2 -> For Stews 
3 -> For Rice
""";

System.out.println(prompt);
Scanner keyboardInput = new Scanner(System.in);
int userInput = keyboardInput.nextInt();

switch (userInput) {
 case 1 ->  System.out.println("Sauces");
 case 2 -> stewMenu();
 case 3 -> System.out.println("Rice");
default -> System.out.println("E no dey");

}

String Prompt2 = """
Hi, Welcome
Press
1 -> For ChickenSauce
2 -> For FishSauce 
3 -> For TomatoSauce
""";

System.out.println(Prompt2);
int userInput1 = keyboardInput.nextInt();
switch (userInput) {
 case 1 -> System.out.println("ChickenSauce");
 case 2 -> System.out.println("FishSauce");
 case 3 -> System.out.println("TomatoSauce");
default -> System.out.println("Not available");
}




}

}

public static void stewMenu(){
String Prompt3 = """
Hi, Welcome
Press
1 -> For ChickenStew
2 -> For FishStew 
3 -> For BeefStew
""";
System.out.println("Stews");
System.out.println(Prompt3);
int userInput2 = keyboardInput.nextInt();
switch (userInput) {
 case 1 -> System.out.println("ChickenStew");
 case 2 -> System.out.println("FishStew");
 case 3 -> System.out.println("BeefStew");
default -> System.out.println("Not available");
}

}
}