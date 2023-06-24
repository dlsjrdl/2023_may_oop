package week2;
import java.util.*;
public class 백준_11022 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i<=N; i++) 
		{
			int A = sc.nextInt();
			int B = sc.nextInt();
			sum = A+B;
			
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + sum);
		}
	}

}
