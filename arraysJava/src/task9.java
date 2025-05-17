import java.util.ArrayList;
import java.util.Scanner;

public class task9 {
    public static int[] findAll(int[] arr, int x) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indices.add(i);
            }
        }
        int[] result = new int[indices.size()];
        for (int i = 0; i < indices.size(); i++) {
            result[i] = indices.get(i);
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
        System.out.print("Введите число для поиска: ");
        int x = scanner.nextInt();
        int[] result = findAll(arr, x);
        System.out.print("Результат - индексы вхождений: ");
        for (int idx : result) {
            System.out.print(idx + " ");
        }
        System.out.println();
    }
}
