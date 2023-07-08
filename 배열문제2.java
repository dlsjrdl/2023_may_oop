package week2;
import java.util.*;
public class 배열문제2 {
public static void main (String args []) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int x = sc.nextInt();

	int arr[] = new int [n];
	
	for (int i = 0; i <arr.length; i++) {
		arr[i] = sc.nextInt();
	}

	for (int i = 0; i <arr.length; i++) { //for문을 쓰는 이유는 x라는 변수보다 작은지를 반복적으로 비교하기 위해서 for +if를 사용했다 
		if (arr[i] < x) {
			System.out.print(arr[i] + " "); //반복문 안에서 출력을 해줘야 한다 
		}
	}
	
}
}
