package exersise;

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        if (n<=1){
            System.out.println("n phải > 1");
            return;
        }
        int result = sumEvenNumbers(n);
        System.out.println(result);
    }

    public static int sumEvenNumbers (int n){
        int sum = 0;
        for (int i = 2; i<=n;i+=2){
            sum += i;
        }
        return sum;
    }
}
