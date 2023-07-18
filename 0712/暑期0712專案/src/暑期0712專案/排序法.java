package 暑期0712專案;

import java.util.*;
import java.util.Collections;
public class 排序法 {
	public static void main(String[]args) {
		int[]陣列 = new int[20];
		int[]排序 = new int[陣列.length];
		
		for(int i=0;i<陣列.length;i++) {
			陣列[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("原陣列");
		System.out.println(Arrays.toString(陣列));

		System.arraycopy(陣列, 0, 排序, 0,陣列.length);
		
		氣泡排序(排序);
		System.out.println("氣泡排序");
		System.out.println(Arrays.toString(排序));
		
		System.arraycopy(陣列, 0, 排序, 0,陣列.length);
		
		插入排序(排序);
		System.out.println("插入排序");
		System.out.println(Arrays.toString(排序));
		
		System.arraycopy(陣列, 0, 排序, 0,陣列.length);
		
		搜尋排序(排序);
		System.out.println("搜尋排序");
		System.out.println(Arrays.toString(排序));
		
		System.arraycopy(陣列, 0, 排序, 0,陣列.length);
		
		堆積排序(排序);
		System.out.println("堆積排序");
		System.out.println(Arrays.toString(排序));
	
		System.out.println("\n迴圈加總"+迴圈加總(排序));
		System.out.println("遞迴加總"+遞迴加總(排序,排序.length-1));
		
		System.out.println("\n階乘"+階乘(6));
		
		System.out.println("\n費式數列"+費式數列(9));
		
		try {
			System.out.println("\n二項式"+二項式(4,3));			
		}catch(IllegalArgumentException e) {
			System.out.println("\n"+e.getMessage());
		}
		
		System.out.print("\n");
		Scanner 輸入 = new Scanner(System.in);
		System.out.print("x=");
		int x = 輸入.nextInt();
		System.out.print("y=");
		int y = 輸入.nextInt();
		try {
			int z = x/y;
			System.out.println("x÷y="+z);	
		}catch(ArithmeticException e){
			System.out.println("除數不可為0!!");
		}catch(InputMismatchException e){
			System.out.println("輸入錯誤!!");
		}

		
	}
	static void 氣泡排序(int[] 陣列) {
		int 暫存=0;
		for(int i=陣列.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(陣列[j]>陣列[j+1]) {
					暫存=陣列[j];
					陣列[j]=陣列[j+1];
					陣列[j+1]=暫存;
				}
			}
		}
	}
	static void 插入排序(int[] 陣列) {
		int p=0;
		for(int i=1;i<陣列.length;i++) {
			p=陣列[i];
            int j = i-1;
            for(j=i-1;j>=0&&陣列[j]>p;j--){
            	陣列[j+1] = 陣列[j];
            }
            陣列[j+1] = p;
		}
	}
	static void 搜尋排序(int[]陣列) {
		boolean[] 旗幟= new boolean[陣列.length];
		int 暫存 = 0;
		boolean flag;
		for(int i=0;i<陣列.length;i++) {
			int min = 最小值(陣列,旗幟);
			暫存=陣列[i];
			陣列[i]=陣列[min];
			陣列[min]=暫存;
			flag=旗幟[i];
			旗幟[i]=旗幟[min];
			旗幟[min]=flag;
		}
	}
	static int 最小值(int[]陣列,boolean[]旗幟) {
		int 目前最小 = 0;
		for(int i=0;i<陣列.length;i++) {
			if(目前最小<陣列[i]) {
				目前最小=陣列[i]+1;				
			}
		}
		int 索引=陣列.length-1;
		for(int i=0;i<陣列.length;i++) {
			if((!旗幟[i])&& 目前最小>陣列[i]) {
				目前最小 = 陣列[i];
				索引 = i;
			}
		}
		旗幟[索引]=true;
		return 索引;
	}
	static void 堆積排序(int[]陣列) {
		for(int i=(陣列.length/2)-1; i>=0;i--){
			堆積驅動(陣列, i, 陣列.length);
	    }	
		int 暫存 = 0;
		for(int i=陣列.length-1;i>0;i--) {
			暫存=陣列[i];
			陣列[i]=陣列[0];
			陣列[0]=暫存;
			堆積驅動(陣列,0,i);
		}
	}
	
	static void 堆積驅動(int[]陣列,int 根,int 長度) {
		int 左節點=2*根+1;
		int 右節點=2*根+2;
		int 最大值節點 = 根;
		if((左節點<長度)&&(陣列[左節點]>陣列[根])) {
			最大值節點 = 左節點;
		}
		if((右節點<長度)&&(陣列[右節點]>陣列[最大值節點])) {
			最大值節點 = 右節點;
		}
		int 暫存 = 0;
		if(最大值節點!=根) {
			暫存=陣列[根];
			陣列[根]=陣列[最大值節點];
			陣列[最大值節點]=暫存;
			堆積驅動(陣列,最大值節點,長度);
		}
	}
	
	static int 迴圈加總(int[]陣列) {
		int 總和=0;
		for(int i=0;i<陣列.length;i++) {
			總和+=陣列[i];
		}
		return 總和;
	}
	static int 遞迴加總(int[]陣列,int 索引) {
		if(索引<0)return 0;
		return 陣列[索引]+遞迴加總(陣列,索引-1);
	}
	static int 階乘(int 數字) {
		if(數字<=1)return 1;
		return 數字*階乘(數字-1);
	}
	
	static int 費式數列(int 數字) {
		if(數字==1 ||數字==2)return 1;
		return 費式數列(數字-1)+費式數列(數字-2);
	}
	
	static int 二項式(int n,int m) {
		if(n<m)throw new IllegalArgumentException("n不可小於m");
		if(m==0||m==n)return 1;
		
		return 二項式(n-1,m)+二項式(n-1,m-1);
	}
}
