import java.util.Scanner;

public class task5 {
    public static boolean palindrom(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив целых чисел через пробел:");
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        boolean result = palindrom(arr);
        System.out.println("Результат - массив палиндром: " + result);
    }
}
