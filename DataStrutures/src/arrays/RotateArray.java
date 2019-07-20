package arrays;

public class RotateArray {

    private void leftRotate(int[] inputArray, int noOfRotation) {
        for (int index = 0; index < noOfRotation; index++) {
            leftRotateByOne(inputArray);
        }
    }

    void leftRotateByOne(int inputArray[]) {
        int arrayIndex, temp;
        temp = inputArray[0];
        for (arrayIndex = 0; arrayIndex < inputArray.length - 1; arrayIndex++)
            inputArray[arrayIndex] = inputArray[arrayIndex + 1];
        inputArray[arrayIndex] = temp;
    }

    /* utility function to print an array */
    void printArray(final int arr[]) {
        for (int index = 0; index < arr.length; index++)
            System.out.print(arr[index] + " ");
    }


    public static void main(String[] args) {
        //Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        int noOfRotation = 4;
        RotateArray rotateArray = new RotateArray();
        rotateArray.leftRotate(inputArray, noOfRotation);
        rotateArray.printArray(inputArray);
    }

}
