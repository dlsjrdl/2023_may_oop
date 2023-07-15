package week2;
import java.util.*;
public class 백준_약수구하가 {

		public static void main(String[] args){


			Scanner sc = new Scanner(System.in);

			int A = sc.nextInt();
			int B = sc.nextInt();

			int count = 0;
			for(int i = 1; i <= A; i++){
				if(A % i == 0) count++;

				if(count == B) {
					System.out.println(i);
					break;
				}
			}
			if(count < B) System.out.println(0);
		}
	}
