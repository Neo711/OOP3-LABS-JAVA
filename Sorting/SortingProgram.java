import java.util.Arrays;
import java.util.Scanner;

public class SortingProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of integers:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Choose a sorting algorithm:");
        System.out.println("1. Bubble Sort\n2. Quick Sort\n3. Insertion Sort\n4. Selection Sort");
        int choice = sc.nextInt();

        System.out.println("Before sorting: " + Arrays.toString(arr));

        switch (choice) {
            case 1:
                bubbleSort(arr);
                break;
            case 2:
                quickSort(arr, 0, arr.length - 1);
                break;
            case 3:
                insertionSort(arr);
                break;
            case 4:
                selectionSort(arr);
                break;
            default:
                System.out.println("Invalid choice.");
                sc.close();
                return;
        }

        System.out.println("After sorting: " + Arrays.toString(arr));
        sc.close(); 
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}

