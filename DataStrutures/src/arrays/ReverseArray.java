package arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        printArray(arr);
        reverseArray(arr);
        System.out.println();
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int temp;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
