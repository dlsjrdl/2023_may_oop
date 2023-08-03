package week2;
import java.util.*;
public class 백준_네번째점 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		
		int arr1[] = { sc.nextInt(), sc.nextInt()}; //방 3개를 생성 
		int arr2[] = { sc.nextInt(), sc.nextInt()};
		int arr3[] = { sc.nextInt(), sc.nextInt()};
		
		int x,y; //x,y를 생성 
		
		if (arr1[0] == arr2[0]) { // 조건을 이용해 3가지 경우의 수를 만든다 
			x = arr3[0];
		} else if (arr1[0] == arr3[0]) {
			x = arr2[0];
		} else {
			x = arr1[0];
		}
		
		if (arr1[1] == arr2[1]) {
			y = arr3[1];
		} else if (arr1[1] == arr3[1]) {
			y = arr2[1];
		} else {
			y = arr1[1];
		}
		
		System.out.println(x + " " + y);
	}
}
