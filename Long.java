package week2;

import java.util.Scanner;
public class Long {
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		
//		int N = sc.nextInt();
//		
//		int sum = 0;
//		
//		for (int i = 0 ; i <= N ; i++) 
//		{
//			sum = i%4;
//		}
//		System.out.println(sum + "int");
		
//		int N = sc.nextInt();
//		
//		int D = N/4;
//		
//		for (int i = 0; i < D ; i++)
//		{
//			System.out.println("long ");
//		}
//		System.out.println("int");
		
		int N = sc.nextInt();
		
		sc.close();
		
		int sum = N/4;
		int i = 0;
		
		while (i < sum)
		{
			System.out.print("long ");
			i++;
		}
		System.out.print("int");
		
	}

}

