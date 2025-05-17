import java.util.Scanner;

public class task1 {
    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
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
        int result = findFirst(arr, x);
        System.out.println("Результат - индекс первого вхождения: " + result);
    }
}
