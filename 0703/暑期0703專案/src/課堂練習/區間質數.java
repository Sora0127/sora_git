package 課堂練習;

import java.util.ArrayList;
import java.util.Arrays;

public class 區間質數 {

	public static void main(String[]args) {
		System.out.print(Arrays.toString(Arrays.toString(check(100,200).toArray()).split(",")).replace(",", "\n"));
	}
	static ArrayList <Integer> check(int start,int end) {
		ArrayList <Integer> have = new ArrayList<>();
		for(int i=start;i<=end;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					break;
				}
				if(j==i-1) {
					have.add(i);					
				}
			}
		}
		return have;
	}
}
