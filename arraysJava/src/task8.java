import java.util.Scanner;

public class task8 {
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы первого массива через пробел:");
        String[] input1 = scanner.nextLine().split(" ");
        int[] arr1 = new int[input1.length];
        for (int i = 0; i < input1.length; i++) {
            arr1[i] = Integer.parseInt(input1[i]);
        }
        System.out.println("Введите элементы второго массива через пробел:");
        String[] input2 = scanner.nextLine().split(" ");
        int[] arr2 = new int[input2.length];
        for (int i = 0; i < input2.length; i++) {
            arr2[i] = Integer.parseInt(input2[i]);
        }
        int[] result = concat(arr1, arr2);
        System.out.print("Результат - объединённый массив: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
