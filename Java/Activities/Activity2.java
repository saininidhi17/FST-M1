package Activity2;
import java.util.*;

public class Activity2 {

	public static void main(String[] args) {
        //Initialize the array
        int[] numArr = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(numArr));
        
        int searchNum = 10;
        int sum = 30;

        //Print result
        System.out.println("Result: " + result(numArr, searchNum, sum));
    }

    public static boolean result(int[] arr, int searchNum, int verifySum) {
        int temp = 0;
        //Loop through array using enhanced for loop
        for (int number : arr) {
            //If value is 10
            if (number == searchNum) {
                //Add them
                temp += searchNum;
            }

            //Check if sum is not be more than 30
            if (temp > verifySum) {
                break;
            }
        }

        //Return true if condition is true
        return temp == verifySum;
    }
}
