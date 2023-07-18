package week2;
import java.util.*;
public class 백준_숫자의합 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt(); // 반복할 숫자를 입력받음 
	String a = sc.next(); // 문자열로 입력 받을 것 
	sc.close();
	
	int sum = 0; //숫자들의 합을 더할 변수 
	
	for (int i = 0; i<n; i++) { //n까지 반복하여 누적합을 구하면 된다 
		sum += a.charAt(i)-'0'; //이때 아스키코드 값을 반환 하므로 -48 or -0을 해주어야 입력받은 숫자를 그대로 사용가능 
	}
	System.out.print(sum);
}
}
