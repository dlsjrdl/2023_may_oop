package week2;
import java.util.*;
public class 백준_과제안낸사람 {
public static void main (String args []) {
	Scanner sc = new Scanner(System.in);
	
	int student[] = new int [31]; //1~30이므로 31크기로 배열 선언 
	
	for (int i = 0; i<28; i++) { // 총 28번 번호 입력하니 
		int success = sc.nextInt();
		student[success] = 1; //출석한 학생을 1로 설정 
	}
	for (int i = 1; i<student.length; i++) {
		if (student[i] != 1) { //1이 아닌 학생은 출석하지 않은 학생이므로 출력 
			System.out.println(i);
		}
	}
}
}
