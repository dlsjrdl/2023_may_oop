package week2;
import java.util.*;
public class 영수증 {
public static void main (String args []) {
	Scanner sc = new Scanner(System.in);
//	int x = sc.nextInt();
//	int n = sc.nextInt();
//	sc.close();
//	
//	int sum = 0;
//	
//	while ()
//	{
//		sum = a*b;
//	}
//	System.out.println(boolean); // 논리형 변수가 아닌 if else 문을 사용하면 된다
	
//	

	
//	int count = sc.nextInt();
//	int total = sc.nextInt();
//	
//	
//	int sum = 0;
//	for (int i = 0 ; i < count ; i++ )
//	{
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		sum = sum+(a*b);
//	}
//	if (sum == total) 
//		System.out.println("Yes");
//	else System.out.println("No");
	
	
	
	
	
	
	int total = sc.nextInt();
	int count = sc.nextInt();
	
	int sum = 0;
	int i = 0;
	
	while (i < count) 
	{
		int a = sc.nextInt();
		int b = sc.nextInt();
		sum += a*b;
		i++;
	}
	
	if (sum == total) {
		System.out.println("Yes");
	}else {System.out.println("No");
		
	}
	
	
	
}
}