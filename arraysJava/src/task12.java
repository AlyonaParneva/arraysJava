import java.util.Scanner;

public class task12 {
    public static int[] add(int[] arr, int[] ins, int pos) {
        if (pos < 0 || pos > arr.length) {
            throw new IllegalArgumentException("Позиция вне допустимого диапазона.");
        }
        int[] result = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            result[i + ins.length] = arr[i];
        }
        return result;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы основного массива через пробел:");
        String[] inputArr = scanner.nextLine().split(" ");
        int[] arr = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }
        System.out.println("Введите элементы вставляемого массива через пробел:");
        String[] inputIns = scanner.nextLine().split(" ");
        int[] ins = new int[inputIns.length];
        for (int i = 0; i < inputIns.length; i++) {
            ins[i] = Integer.parseInt(inputIns[i]);
        }
        System.out.print("Введите позицию вставки (от 0 до " + arr.length + "): ");
        int pos = scanner.nextInt();
        int[] result = add(arr, ins, pos);
        System.out.print("Результат: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
