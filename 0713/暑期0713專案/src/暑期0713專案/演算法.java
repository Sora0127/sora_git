package 暑期0713專案;
import java.util.*;
public class 演算法 {
	public static void main(String[]args) {
		int[]陣列 = new int[20];
		
		for(int i=0;i<陣列.length;i++) {
			陣列[i] = (int)(Math.random()*100)+1;
		}
		
		Arrays.sort(陣列);
		System.out.println(Arrays.toString(陣列));
		
		int 索引 = Arrays.binarySearch(陣列, 5);
		System.out.println(索引);
		
		int[]陣列2 = new int[5];
		Arrays.fill(陣列2, 5);
		System.out.println(Arrays.toString(陣列2));
		
		int[]比對1 = {1,2,3,4};
		int[]比對2 = {1,2,3,4};
		System.out.println(比對1==比對2);
		System.out.println(Arrays.equals(比對1, 比對2));
		
		int[]比對3=Arrays.copyOf(比對1, 6);
		System.out.println(Arrays.toString(比對3));
		
		System.out.println(Arrays.hashCode(比對1));
		System.out.println(Arrays.hashCode(比對2));
		System.out.println(Arrays.hashCode(比對3));
		System.out.println(Arrays.hashCode(陣列));
		
		String[]職業 = {"法師","騎士","守衛"};
		List<String>職業清單 = Arrays.asList(職業);
		
//		職業清單.add("魔藥師");
		System.out.println(職業清單);
		
		int[][]二維陣列 = new int[5][8];
		for(int[]s:二維陣列) {
			Arrays.fill(s,5);
		}
		for(int[]s:二維陣列) {
			System.out.println(Arrays.toString(s));
		}
		
		
		ArrayList<Integer>容器 = new ArrayList<>();
		for(int i=0;i<20;i++) {
			容器.add((int)(Math.random()*100)+1);			
		}
		
		容器.sort(Comparator.naturalOrder());
		System.out.println("\n[升冪排列]");
		System.out.println(容器);
		
		容器.sort(Comparator.reverseOrder());
		System.out.println("\n[降冪排列]");
		System.out.println(容器);
		
		容器.sort(Comparator.naturalOrder());
		容器.remove(0);
		System.out.println("\n[移除第0個元素]");
		System.out.println(容器);
		
		int 數字 =101;
		int index = 5;
		容器.add(index, 數字);
		System.out.println("\n[在第("+index+")加入元素\""+數字+"\"]");
		System.out.println(容器);
		
		int 數字2=7;
		
		System.out.println("\n[顯示第("+數字2+")個元素]");
		System.out.println(容器.get(數字2));
		


		System.out.println("\n[重新放入陣列元素]\n");
		容器.clear();
		for(int i=0;i<20;i++) {
			容器.add((int)(Math.random()*100)+1);			
		}
		
		ArrayList<Integer>容器1 = new ArrayList<>();
		
		for(int i=0;i<容器.size();i++) {
			容器1.add(容器.get(i));
		}
		
		
		System.out.println("堆積排序:ArrayList");
		System.out.println("原陣列");
		System.out.println(容器1);
		System.out.println("已排序");
		堆積排序(容器1);
		System.out.println(容器1);

		
		LinkedList<Integer>容器2 = new LinkedList<>();
		for(int i=0;i<容器.size();i++) {
			容器2.add(容器.get(i));
		}
		System.out.println("\n合併排序:LinkedList");
		System.out.println("原陣列");
		System.out.println(容器2);
		System.out.println("已排序");
		
		容器2=合併排序(容器2);
		System.out.println(容器2);
		
		Set<Integer> 散集合 = new HashSet<>();
		
		for(int i=0;i<容器.size();i++) {
			散集合.add(容器.get(i));
		}
		System.out.println("\n散集合:本身不排序");
		System.out.println(散集合);
		
		Set<Integer> 樹集合 = new TreeSet<>();
		
		for(int i=0;i<容器.size();i++) {
			樹集合.add(容器.get(i));
		}
		System.out.println("\n樹集合:本身自帶排序");
		System.out.println(樹集合);
		
		Map<String,Integer> 散字典 = new HashMap<String,Integer>();
		散字典.put("橡皮擦", 20);
		散字典.put("鉛筆", 15);
		散字典.put("原子筆", 25);
		散字典.put("修正帶", 18);
		System.out.println("\n----------散字典----------");
		System.out.println("\n取得[橡皮擦]"+散字典.get("橡皮擦"));
		
		System.out.println("\n修改[橡皮擦]");
		散字典.put("橡皮擦", 10);
		System.out.println("\n取得[橡皮擦]"+散字典.get("橡皮擦"));
		
		System.out.println("\n散字典內部狀況");
		
		for(Map.Entry<String, Integer>資料:散字典.entrySet()) {
			System.out.println("鍵:["+資料.getKey()+"]"+"→"+"值:["+資料.getValue()+"]");
		}
		
		System.out.println("\n移除[修正帶]");
		散字典.remove("修正帶");
		
		System.out.println("\n散字典內部狀況");
		
		for(Map.Entry<String, Integer>資料:散字典.entrySet()) {
			System.out.println("鍵:["+資料.getKey()+"]"+"→"+"值:["+資料.getValue()+"]");
		}
		
		
		System.out.println("\n----------樹字典----------");
		Map<String,Integer> 樹字典 = new HashMap<String,Integer>();
		樹字典.put("橡皮擦", 20);
		樹字典.put("鉛筆", 15);
		樹字典.put("原子筆", 25);
		樹字典.put("修正帶", 18);
		
		System.out.println("\n取得[橡皮擦]"+樹字典.get("橡皮擦"));
		
		System.out.println("\n修改[橡皮擦]");
		樹字典.put("橡皮擦", 10);
		System.out.println("\n取得[橡皮擦]"+樹字典.get("橡皮擦"));
		
		System.out.println("\n樹字典內部狀況");
		
		for(Map.Entry<String, Integer>資料:樹字典.entrySet()) {
			System.out.println("鍵:["+資料.getKey()+"]"+"→"+"值:["+資料.getValue()+"]");
		}
		
		System.out.println("\n移除[修正帶]");
		樹字典.remove("修正帶");
		
		System.out.println("\n樹字典內部狀況");
		
		for(Map.Entry<String, Integer>資料:樹字典.entrySet()) {
			System.out.println("鍵:["+資料.getKey()+"]"+"→"+"值:["+資料.getValue()+"]");
		}
		
		
	}
	
