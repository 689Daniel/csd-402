/* Daniel Preller, 21 January 2025, Assignment 5
Program containing methods to find the largest or smallest values in two-dimensional arrays of integers or doubles
 */

public class ArrayLargestSmallest {

	public static void main(String[] args) {
		
		//Test data (A test program was not specified in assignment instructions, but I figured it was implied
		double[][] doubleTestArray = {{5.6, 7.3, 8.4}, {6.0, 7.2, 9.3, 3.4}, {8.6, 4.5}};
		int[][] intTestArray = {{3, 8, 9, 4, 1, 2}, {6, 4, 8}, {5, 11, 6, 9}};
		
		//Test operations
		int[] largestDouble = locateLargest(doubleTestArray);
		int[] largestInt = locateLargest(intTestArray);
		int[] smallestDouble = locateSmallest(doubleTestArray);
		int[] smallestInt = locateSmallest(intTestArray);
		
		//Test output
		System.out.println("The largest item in the double array is located at position " + largestDouble[0] + "," + largestDouble[1]);
		System.out.println("The largest item in the integer array is located at position " + largestInt[0] + "," + largestInt[1]);
		System.out.println("The smallest item in the double array is located at position " + smallestDouble[0] + "," + smallestDouble[1]);
		System.out.println("The smallest item in the integer array is located at position " + smallestInt[0] + "," + smallestInt[1]);
		
	}
	
	public static int[ ] locateLargest(double[ ][ ] arrayParam) {//locates the largest number in a two-dimensional array of doubles
		
		//sets initial values
		double largestValue = arrayParam[0][0];
		int largestRow = 0;
		int largestColumn = 0;
		
		for (int row = 0; row < arrayParam.length; row++) {
			for (int column = 0; column < arrayParam[row].length; column++) {//searches through every item in the array
				if (arrayParam[row][column] > largestValue) {//updates largest value and coordinates if a larger value is found
					largestValue = arrayParam[row][column];
					largestRow = row;
					largestColumn = column;
				}
			}
		}
		
		int[] largestCoordinates = {largestRow, largestColumn};
		return largestCoordinates;
	}
	
	public static int[ ] locateLargest(int[ ][ ] arrayParam) {//locates the largest number in a two-dimensional array of integers; works identically to double version
		int largestValue = arrayParam[0][0];
		int largestRow = 0;
		int largestColumn = 0;
		
		for (int row = 0; row < arrayParam.length; row++) {
			for (int column = 0; column < arrayParam[row].length; column++) {
				if (arrayParam[row][column] > largestValue) {
					largestValue = arrayParam[row][column];
					largestRow = row;
					largestColumn = column;
				}
			}
		}
		
		int[] largestCoordinates = {largestRow, largestColumn};
		return largestCoordinates;
	}
	
	public static int[ ] locateSmallest(double[ ][ ] arrayParam) {//locates the smallest number in a two-dimensional array of doubles
		
		//sets initial values
		double smallestValue = arrayParam[0][0];
		int smallestRow = 0;
		int smallestColumn = 0;
		
		for (int row = 0; row < arrayParam.length; row++) {
			for (int column = 0; column < arrayParam[row].length; column++) {//searches through every item in the array
				if (arrayParam[row][column] < smallestValue) {//updates smallest value and coordinates if a smaller value is found
					smallestValue = arrayParam[row][column];
					smallestRow = row;
					smallestColumn = column;
				}
			}
		}
		
		int[] smallestCoordinates = {smallestRow, smallestColumn};
		return smallestCoordinates;
	}
	
	public static int[ ] locateSmallest(int[ ][ ] arrayParam) {//locates the smallest number in a two-dimensional array of integers; works identically to double version
		int smallestValue = arrayParam[0][0];
		int smallestRow = 0;
		int smallestColumn = 0;
		
		for (int row = 0; row < arrayParam.length; row++) {
			for (int column = 0; column < arrayParam[row].length; column++) {
				if (arrayParam[row][column] < smallestValue) {
					smallestValue = arrayParam[row][column];
					smallestRow = row;
					smallestColumn = column;
				}
			}
		}
		
		int[] smallestCoordinates = {smallestRow, smallestColumn};
		return smallestCoordinates;
	}

}
