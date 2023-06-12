package week2;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("문자를 입력해주세요: ");
        
        String grade = scanner.nextLine();
        String message = "";

        switch (grade) {
            case "A":
                message = "Excellent";
                break;
            case "B":
                message = "Good";
                break;
            case "C":
                message = "Usually";
                break;
            case "D":
                message = "Effort";
                break;
            case "F":
                message = "Failure";
                break;
            default:
                message = "error";
                break;
        }

        System.out.println(message);
    }
}

