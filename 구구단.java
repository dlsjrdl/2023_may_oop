package week2;
import java.util.*;
public class 구구단 {
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		sc.close(); //스캔이 끝다는걸 알려주기 위해서 
		
		for (int i = 1 ; i <=9 ; i++) {
			System.out.println(n+" * "+ i +" = "+(n*i));
			// 1. 맨처음 int n 을 만든 이유는 변수를 만들어서 1~9까지의 숫자를 입력 할수 있게 만들기 위하
			// 2. int i는 for 문 안에서 자동으로 변수를 만들어줌
			// 3. sout에서 n은 우리가 입력하는 값이므로 먼저 n이 나와야함
			// " * " 으로 보여지는것을 출력하고
			// i 라는 9까지 순서대로 반복되는 변수를 넣으면됨
			// " = " 도 마찬가지로 출력해줘야함
			// (n*i) 로 입력하는 숫자에 따라 1부터 9까지 변수에 반복적으로 넣어서 곱의 값을 알려줌 
		}
	}

}
