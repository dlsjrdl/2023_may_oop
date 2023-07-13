package week2;
import java.util.*;
public class 백준_공넣기 {
public static void main (String args []) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt(); //전체 바구니의 개수 설정 

	int []arr = new int [n];//바구니의 개수를 배열로 설정 

	int m = sc.nextInt(); //바구니 안에 몇번 공을 넣을지 설정 

	for (int i = 1; i<m; i++) { //반복을 통해서 I번 바구니부터 J번 바구니까지 K번 번호가 적힌 공을 넣는다 
		int I = sc.nextInt();
		int J = sc.nextInt();
		int K = sc.nextInt();

		for (int a = I-1; a<J; a++) {
			arr[a] = K; // arr배열의 인덱스 'a'에 공의 번호의 변수인 K를 저장한다 
		}
	}

	for (int b = 0; b <arr.length; b++ ) {
		System.out.print(arr[b] + " ");
	}
}
}
