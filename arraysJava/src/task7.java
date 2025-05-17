import java.util.Scanner;

public class task7 {
    public static int[] reverseBack(int[] arr) {
        int n = arr.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - 1 - i];
        }
        return reversed;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив целых чисел через пробел:");
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int[] reversed = reverseBack(arr);
        System.out.print("Результат - новый массив после реверса: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
