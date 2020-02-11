package arrays;

public class MaxValueSumRotatedArray {
    // Java program to find max value of i*array[i]
    static int array[] = new int[]{10, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    // Returns max possible value of i*array[i]
    static int maxSum() {
        // Find array sum and i*array[i] with no rotation
        int arraySum = 0; // Stores sum of array[i]
        int currentValue = 0; // Stores sum of i*array[i]
        for (int i = 0; i < array.length; i++) {
            arraySum = arraySum + array[i];
            currentValue = currentValue + (i * array[i]);
        }

        // Initialize result as 0 rotation sum
        int maxValue = currentValue;

        // Try all rotations one by one and find
        // the maximum rotation sum.
        for (int j = 1; j < array.length; j++) {
            currentValue = currentValue + arraySum - array.length * array[array.length - j];
            if (currentValue > maxValue)
                maxValue = currentValue;
        }

        // Return result
        return maxValue;
    }

    // Driver method to test the above function
    public static void main(String[] args) {
        System.out.println("Max sum is " + maxSum());
    }
}
