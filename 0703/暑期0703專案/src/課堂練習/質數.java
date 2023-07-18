package 課堂練習;

import java.util.*;
public class 質數 {
	
	public static void main(String[]args) {
		System.out.print("請輸入數字:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(num_can(number)) {
			if(check(number)) {
				System.out.println(number+"是質數");
			}else {
				System.out.println(number+"不是質數");
			}			
		}else {
			System.out.println("輸入錯誤，不可檢查");
		}
	}
	static boolean num_can(int number) {
		if(number>1) {
			return true;
		}else {
			return false;
		}
	}
	static boolean check(int number) {
		ArrayList <Integer> have = new ArrayList<>();
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				have.add(i);
			}
		}
		System.out.println("因數有:"+have);
		if(have.size()==2) {
			return true;
		}else {
			return false;
		}
	}
}
