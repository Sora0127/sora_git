package 字串練習;

import java.util.*;

public class 字串檢查 {
	public static void main(String[]args) {
		String check = "程式設計好好玩，要不要，暑假，一起來玩，淦個好程式";
		System.out.println(check.length());	
		String a="abc";
		String b=new String("abc");
		System.out.println(a.equals(b));
		System.out.println(a==b);
		
		System.out.println(check.charAt(2));
		System.out.println(Arrays.toString(check.split("，")));
		
	}
	
}