	static void 堆積排序(ArrayList<Integer>陣列) {
		for(int i=(陣列.size()/2)-1; i>=0;i--){
			堆積驅動(陣列, i, 陣列.size());
	    }	
		
		for(int i=陣列.size()-1;i>0;i--) {
			Collections.swap(陣列, i, 0);
			堆積驅動(陣列,0,i);
		}
	}
	
	static void 堆積驅動(ArrayList<Integer>陣列,int 根,int 長度) {
		int 左節點=2*根+1;
		int 右節點=2*根+2;
		int 最大值節點 = 根;
		if((左節點<長度)&&(陣列.get(左節點)>陣列.get(最大值節點))) {
			最大值節點 = 左節點;
		}
		if((右節點<長度)&&(陣列.get(右節點)>陣列.get(最大值節點))) {
			最大值節點 = 右節點;
		}
		if(最大值節點!=根) {
			Collections.swap(陣列, 最大值節點,根);
			堆積驅動(陣列,最大值節點,長度);
		}
	}
	
	static LinkedList<Integer>合併排序(LinkedList<Integer>串列){
		if(串列.size()<=1) {
			return 串列;
		}
		
		LinkedList<Integer>前半 = new LinkedList<>();
		LinkedList<Integer>後半 = new LinkedList<>();
		
		int 索引 = 0;
		for(;索引<串列.size()/2;索引++) {
			前半.add(串列.get(索引));
		}
		for(;索引<串列.size();索引++) {
			後半.add(串列.get(索引));
		}
		
		return 合併(合併排序(前半),合併排序(後半));
	}
	
	static LinkedList<Integer>合併(LinkedList<Integer>前半,LinkedList<Integer>後半){
		LinkedList<Integer>合併列 = new LinkedList<>();
		while((!前半.isEmpty())&&(!後半.isEmpty())) {
			if(前半.getFirst()<後半.getFirst()) {
				合併列.add(前半.removeFirst());
			}else {
				合併列.add(後半.removeFirst());
			}
		}
		
		while(!前半.isEmpty()) {
			合併列.add(前半.removeFirst());
		}
		while(!後半.isEmpty()) {
			合併列.add(後半.removeFirst());
		}
		return 合併列;
	}
}


