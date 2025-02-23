package exersise;

import java.util.Arrays;
import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử mảng: ");
        int n = scanner.nextInt();
        if (n < 2) {
            System.out.println(Integer.MIN_VALUE);
            return;
        }
        int[] arr = new int[n];
        System.out.println("Nhập mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int secondLargest = findThe2ndNumber(arr);
        System.out.println("Số lớn thứ hai trong mảng là: " + secondLargest);
    }

    public static int findThe2ndNumber(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int arrA : arr) {
            if (arrA > max1) {
                max2 = max1;
                max1 = arrA;
            } else if (arrA > max2 && arrA != max1) {
                max2 = arrA;
            }
        }
        return max2;
    }
}
