package 課堂練習;

import java.util.*;

public class dice {
	public static void main(String[]args) {
//		System.out.print("丟出的點數:"+roll_dice());
		int counter=0;
		for(int i=0;i<10000;i++) {
			if(roll_dice()==1) {
				counter+=1;
			}
		}
		System.out.println("1出現:"+counter);
	}
	static int roll_dice() {
		return (int)(Math.random()*6)+1;
	}
}
