package week2;
import java.util.*;
public class 백준_2438 {
public static void main (String args []) {
	Scanner sc = new Scanner(System.in);
	
	int N = sc.nextInt();
	
	for (int i = 1; i <= N; i++)
	{
		for (int k = 1; k <= i; k++) //2중 for문으로 N번 까지 반복하는걸 거기서 또 행마다의 숫자를 반복을해
		{
			System.out.print("*"); //출력하는 방식을 나타내기 위해서 ln을 안붙
		}
		System.out.println("");
	}

}
}
