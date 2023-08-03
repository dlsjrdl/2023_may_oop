package week2;
import java.util.*;
public class 백준_대지 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr1[] = new int [n];
		int arr2[] = new int [n];
		
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
			arr2[i] = sc.nextInt();
		}
		
		//정렬함수
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		//정렬로 인해서 끝과 끝이 제일 큰수와 작은수가 된다. 
		System.out.println((arr1[n-1] - arr1[0]) * (arr2[n-1] - arr2[0]));
		
		sc.close();
	}
}
