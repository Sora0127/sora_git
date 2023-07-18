package 課堂練習;

import java.util.*;

public class 輸入輸出練習 {
	public static void main(String[]args) {
		int a=0;
		int b=0;
		Scanner input = new Scanner(System.in);
		System.out.print("a=");
		a = input.nextInt();
		System.out.print("b=");
		b = input.nextInt();
		System.out.println("a+b="+plus(a,b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.print("a/b="+((a/(float)b)));
	}
	static int plus(int a,int b) {
		return a+b;
	}
}
