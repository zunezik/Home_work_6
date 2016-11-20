import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть розмір масиву: ");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        arr = inputArray(arr);
        outputArray(arr);
    }

    private static void outputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static int[] inputArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введіть число: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
