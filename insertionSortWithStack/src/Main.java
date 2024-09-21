import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 5, 6, 4, 9, 7, 8};
        array = insertionSortWithStack(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static int[] insertionSortWithStack(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                int temp = array[i];
                j = i - 1;

                while (j >= 0 && array[j] > temp) {
                    stack.push(array[j]);
                    j--;
                }
                array[j + 1] = temp;
                j = j + 2;
            }

            while (!stack.isEmpty()) {
                array[j] = stack.pop();
                j++;
            }
        }

        return array;
    }
}
