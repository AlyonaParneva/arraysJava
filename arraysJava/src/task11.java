import java.util.Scanner;

public class task11 {
    public static int[] add(int[] arr, int x, int pos) {
        if (pos < 0 || pos > arr.length) {
            throw new IllegalArgumentException("Позиция вне допустимого диапазона.");
        }
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        result[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            result[i + 1] = arr[i];
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
        System.out.print("Введите значение для вставки (x): ");
        int x = scanner.nextInt();
        System.out.print("Введите позицию для вставки (от 0 до " + arr.length + "): ");
        int pos = scanner.nextInt();
        int[] result = add(arr, x, pos);
        System.out.print("Результат: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
