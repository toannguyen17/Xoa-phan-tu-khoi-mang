package app;

import java.util.Scanner;

public class App {
    public static void main(final String[] args) throws Exception {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng: ");
        do {
            size = scanner.nextInt();
            if (size < 1 && size > 20) {
                System.out.print("Độ dài mảng từ 1 đến 20: ");
            }
        } while (size < 1 && size > 20);

        System.out.println("Nhập vào các phần tử của mảng: ");
        int[] arrays = new int[size];
        for (int i = 0; i < size; i++) {
            arrays[i] = scanner.nextInt();
        }
        System.out.print("list: ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
        System.out.print("\nNhập vào phần tử muốn xóa: ");
        int element = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i] == element){
                index = i;
            }
        }
        if (index != -1) {
            arrays = removeTheElement(arrays, index);
        }

        System.out.print("Property list: ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }

    // remove
    public static int[] removeTheElement(int[] arrs, int index){
        final int[] result = new int[arrs.length-1];
        int index_result = 0;
        for(int i = 0; i < arrs.length; i++){
            if (i == index) {
                continue;
            }
            result[index_result] = arrs[i];
            index_result++;
        }
        return result;
    }
}
