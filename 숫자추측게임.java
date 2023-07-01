package week2;

import java.util.*;

public class 숫자추측게임 {
public static void main(String args []) {
	Scanner sc = new Scanner(System.in);
	
	int user = 0;
	int com = (int)(Math.random()* 100) +1;
	int count=1;
	
	while(user != com){
		System.out.print("정답을 추측하여 보시오 : ");
		user = sc.nextInt();
		if (user < com)	{
			System.out.printf("제시한 정수가 낮습니다.\n");
			count++;
		} else if (user>com){
			System.out.printf("제시한 정수가 높습니다.\n");
			count++;
		} else {
			System.out.printf("축하합니다. 시도 횟수 = %d",count);
		}

	}

}
}
