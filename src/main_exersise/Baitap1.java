package main_exersise;

import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();
        char[] chars = input.toCharArray(); //char -> arr
        String result = "";
        for(int i =0;i<chars.length;i++){
            if(chars[i]!= 'a'&& chars[i]!='e'&&chars[i]!='i'&& chars[i]!='o'&& chars[i]!='u'
            && chars[i] != 'A'&& chars[i]!='E'&&chars[i]!='I'&& chars[i]!='O'&& chars[i]!='U'){
                result += chars[i];
            }
        }
        System.out.println("Chuỗi sau khi xóa nguyên âm: " + result);
    }
}
