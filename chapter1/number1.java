package chapter1;

import java.util.Scanner;

public class P19_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		System.out.print("c : ");
		int c = sc.nextInt();
		System.out.print("d : ");
		int d = sc.nextInt();
		
		max4(a, b, c, d);
		
	}
	
	public static int max4(int a, int b, int c, int d) {
		
		
		int max = 0;
		
		if(a > b && a > c && a > d) 
			max = a;
		
		if(b > a && b > c && b > d)
			max = b;
		if(c > a && c > b && c > d)
			max = c;
		if(d > a && d > b && d > c)
			max = d;
		
		System.out.println("max : " + max);
		
		return max;
	}

}
