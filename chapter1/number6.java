package chapter1;

import java.util.Scanner;

public class P29 {

	public static void main(String[] args) {

		//1~n까지의 정수 합 구하기
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i = 1;
		System.out.print("n : ");
		int n = sc.nextInt();
		
		while(i <= n) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 n까지 sum : " + sum);
		System.out.println("마지막 i값 : " + i);
	}

}
