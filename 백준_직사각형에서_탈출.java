package week2;
import java.util.*;
public class 백준_직사각형에서_탈출 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int x_min = Math.min(x,w-x); //x의 최소 거리 
		int y_min = Math.min(y,h-y); //y의 최소 거리 
		
		System.out.println(Math.min(x_min,y_min)); //x와 y의 최소거리를 Math.min 함수를 이용하여 출력 
		
		
	}
}
