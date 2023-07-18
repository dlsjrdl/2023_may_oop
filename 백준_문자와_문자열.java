package week2;
import java.util.*;
public class 백준_문자와_문자열 {
public static void main (String args []) {
	Scanner sc = new Scanner(System.in);
	
	String [] arr = sc.next().split(""); //배열을 이용하여 길이만큼 주어진 단어를 입력한다 거기에 split이라는 함수를 사용하여 순서대로 나열한다  
	int i = sc.nextInt();
	
	System.out.println(arr[i-1]); //배열은 0부터 시작하기 때문에 3을 입력했을때 2번째 배열이 호출된다 
}
}
