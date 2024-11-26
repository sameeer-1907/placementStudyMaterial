public class quickSort_middle {

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
        int mid = (low + high) / 2;
        int pivot = arr[mid];

        int i = low;
        int j = high;

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }
}
