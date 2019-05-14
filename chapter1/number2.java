package chapter1;

import java.util.Scanner;

public class P19_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		System.out.print("c : ");
		int c = sc.nextInt();
		
		min3(a, b, c);

	}
	
	public static int min3(int a, int b, int c) {
		int min = 0;
		
		if(a < b && a < c)
			min = a;
		if(b < a && b < c)
			min = b;
		if(c < a && c < a)
			min = c;
		
		System.out.println("min : " + min);
		
		return min;
	}

}
