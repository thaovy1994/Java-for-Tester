package exersise;

import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        int result = countCharacter(input);
        System.out.println("Chuỗi [" + input + "] có " +result + " từ");
    }

    public static int countCharacter (String str){
        int count = 0;
        boolean isWord = false;
        for(int i =0;i<str.length();i++) {
            if(str.charAt(i)!=' '){
                if(!isWord){
                    count ++;
                    isWord = true;
                }
            }else {
                isWord = false;
            }
        }
        return count;
    }
}
