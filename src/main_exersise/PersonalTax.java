package main_exersise;

import java.util.Scanner;

public class PersonalTax {
    public static void main(String[] args) {
        System.out.print("Please enter your income in year: ");
        Scanner scanner = new Scanner(System.in);
        int year_income = scanner.nextInt();
        if (year_income < 0) {
            System.out.println("Invalid income! Income must be >= 0.");
        } else if (year_income>=0 && year_income <=5000){
            System.out.println("Tax = 5% /year = "+ year_income*0.05);
        } else if (year_income>=5000 && year_income <=10000000) {
            System.out.println("Tax = 10% /year = "+ year_income*0.1);
        } else if (year_income<=18000000) {
            System.out.println("Tax = 15% /year = "+ year_income*0.15);
        } else if (year_income<=32000000) {
            System.out.println("Tax = 20% /year = "+ year_income*0.2);
        } else if (year_income<=52000000) {
            System.out.println("Tax = 25% /year = "+ year_income*0.25);
        } else if (year_income<=80000000) {
            System.out.println("Tax = 30% /year = "+ year_income*0.3);
        } else {
            System.out.println("Tax = 35% /year = "+ year_income*0.35);
        }
    }
}
