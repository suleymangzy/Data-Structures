
public class Main {
    public static int binarySearch(int[] array, int n, int number) {
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == number) return middle;
            else if (array[middle] > number) right = middle - 1;
            else left = middle + 1;
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] array = {3, 8, 10, 11, 20, 50, 55, 60, 65, 70, 72, 90, 91, 94, 96, 99};
        int index = binarySearch(array, array.length, 60);
        System.out.println(index);
    }
}
