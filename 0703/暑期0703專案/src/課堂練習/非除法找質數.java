package 課堂練習;

import java.lang.reflect.Array;
import java.util.*;
public class 非除法找質數 {
	public static void main(String[]args) {
		
		boolean[] flag = new boolean[10000];
		for(int i=1;i<=10000;i++) {
			if(i<2||flag[i-1]) {
				continue;
			}
			if(!flag[i-1]) {
				for(int j=2;i*j<=10000;j++) {
					flag[i*j-1]=true;
				}
			}
		}
//		ArrayList <Integer>質數堆 = new ArrayList<>();
		for(int i=1;i<=10000;i++) {
			if(!flag[i-1]&&(i>=2)) {
//				質數堆.add(i);
				System.out.println(i);
			}
		}
//		System.out.print(質數堆);
	}
}
