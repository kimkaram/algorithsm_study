package chapter1;

import java.util.Scanner;

public class P30_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n : ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
			if(i == n) {
				System.out.print(n + " = " + sum);
			} else
			System.out.print(i + " + ");
		}
	}

}
