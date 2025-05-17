import java.util.ArrayList;
import java.util.Scanner;

public class task10 {
    public static int[] deleteNegative(int[] arr) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int num : arr) {
            if (num >= 0) {
                resultList.add(num);
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив целых чисел через пробел:");
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int[] result = deleteNegative(arr);
        System.out.print("Результат - массив без отрицательных чисел: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
