package week2;
import java.util.*;
public class 백준_최소공배수 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();
		for(int i=0; i<cnt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = 0;
			int low= 0;
			for(int j=1; j<=Math.min(a, b); j++) {
				if((a%j==0)&&(b%j==0)) {
					low = j;
				}
				
				result = a*b/low;
			}
			System.out.println(result);
		}
	}
}
