package week2;
import java.util.*;
public class 백준_공바꾸기 {
public static void main (String args []) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt(); //바구니 개수 입력 받기 
	
	int arr[] = new int [n]; //바구니 개수 배열로 설정 
	
	int m = sc.nextInt(); // 몇번 넣는지 입력 받기 
	int temp; // 저장 변수 생성 
	
	for (int i = 0; i<arr.length; i++) { //
		arr[i] = i+1;
	}
	
	for (int j = 0; j < m; j++) {
		int I = sc.nextInt();
		int J = sc.nextInt();
		
		temp = arr[I-1];
		arr[I-1] = arr[J-1];
		arr[J-1] = temp;
	}
	for (int k = 0; k <arr.length; k++) {
		System.out.print(arr[k] + " ");
	}
}
}
