package week2;
import java.util.*;
public class A_B {
public static void main (String args []) {
	Scanner sc = new Scanner(System.in);
	
//	int n = sc.nextInt();
//	
//	int a = sc.nextInt();
//	int b = sc.nextInt();
//	int sum = 0;
//	for (int i = 0; i <= n ; i++)
//	{
//		sum = a+b;
//	}
//	System.out.println("Case #" +":" + sum);
	
	int n = sc.nextInt();
	
	int sum = 0;
	
	for (int i = 1; i<=n ; i++)
	{
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sum = a+b;
		System.out.print("Case #" + i + ": " + sum);
		
	}
	
	
}
}
