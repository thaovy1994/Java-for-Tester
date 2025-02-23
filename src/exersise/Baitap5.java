package exersise;

import java.util.Scanner;

public class Baitap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        boolean isWord = false;
        for(int i=0;i<chars.length;i++){
            if(chars[i] == ' '){
                isWord = false;
            } else if (!isWord && chars[i] >= 'a' && chars[i] <= 'z') {
                chars [i] = Character.toUpperCase(chars[i]);
                isWord = true;
            }
        }
        String result = new String(chars);
        System.out.println(result);
    }
}
