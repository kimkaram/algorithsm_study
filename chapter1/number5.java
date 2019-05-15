package chapter1;

import java.util.Scanner;

public class P22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		System.out.print("c : ");
		int c = sc.nextInt();
	
		System.out.println("med : " + med(a, b, c));
		
	}
	
	public static int med(int a, int b, int c) {
		int med = a;
		
		if(med <= b)
			if(b <= c)
				med = b;
			else if(med <= c)
				med = c;
			else
				med = a;
		else if(b >= c)
			med = b;
		else if(b < c)
			med = c;
		else 
			med = a;
		
		return med;
	}

}
