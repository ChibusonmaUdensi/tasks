public class Index{
public static void main(String[]args) {
int[] array = {43, 77 78, 99, 87, 66,  88, 88, 66, 55};

System.out.printf("%s%8s%n", "Index", "Value");
for(int counter = 0; counter < array.length; counter++) {
	System.out.printf("%5d%8d%n", counter, array[counter]);
	}
    }
}