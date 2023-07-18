package week2;
import java.util.*;
public class 백준_문자열 {
public static void main (String args []) {
	Scanner sc = new Scanner(System.in);
	
	int T = sc.nextInt(); //테스트 입력 개수 T를 입력 받는다 
		
	for (int i = 0; i<T; i++) { // T번 반복까지 문자열을 입력받는다 
		String str = sc.next();
		System.out.println(str.charAt(0) + "" + str.charAt(str.length()-1));
	} //chat(0)을 사용하여 첫번째 문자를 가져온다 
	 // charAt(str.length() - 1)을 이용하여 마지막 문자를 가져온다 
}
}
