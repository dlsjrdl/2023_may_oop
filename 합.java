package week2;
import java.util.*;
public class 합 {
	public static void main (String args [ ]) {
		Scanner sc = new Scanner(System.in);
		
		
//		int n = sc.nextInt();
//		int i = 1;
//		
//		while (i < n) {
//			
//			int sum = sc.nextInt();
//			System.out.println(sum);
//			i++;
//		}
		
//		int n = sc.nextInt();
//		sc.close();
//		
//		int sum = 0;
//		for (int i = 1 ; i <= n ; i++ )
//		{
//			sum += i;
//		}
//		System.out.println(sum);
		
		int n = sc.nextInt();
		sc.close();
		
		int sum = 0;
		int i = 1;
		
		while (i <= n )
		{
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
