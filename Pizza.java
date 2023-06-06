package week2;
import java.util.*;

public class Pizza {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====================================");
		System.out.println("1. 화씨->섭씨");
		System.out.println("2. 섭씨->화씨");
		System.out.println("=====================================");
		System.out.println("번호를 선택하시오: ");
		int menu = sc.nextInt();
		
		double a = 0.0;

        System.out.print((menu == 1) ? "화씨온도를 입력하시오: " : "섭씨온도는: ");
        a = sc.nextDouble();

        double b = (menu == 1) ? (a - 32) * 5 / 9 : (a * 9 / 5) + 32;

        System.out.println((menu == 1) ? "섭씨온도는 " + b : "화씨온도는 " + b);

	}

}
