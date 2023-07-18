package 暑期0713專案;

import java.util.*;
public class L函式 {
	public static void main(String[]args) {
		List<Integer>資料 = new ArrayList<Integer>();
		for(int i=0;i<20;i++) {
			資料.add((int)(Math.random()*100)+1);
		}
		
		System.out.println(Arrays.toString(資料.stream().sorted().toArray()));
		
		
		
		long 計數器 = 資料.stream().count();
		System.out.println("裡面有"+計數器+"個");
		
		int 最小值 = 資料.stream().min(Integer::compareTo).orElseThrow();
		System.out.println("最小值["+最小值+"]");
		
		
		System.out.print("過濾出的偶數:");
		資料.stream().sorted().filter((x)->{return x%2==0;})
		.forEach((x)->System.out.print(x+" "));
		System.out.print("\n");
		
		System.out.print("過濾出的偶數總合為:");
		int 總和=資料.stream().sorted().filter((x)->{return x%2==0;})
				.reduce(0,(a,b)->a+b);
		System.out.print(總和);
		System.out.print("\n");
		
		List<Integer> 新列表 = 資料.stream().sorted().filter((x)->{return x%2==0;})
				.map((x)->2*x+1).toList();

		System.out.print("將所有偶數元素[×2+1]:");
		System.out.print(新列表);
		System.out.print("\n");
		
		List<Integer> 新列表2 = 資料.stream().sorted().peek((x)->System.out.print(x+" ")).toList();
		
	}
}
