package 課堂練習;
import java.util.*;

public class 迴圈練習 {
	public static void main(String[]args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println("1~100總和:"+sum);
		
		
		System.out.print("請輸入階乘數字:");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		System.out.println(num+"!="+階乘(num));
	}
	static int 階乘(int num) {
		int sum=1;
		for(int i=1;i<=num;i++) {
			sum*=i;
		}
		return sum;
	}
}
