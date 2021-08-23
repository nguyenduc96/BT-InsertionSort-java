import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Trước sắp xếp");
        displayArray(array);
        System.out.println("\n---------------------");
        insertionSort(array);
        System.out.println("Sau sắp xếp");
        displayArray(array);
        System.out.println("\n---------------------");
    }

    private static void displayArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int[] array) {
        int pos, temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            pos = i;
            while (pos > 0 && array[pos - 1] > temp) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = temp;
        }
    }
}
