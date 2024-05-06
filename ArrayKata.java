import java.util.Scanner;

public class ArrayKata {

public static int minimum (int[] array) {
int[] minimum = array[0];
  for ( int i = 0; i < length; i++) {
	if (array[i] < minimum) {
	minimum = array[i];
}
	return minimum;
}
 public static int maximum (int[] array) {
  int[] maximum = array[0];

   for ( int i = 0; i < length; i++) {
	if (array[i] > maximum) {
	maximum = array[i];
}
	return maximum;

	}
}
}



public static void main(String [] args){

int[] numbers = {23, 78, 52, 49, 60, 88, 70};
MinimumAndMaximum m = new minimumAndMaximum();
System.out.print("minimum is " +m.minimum(myArray));
System.out.print("maximum is " +m.maximum(myArray));

	}
}