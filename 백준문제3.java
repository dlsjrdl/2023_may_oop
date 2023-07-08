package week2;
import java.util.*;
public class 백준문제3 {
public static void main (String args [ ]) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	int arr[] = new int [n];
	
	for (int i = 0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	
	int min = arr[0]; // arr라는 배열에 첫번째 방으로 초기화한다
	int max = arr[0];
	
	for (int i =0; i<arr.length; i++) {
		if (arr[i] > min) {
			min = arr[i];
		} else if (arr[i] < max) {
			max = arr[i];
		}
	}
	System.out.print(min + " " + max);
}
}
