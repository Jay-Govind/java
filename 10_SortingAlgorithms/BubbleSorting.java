import java.util.*;

public class BubbleSorting {

    public static void bubbleSort(int[] arr) {

        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean sorted = true;
            for (int j = 0; j < arr.length - 1 - turn; j++) {

                if (arr[j] > arr[j + 1]) {

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    sorted = false;
                }
            }
            if (sorted)
                break;
        }
    }

    public static void printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many number you want to store ? ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {

            System.out.print("Enter the " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();

        }

        bubbleSort(arr);

        System.out.print("Sorted array : ");
        System.out.println(Arrays.toString(arr)); // built in function
        // printArr(arr); // my function

        sc.close();
    }
}
