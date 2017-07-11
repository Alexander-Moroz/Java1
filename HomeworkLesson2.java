/**
 * Homework to a lesson 2
 *
 * @author Alexander Moroz
 * @since 2017-18-02
 * @version 1.1
 *
 */

public class HomeworkLesson2 {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        changeArray();
        System.out.println("\n\nTask 2:");
        createArray();
        System.out.println("\n\nTask 3:");
        changeArray2();
        System.out.println("\n\nTask 4:");
        createArray2();
        System.out.println("\nTask 5:");
        findMininalAndMaximalElementOfArray();
        System.out.println("\nTask 6:");
        System.out.println(checkBalance(new int[] { 1, 1, 1, 2, 1 })); // true
        System.out.println(checkBalance(new int[] { 2, 1, 1, 2, 1 })); // false
        System.out.println(checkBalance(new int[] { 10, 10 })); //true
        System.out.println("\nTask 7:");
        modifyArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, -2);
    }

    /**
     * 1. «адать целочисленный массив, состо€щий из элементов 0 и 1. Ќапример: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     *    — помощью цикла и услови€ заменить 0 на 1, 1 на 0;
     */
    static void changeArray() {
        int[] arr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("BEFORE: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.print("\nAFTER:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * 2. «адать пустой целочисленный массив размером 8.
     *    — помощью цикла заполнить его значени€ми 0 3 6 9 12 15 18 21;
     */
    static void createArray() {
        int[] arr = new int[8];

        for (int i = 0, j = 0; i < arr.length; i++, j += 3) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * 3. «адать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    static void changeArray2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.print("BEFORE: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("\nAFTER:  ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * 4. —оздать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     *    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
    static void createArray2() {
        int length = 5; // length of array

        int[][] arr = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if ((i == j) || (i == length - 1 - j)) {
                    arr[i][j] = 1;
                }
            }
        }

        //CHECK
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 5. ** «адать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
     */
    static void findMininalAndMaximalElementOfArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, -9};
        int min = arr[0];
        int max = arr[0];
        System.out.print("in array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            min = (min < arr[i]) ? min : arr[i];
            max = (max > arr[i]) ? max : arr[i];
        }
        System.out.println("\nminimal element is: " + min + "\nmaximal element is: " + max);
    }

    /**
     * 6. ** Ќаписать метод, в который передаетс€ не пустой одномерный целочисленный массив,
     * метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
     * ѕримеры:
     * checkBalance([1, 1, 1, || 2, 1]) > true,
     * checkBalance ([2, 1, 1, 2, 1]) > false,
     * checkBalance ([10, || 10]) > true,
     * граница показана символами ||, эти символы в массив не вход€т.
     */
    static boolean checkBalance(int[] arr) {
        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < arr.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) return true;
        }
        return false;
    }

    /**
     * 7. **** Ќаписать метод, которому на вход подаетс€ одномерный массив и число n (может быть положительным,
     *    или отрицательным), при этом метод должен сместить все элементымассива на n позиций.
     *    ƒл€ усложнени€ задачи нельз€ пользоватьс€ вспомогательными массивами.
     */
    static void modifyArray(int[] arr, int n) {
        System.out.print("BEFORE: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("(n = " + n + ")");

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                // Right
                int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                // Left
                int tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }

        System.out.print("\nAFTER:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}