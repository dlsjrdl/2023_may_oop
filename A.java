package week2;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력해줘세요 : ");
        int month = scanner.nextInt();

        int days;

        if (month >= 1 && month <= 12) {
            switch (month) {
                case 2:
                    days = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                default:
                    days = 31;
                    break;
            }

            System.out.println(+ days);
        } else {
            System.out.println("Invalid month entered. Please enter a number between 1 and 12.");
        }
    }
}


