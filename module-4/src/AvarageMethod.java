/* Daniel Preller, 14 January 2026, Assignment 4
Program to demonstrate overloaded methods for averaging numeric array elements
*/

public class AvarageMethod {

	public static void main(String[] args) {
		
		//Sample arrays (numbers generated randomly)
		short[] shortArray = {330, 853, 262, 8, 824, 720};
		int[] intArray = {9230, 9983, 3787, 5811, 6625};
		long[] longArray = {2870, 5023, 7315, 6170};
		double[] doubleArray = {6694.7664, 38.4008, 2701.1225};
		
		//Display results
		System.out.print("Short array: ");
		for (short item : shortArray) {
			System.out.print(item + " ");
		}
		System.out.println("\nAverage: " + average(shortArray) + "\n");
		
		System.out.print("Int array: ");
		for (int item : intArray) {
			System.out.print(item + " ");
		}
		System.out.println("\nAverage: " + average(intArray) + "\n");
		
		System.out.print("Long array: ");
		for (long item : longArray) {
			System.out.print(item + " ");
		}
		System.out.println("\nAverage: " + average(longArray) + "\n");
		
		System.out.print("Double array: ");
		for (double item : doubleArray) {
			System.out.print(item + " ");
		}
		System.out.println("\nAverage: " + average(doubleArray) + "\n");

	}
	
	//Sums an array of shorts and divides by length to find and return the average
	public static short average(short[] array) {
		long sum = 0;// long type is used to allow for maximum number and size of array elements
		for (short number : array) {
			sum += number;
		}
		short average = (short) (sum / array.length);
		return average;
	}
	
	//Work identically to original average method but with different data types
	public static int average(int[] array) {
		long sum = 0;
		for (int number : array) {
			sum += number;
		}
		int average = (int) (sum / array.length);
		return average;
	}
	
	public static long average(long[] array) {
		long sum = 0;
		for (long number : array) {
			sum += number;
		}
		long average = sum / array.length;
		return average;
	}
	
	public static double average(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		double average = sum / array.length;
		return average;
	}

}