public class quickSort_middle {

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Original array: " + java.util.Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pi = partition(arr, low, high);

            // Recursively sort the elements before and after the pivot
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // Choose the middle element as the pivot
        int mid = (low + high) / 2;
        int pivot = arr[mid];

        // Move pivot to the end temporarily
        swap(arr, mid, high);

        int i = low;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }

        // Move the pivot to its correct position
        swap(arr, i, high);

        return i; // Return the final index of the pivot
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
