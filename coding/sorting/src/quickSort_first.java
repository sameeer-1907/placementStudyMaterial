public class quickSort_first {

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        System.out.println("Original array: " + java.util.Arrays.toString(arr));

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;

        for (int j = low + 1; j <= high; j++) {
            if (arr[j] < pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        int temp = arr[low];
        arr[low] = arr[i - 1];
        arr[i - 1] = temp;

        return i - 1;
    }
}
