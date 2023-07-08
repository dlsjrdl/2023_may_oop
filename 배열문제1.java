package week2;
import java.util.*;
public class 배열문제1 {
public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	int []arr = new int [n];
	
	for (int i = 0; i < arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	
	int v = sc.nextInt();
	int cnt = 0;
	
	for (int i = 0; i < arr.length; i++ ) {
		if (arr[i] == v) {
			cnt++;
		}
	}
	System.out.println(cnt);
}
}
