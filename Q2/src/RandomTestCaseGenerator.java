import java.util.Arrays;
import java.util.Random;

public class RandomTestCaseGenerator {
    public static int[] generateRandomArray(int size, int maxValue) {
        int[] arr = new int[size];  //creates array of size *size*
        Random random = new Random();   //defines new random integers to be inserted
        for (int i = 0; i < size; i++) {    //builds randomized array.
            arr[i] = random.nextInt(maxValue + 1);
        }
        return arr; //sends array to the main func
    }

    public static void main(String[] args) {
        int numTests = 10;      // Number of random test cases
        int maxSize = 100;      // Maximum size of the array
        int maxValue = 1000;    // Maximum value for elements in the array

        for (int i = 1; i <= numTests; i++) {       //runs number of tests equal to numTests
            int size = new Random().nextInt(maxSize) + 1; // Random size for the array.
            int[] inputArray = generateRandomArray(size, maxValue);    //
            System.out.println("Test Case " + i + ":"); //prints test #
            System.out.println("Input Array: " + Arrays.toString(inputArray));  //prints input array

            // Calls bubble sort on each test
            Sort.bubbleSort(inputArray);

            System.out.println("Sorted Array: " + Arrays.toString(inputArray)); //prints sorted array
            System.out.println();   //new line for spacing
        }
    }
}