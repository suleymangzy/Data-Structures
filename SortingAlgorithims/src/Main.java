
public class Main {
    public static void main(String[] args) {
        int[] originalArray = {9, 5, 8, 3, 1};

        // Insertion Sort
        int[] insertionSortedArray = insertionSort(originalArray.clone());
        System.out.print("Insertion Sort: ");
        printArray(insertionSortedArray);

        // Bubble Sort
        int[] bubbleSortedArray = bubbleSort(originalArray.clone());
        System.out.print("Bubble Sort: ");
        printArray(bubbleSortedArray);

        // Selection Sort
        int[] selectionSortedArray = selectionSort(originalArray.clone());
        System.out.print("Selection Sort: ");
        printArray(selectionSortedArray);

        // Quick Sort
        int[] quickSortedArray = quickSort(originalArray.clone(), 0, originalArray.length);
        System.out.print("Quick Sort: ");
        printArray(quickSortedArray);

        // Merge Sort
        int[] mergeSortedArray = mergeSort(originalArray.clone(), 0, originalArray.length);
        System.out.print("Merge Sort: ");
        printArray(mergeSortedArray);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
        System.out.println();
    }

    public static int[] bubbleSort(int[] array) {
        int n = array.length;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] quickSort(int[] array, int low, int high) {
        if (high - low <= 1) return array;
        int pivot = array[high - 1];
        int swapMarker = low;
        for (int i = low; i < high - 1; i++) {
            if (array[i] < pivot) {
                if (i != swapMarker) {
                    int temp = array[i];
                    array[i] = array[swapMarker];
                    array[swapMarker] = temp;
                }
                swapMarker++;
            }
        }
        int temp2 = array[high - 1];
        array[high - 1] = array[swapMarker];
        array[swapMarker] = temp2;

        quickSort(array, low, swapMarker);
        quickSort(array, swapMarker + 1, high);
        return array;
    }

    public static int[] selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }

    public static int[] insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int pivot = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > pivot) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = pivot;
        }
        return array;
    }

    public static int[] mergeSort(int[] array, int low, int high) {
        if (high - low <= 1) return array;
        int mid = (high + low) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid, high);
        int[] scratch = new int[mid - low];
        for (int i = 0; i < (mid - low); i++) {
            scratch[i] = array[low + i];
        }
        int m1 = 0, m2 = mid;
        int i = low;
        while (i < m2 && m2 < high) {
            if (scratch[m1] <= array[m2]) {
                array[i++] = scratch[m1++];
            } else {
                array[i++] = array[m2++];
            }
        }
        while (i < m2) {
            array[i++] = scratch[m1++];
        }
        return array;
    }
}