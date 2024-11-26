public class quickSort_last {

    // Partition method with `i = low`
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        // Swap arr[i] and arr[high] (or pivot)
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    // QuickSort method
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Main method to test the QuickSort implementation
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        System.out.println("Original array: " + java.util.Arrays.toString(arr));

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }
}
